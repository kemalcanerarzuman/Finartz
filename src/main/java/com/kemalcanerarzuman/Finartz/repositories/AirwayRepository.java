package com.kemalcanerarzuman.Finartz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kemalcanerarzuman.Finartz.entities.Airway;

@Repository
public interface AirwayRepository extends JpaRepository<Airway, Integer> {

}
