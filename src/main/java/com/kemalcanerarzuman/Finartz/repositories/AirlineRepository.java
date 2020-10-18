package com.kemalcanerarzuman.Finartz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kemalcanerarzuman.Finartz.entities.Airline;

@Repository
public interface AirlineRepository extends JpaRepository<Airline, Integer> {

}
