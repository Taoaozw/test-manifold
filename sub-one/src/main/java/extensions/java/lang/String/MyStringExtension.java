package extensions.java.lang.String;

import manifold.ext.rt.api.Extension;
import manifold.ext.rt.api.This;

@Extension
public class MyStringExtension {

    public static void print(@This String thiz) {
        System.out.println("hello world!");
    }

    @Extension
    public static String lineSeparator() {
        return System.lineSeparator();
    }

}