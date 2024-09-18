package com.example.graphql;

import java.util.Arrays;
import java.util.List;

public record Director (String id, String firstName, String lastName) {

    private static List<Director> directors = Arrays.asList(
            new Director("director-1", "Christopher", "Nolan"),
            new Director("director-2", "Lana", "Wachowski"),
            new Director("director-3", "Quentin", "Tarantino")
    );

    public static Director getById(String id) {
        return directors.stream()
                .filter(director -> director.id().equals(id))
                .findFirst()
                .orElse(null);
    }
}
