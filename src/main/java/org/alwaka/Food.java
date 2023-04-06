package org.alwaka;

import java.time.Instant;
import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Food {
    UUID id;
    @NotNull
    String name;
    @NotNull
    String category;
    Instant createdAt;
    @NotNull
    String description;
}
