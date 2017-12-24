package com.dev.SpringBootMysql.repository;

import com.dev.SpringBootMysql.model.Vehicule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehiculeRepository extends JpaRepository<Vehicule, Integer> {
}
