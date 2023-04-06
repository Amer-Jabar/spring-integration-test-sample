package org.alwaka;

import java.util.List;
import java.util.stream.Collectors;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class FoodStore {

    private final FoodRepository foodRepository;

    public List<Food> getFoods() {
        return foodRepository.findAll()
            .stream()
            .map(FoodEntity::toDomain)
            .collect(Collectors.toList());
    }

    public void createFood(Food food) {
        foodRepository.save(FoodEntity.of(food));
    }

    public void createFoods(List<Food> foodList) {
        foodRepository.saveAll(foodList
            .stream()
            .map(FoodEntity::of)
            .collect(Collectors.toList())
        );
    }
}
