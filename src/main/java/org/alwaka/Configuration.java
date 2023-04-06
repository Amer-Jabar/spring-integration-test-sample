package org.alwaka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {
    @Bean
    FoodStore foodStore(@Autowired FoodRepository foodRepository) {
        return new FoodStore(foodRepository);
    }
}
