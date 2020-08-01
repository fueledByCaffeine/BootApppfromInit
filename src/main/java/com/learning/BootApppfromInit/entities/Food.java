package com.learning.BootApppfromInit.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Arrays;
import java.util.List;

@Component
@Data
@NoArgsConstructor
@Entity
@Table(name="FOOD")
public class Food {

    @Id
    @GeneratedValue
    @Column(name="FOOD_ID")
    private String foodID;

    @Column(name = "FOOD_NAME")
    private String foodName;

    @Column(name = "FOOD_RATING")
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
