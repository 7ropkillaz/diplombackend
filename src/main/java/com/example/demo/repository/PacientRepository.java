package com.example.demo.repository;


import com.example.demo.entity.PacientDto;
import com.example.demo.entity.PacientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacientRepository extends JpaRepository<PacientEntity, Long> {
}
