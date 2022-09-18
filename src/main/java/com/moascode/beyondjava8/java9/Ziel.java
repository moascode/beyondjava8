package com.moascode.beyondjava8.java9;

public class Ziel {
    public static void main(String ... args) {
        System.out.println("--------------------Immutable Collection--------------------");
        ImmutableCollection.iList();
        ImmutableCollection.iSet();
        ImmutableCollection.iMap();
        System.out.println("--------------------Stream API limit/skip/takeWhile/dropWhile--------------------");
        StreamBreak.skipLimit();
        StreamBreak.takeWhile();
        StreamBreak.dropWhile();
        StreamBreak.ofNullable();
    }
}
