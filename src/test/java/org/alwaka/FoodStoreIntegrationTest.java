package org.alwaka;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FoodStoreIntegrationTest {

    @Autowired
    private FoodStore foodStore;

    @Test
    void shouldGetFoods() {
        // given
        final var food = new Food(
            null,
            "Pepperoni Pizza",
            "Italian Food",
            null,
            "Some food"
        );
        foodStore.createFoods(List.of(food, food, food));

        // when
        final var foods = foodStore.getFoods();

        // then
        Assertions.assertThat(foods).hasSize(3);
        Assertions.assertThat(foods).allSatisfy(anyFood -> {
            Assertions.assertThat(anyFood.getId()).isNotNull();
            Assertions.assertThat(anyFood.getName()).isNotNull();
            Assertions.assertThat(anyFood.getCategory()).isNotNull();
            Assertions.assertThat(anyFood.getCreatedAt()).isNotNull();
        });
    }
}
