package com.enviro.assessment.grad001.thinataliwe.repository;

import com.enviro.assessment.grad001.thinataliwe.model.EnvironmentalData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface EnvironmentalDataRepository extends JpaRepository<EnvironmentalData, UUID> {
}
