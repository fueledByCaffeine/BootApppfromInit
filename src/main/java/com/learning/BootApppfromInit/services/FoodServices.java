package com.learning.BootApppfromInit.services;

import com.learning.BootApppfromInit.entities.Food;
import com.learning.BootApppfromInit.repositories.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodServices {
    private final FoodRepository foodRepository;

    @Autowired
    FoodServices(FoodRepository foodRepository){
        this.foodRepository = foodRepository;
    }

    public Iterable<Food> getAllFoods(){
        return foodRepository.findAll();
    }
}
