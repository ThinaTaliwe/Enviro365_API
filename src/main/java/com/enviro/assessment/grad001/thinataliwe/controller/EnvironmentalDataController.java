package com.enviro.assessment.grad001.thinataliwe.controller;

import com.enviro.assessment.grad001.thinataliwe.model.EnvironmentalData;
import com.enviro.assessment.grad001.thinataliwe.service.EnvironmentalDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/v1/environment")
public class EnvironmentalDataController {

    private final EnvironmentalDataService service;

    @Autowired
    public EnvironmentalDataController(EnvironmentalDataService service) {
        this.service = service;
    }

    @PostMapping("/upload")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
        try {
            service.saveFile(file);
            return ResponseEntity.status(HttpStatus.CREATED).body("File uploaded successfully!");
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("File upload failed: " + e.getMessage());
        }
    }

    @GetMapping("/files")
    public ResponseEntity<List<EnvironmentalData>> getAllFiles() {
        List<EnvironmentalData> files = service.getAllFiles();
        return ResponseEntity.ok(files);
    }
}
