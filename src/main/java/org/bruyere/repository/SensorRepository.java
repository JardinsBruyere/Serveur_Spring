package org.bruyere.repository;

import org.bruyere.entity.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SensorRepository extends JpaRepository<Sensor, Integer> {
}
