package com.miniorange.testservice5345.handler;

import com.miniorange.testservice5345.model.Animals;
import com.miniorange.testservice5345.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalHandler {

    @Autowired
    private AnimalRepository animalRepository;

    public Animals createRecord(Animals animals){
        return animalRepository.save(animals);
    }

    public List<Animals> find(String type){
        return animalRepository.findByType(type);
    }
}
