package com.miniorange.testservice5345.handler;

import com.miniorange.testservice5345.model.Animals;
import com.miniorange.testservice5345.model.Fruits;
import com.miniorange.testservice5345.repository.FruitsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static lombok.Lombok.checkNotNull;

@Service
public class FruitsHandler {

    @Autowired
    private FruitsRepository fruitsRepository;

    public String getFruitColorByName(String name) {
        Fruits fruits = fruitsRepository.findByName(name);
       // checkNotNull(fruits, "No Such Fruit Found");
        if (fruits != null)
        {
          return fruits.getColor();
        }
        return null;
    }
}
