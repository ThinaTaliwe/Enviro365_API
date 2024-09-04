package com.enviro.assessment.grad001.thinataliwe.service;

import com.enviro.assessment.grad001.thinataliwe.model.EnvironmentalData;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface EnvironmentalDataService {
    EnvironmentalData saveFile(MultipartFile file) throws IOException;
    List<EnvironmentalData> getAllFiles();
}
