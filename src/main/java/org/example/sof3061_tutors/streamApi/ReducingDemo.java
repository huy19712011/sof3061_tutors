package org.example.sof3061_tutors.streamApi;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ReducingDemo {

    public static void main(String[] args) {

        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 30)
        );

        // simple
        // complex

        //
        movies.stream()
                .count();

        //
        movies.stream()
                .anyMatch(movie -> movie.getLikes() > 20); // true

        //
        movies.stream()
                .allMatch(movie -> movie.getLikes() > 20); // false

        //
        movies.stream()
                .noneMatch(movie -> movie.getLikes() > 20); // false

        // min, max
        Movie movie = movies.stream()
                .max(Comparator.comparing(Movie::getLikes))
                .get();
        System.out.println(movie);

        // complex
        //
         // 10 20 30
        // 30 30
        // 60
        Optional<Integer> sum = movies.stream()
                .map(movie1 -> movie1.getLikes())
                .reduce((a, b) -> a + b);
        System.out.println(sum.orElse(0)); //60

    }
}
