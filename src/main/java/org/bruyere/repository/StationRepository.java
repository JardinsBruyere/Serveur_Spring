package org.bruyere.repository;

import org.bruyere.entity.Station;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StationRepository extends JpaRepository<Station,Integer> {
}
