package com.enviro.assessment.grad001.thinataliwe.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class EnvironmentalData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String fileName;
    private String fileType;

    @Lob
    private byte[] fileData;

    public EnvironmentalData(String fileName, String fileType, byte[] fileData) {
        this.fileName = fileName;
        this.fileType = fileType;
        this.fileData = fileData;
    }
}
