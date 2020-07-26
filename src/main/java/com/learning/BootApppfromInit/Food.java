package com.learning.BootApppfromInit;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
@Data
@NoArgsConstructor
public class Food {
    private String foodName;
    private String foodRating;
    static List<Food> foodList;

    public Food(String foodName, String foodRating) {
        this.foodName = foodName;
        this.foodRating = foodRating;
    }

    static {
         foodList = Arrays.asList(new Food("Nutella","5"),new Food("Ferrero Rochers","4"),new Food("Dal chawal","1"));
    }

}
