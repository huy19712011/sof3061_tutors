package org.example.sof3061_tutors.streamApi;

import java.util.List;

public class SlicingDemo {

    public static void main(String[] args) {

        // limit()
        // skip()
        // takeWhile()
        // dropWhile()

        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 30)
        );

        //
        movies.stream()
                .limit(2)
                .forEach(movie -> System.out.println(movie.getTitle())); // a b

        //
        movies.stream()
                .skip(2)
                .forEach(movie -> System.out.println(movie.getTitle())); // c

        //
        movies.stream()
                .takeWhile(movie -> movie.getLikes() < 30)
                .forEach(movie -> System.out.println(movie.getTitle())); // a b

        //
        movies.stream()
                .dropWhile(movie -> movie.getLikes() < 20)
                .forEach(movie -> System.out.println(movie.getTitle())); // b c

    }
}
