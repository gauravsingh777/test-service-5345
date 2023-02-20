package com.miniorange.testservice5345.controller;

import com.miniorange.testservice5345.handler.AnimalHandler;
import com.miniorange.testservice5345.handler.FruitsHandler;
import com.miniorange.testservice5345.model.Animals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("animals")
public class AnimalController {

    @Autowired
    private AnimalHandler animalHandler;

    @PostMapping("/create")
    public ResponseEntity<Animals> create(@RequestBody Animals name) {
        animalHandler.createRecord(name);
        return ResponseEntity.ok(animalHandler.createRecord(name));
    }

    @PostMapping("/find/{type}")
    public ResponseEntity<List<Animals>> find(@PathVariable String type) {
        return ResponseEntity.ok(animalHandler.find(type));
    }
}
