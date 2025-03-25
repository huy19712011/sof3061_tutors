package org.example.sof3061_tutors.streamApi;

import java.util.Comparator;
import java.util.List;

public class SortingDemo {

    public static void main(String[] args) {

        List<Movie> movies = List.of(
                new Movie("b", 10),
                new Movie("a", 20),
                new Movie("c", 30)
        );

        //
        movies.stream()
                .sorted((a, b) -> a.getTitle().compareTo(b.getTitle()))
                .forEach(movie -> System.out.println(movie.getTitle()));

        //
        movies.stream()
                .sorted(Comparator.comparing(movie -> movie.getTitle()))
                .forEach(movie -> System.out.println(movie.getTitle()));

        //
        movies.stream()
                .sorted(Comparator.comparing(Movie::getTitle))
                .forEach(movie -> System.out.println(movie.getTitle()));

    }

}
