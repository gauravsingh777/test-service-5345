package com.miniorange.testservice5345.repository;

import com.miniorange.testservice5345.model.Animals;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimalsRepository extends JpaRepository<Animals, Long> {
    List<Animals> findByType(String type);
}
