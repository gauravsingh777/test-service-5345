package com.miniorange.testservice5345.controller;

import com.miniorange.testservice5345.model.Animals;
import com.miniorange.testservice5345.repository.AnimalsRepository;
import com.miniorange.testservice5345.response.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("animals")
public class AnimalsController {


    @Autowired
    private AnimalsRepository animalsRepository;

    ApiResponse apiResponse = null;

    @PostMapping("/animals/create")
    public ResponseEntity<ApiResponse> saveAnimal(@RequestBody Animals animals){
        Animals response = animalsRepository.save(animals);
        apiResponse = new ApiResponse(HttpStatus.CREATED.value(), "Animal created successfully. ", response);
        return ResponseEntity.status(apiResponse.getStatusCode()).body(apiResponse);

    }

    @GetMapping("/fetchHerbivoreAnimals/{type}")
    public ResponseEntity<ApiResponse> getHerbivoreAnimals(@PathVariable String type) {
        List<Animals> herbivoreAnimals = animalsRepository.findByType(type);
        if (herbivoreAnimals.isEmpty()){
            apiResponse = new ApiResponse(HttpStatus.BAD_REQUEST.value(), "No Such Animals Found");
            return ResponseEntity.status(apiResponse.getStatusCode()).body(apiResponse);

        }

        apiResponse = new ApiResponse(HttpStatus.OK.value(), "Herbivore Animals. ", herbivoreAnimals);
        return ResponseEntity.status(apiResponse.getStatusCode()).body(apiResponse);

    }
}
