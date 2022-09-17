package com.moascode.beyondjava8.java9;

import java.util.List;
import java.util.stream.Stream;

public final class StreamBreak {
    private static final List<Integer> NUMBERS = Stream.of(1, 4, 6, 2, 10, 9, 8, 5, 7, 3).sorted().toList();

    static void skipLimit() {
        List<Integer> result = NUMBERS.stream()
                .skip(2)
                .limit(5)
                .toList();
        System.out.println("Limit: " + result);
    }

    static void takeWhile() {
        List<Integer> result = NUMBERS.stream()
                .takeWhile(n -> n < 5)
                .toList();
        System.out.println("TakeWhile: " + result);
    }

    static void dropWhile() {
        List<Integer> result = NUMBERS.stream()
                .dropWhile(n -> n < 5)
                .toList();
        System.out.println("DropWhile: " + result);
    }
}
