package org.alwaka;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<FoodEntity, UUID> {
}
