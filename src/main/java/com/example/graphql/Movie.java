package com.example.graphql;

import java.util.Arrays;
import java.util.List;

public record Movie (String id, String title, int duration, String directorId) {

    private static List<Movie> movies = Arrays.asList(
            new Movie("movie-1", "Inception", 148, "director-1"),
            new Movie("movie-2", "The Matrix", 136, "director-2"),
            new Movie("movie-3", "Interstellar", 169, "director-1")
    );

    public static Movie getById(String id) {
        return movies.stream()
                .filter(movie -> movie.id().equals(id))
                .findFirst()
                .orElse(null);
    }
}
