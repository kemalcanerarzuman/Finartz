package com.kemalcanerarzuman.Finartz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kemalcanerarzuman.Finartz.entities.Flight;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Integer> {

}
