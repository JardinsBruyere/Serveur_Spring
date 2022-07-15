package org.bruyere.repository;

import org.bruyere.entity.SensorReading;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SensorReadingRepository extends JpaRepository<SensorReading,Integer> {
}
