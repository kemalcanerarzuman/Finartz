package com.kemalcanerarzuman.Finartz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kemalcanerarzuman.Finartz.entities.Route;

@Repository
public interface RouteRepository extends JpaRepository<Route, Integer> {

}
