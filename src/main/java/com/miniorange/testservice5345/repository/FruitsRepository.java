package com.miniorange.testservice5345.repository;

import com.miniorange.testservice5345.model.Fruits;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FruitsRepository extends JpaRepository<Fruits, Long> {

    public Fruits findByName(String name);
}
