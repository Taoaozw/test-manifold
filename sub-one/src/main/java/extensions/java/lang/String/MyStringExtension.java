package extensions.java.lang.String;

import manifold.ext.rt.api.Extension;
import manifold.ext.rt.api.Self;
import manifold.ext.rt.api.This;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

@Extension
public class MyStringExtension {

    public static String print(@This String thiz, String age) {

        System.out.println("hello world!");
        System.out.println(age);
        return thiz + "ddddd";
    }

    public static String print1(@This String thiz, Function<String, String> constraints) {
        System.out.println("hello world!");
        return constraints.apply(thiz);
    }

    public static <T, R> R map1(@This T thiz, Function<T, R> predicate) {
        return predicate.apply(thiz);
    }


    @Extension
    public static String lineSeparator() {
        return System.lineSeparator();
    }




}