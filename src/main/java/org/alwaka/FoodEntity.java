package org.alwaka;

import java.time.Instant;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
public class FoodEntity {
    @Id
    @Column
    @GeneratedValue
    UUID id;

    @Column
    String name;

    @Column
    String category;

    @Column
    Instant createdAt;

    @Column
    String description;

    public static FoodEntity of(Food food) {
        return new FoodEntity(
            null,
            food.name,
            food.category,
            Instant.now(),
            food.description
        );
    }

    public Food toDomain() {
        return new Food(id, name, category, createdAt, description);
    }
}
