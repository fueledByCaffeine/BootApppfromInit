package com.learning.BootApppfromInit.repositories;

import com.learning.BootApppfromInit.entities.Food;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends CrudRepository<Food, String> {
}
