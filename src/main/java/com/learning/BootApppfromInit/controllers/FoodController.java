package com.learning.BootApppfromInit.controllers;

import com.learning.BootApppfromInit.entities.Food;
import com.learning.BootApppfromInit.services.FoodServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("/foods")
public class FoodController {
    private final FoodServices foodServices;

    @Autowired
    FoodController(FoodServices foodServices){
        this.foodServices = foodServices;
    }

    @GetMapping
    public String getFoods(Model model){
        ArrayList<Food> foodArrayList = new ArrayList<>();
         foodServices.getAllFoods().forEach(foodArrayList ::add);
         model.addAttribute("foods",foodArrayList);
         return "foods";
    }
}
