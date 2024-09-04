package com.enviro.assessment.grad001.thinataliwe.service;

import com.enviro.assessment.grad001.thinataliwe.model.EnvironmentalData;
import com.enviro.assessment.grad001.thinataliwe.repository.EnvironmentalDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class EnvironmentalDataServiceImpl implements EnvironmentalDataService {

    private final EnvironmentalDataRepository repository;

    @Autowired
    public EnvironmentalDataServiceImpl(EnvironmentalDataRepository repository) {
        this.repository = repository;
    }

    @Override
    public EnvironmentalData saveFile(MultipartFile file) throws IOException {
        EnvironmentalData data = new EnvironmentalData(
                file.getOriginalFilename(),
                file.getContentType(),
                file.getBytes()
        );
        return repository.save(data);
    }

    @Override
    public List<EnvironmentalData> getAllFiles() {
        return repository.findAll();
    }
}
