package org.example.xx;

import java.util.ArrayList;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        String s = "hello world!";
        final String print = s.print("dasdasd");
        final String s2 = s.print1(s1 -> s1 + "ddddd");
        System.out.println(print);
        final ArrayList<String> strings = new ArrayList<>();
        strings.toArray().toList();
        final Object o = new Object();
        var x ="dddd";
        System.out.println();
        System.out.println(String.lineSeparator());
        int hour = 15;
// Simple variable access with '$'
        String result = "The hour is $hour"; // Yes!!!
// Use expressions with '${}'
        result = "It is ${hour > 12 ? hour-12 : hour} o'clock";
        System.out.println(result);
    }

}