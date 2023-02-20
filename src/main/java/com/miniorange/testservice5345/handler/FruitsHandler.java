package com.miniorange.testservice5345.handler;

import com.miniorange.testservice5345.exception.NotFoundException;
import com.miniorange.testservice5345.model.Fruits;
import com.miniorange.testservice5345.repository.FruitsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

import static lombok.Lombok.checkNotNull;

@Service
public class FruitsHandler {

    @Autowired
    private FruitsRepository fruitsRepository;

    public String getFruitColorByName(String name) {
        Fruits fruits = fruitsRepository.findByName(name);
        if(Objects.isNull(fruits)){
            throw NotFoundException.builder().message("No Such Fruit Found").build();
        }
        return fruits.getColor();
    }
}
