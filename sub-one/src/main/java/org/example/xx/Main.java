package org.example.xx;

public class Main {

    public static void main(String[] args) {
        String s = "hello world!";
        s.print();
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