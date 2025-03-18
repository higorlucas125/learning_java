package com.mycompany.larning.java;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOfNewFunctions {

    public static void main(String[] args) {

        interateStream();
    }

    public static void filterStream() {
        List<Integer> listNew = Stream.of( 1,2, 3, 4, 5, 6, 7, 8, 9, 10)
                .filter(i -> (i % 2 == 0 ) )
                .collect(Collectors.toList());
        System.out.printf("List: %s\n", listNew);
        listNew.forEach(System.out::println);
    }

    public static void takeWhileStream (){
        List<Integer> listNew = Stream.of( 1,2, 3, 4, 5, 6, 7, 8, 9, 10)
                .takeWhile(i -> (i % 2 == 0 ) )
                .collect(Collectors.toList());
        System.out.printf("List: %s\n", listNew);
        listNew.forEach(System.out::println);
    }

    public static void dropWhileStream(){
        List<Integer> listNew = Stream.of( 1,2, 3, 4, 5, 6, 7, 8, 9, 10)
                .dropWhile(i -> (i % 2 == 0 ) )
                .collect(Collectors.toList());
        System.out.printf("List: %s\n", listNew);
        listNew.forEach(System.out::println);
    }

    public static void offNullableStream(){
        String nome = "Higor";
        Stream<String> stream = Stream.ofNullable( nome );
        stream.forEach(System.out::println);

        nome= null;
        stream = Stream.ofNullable( nome );
        stream.forEach(System.out::println);

    }

    public static void interateStream(){
        Stream.iterate(1, i -> i <= 10, i -> i * 3)
                .forEach(System.out::println);
    }
}
