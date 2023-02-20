package com.miniorange.testservice5345.repository;

import com.miniorange.testservice5345.model.Animals;
import com.miniorange.testservice5345.model.Fruits;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimalRepository extends JpaRepository<Animals, Long> {

    public List<Animals> findByType(String name);
}
