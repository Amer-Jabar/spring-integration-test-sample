package org.alwaka;

import java.util.List;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class FoodController {

    private final FoodStore foodStore;

    @GetMapping("/foods")
    public List<Food> getFoods() {
        return foodStore.getFoods();
    }

    @PostMapping("/foods")
    public void createFood(@RequestBody @Valid Food food) {
        foodStore.createFood(food);
    }

}
