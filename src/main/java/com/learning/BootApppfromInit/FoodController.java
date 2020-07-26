package com.learning.BootApppfromInit;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/foods")
public class FoodController {

    @GetMapping
    public String getFoods(Model model){
         model.addAttribute("foods",Food.foodList);
         return "foods";
    }
}
