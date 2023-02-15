package com.miniorange.testservice5345.controller;

import com.miniorange.testservice5345.handler.FruitsHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("fruits")
public class FruitsController {

    @Autowired
    private FruitsHandler fruitsHandler;

    @GetMapping("/fetchColorByName")
    public ResponseEntity<String> getFruitColorByName(String name) {
        String fruitColor = fruitsHandler.getFruitColorByName(name);
        return ResponseEntity.ok().body(fruitColor);
    }
}
