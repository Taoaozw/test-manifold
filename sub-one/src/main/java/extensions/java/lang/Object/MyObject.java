package extensions.java.lang.Object;

import manifold.ext.rt.api.Extension;
import manifold.ext.rt.api.Self;
import manifold.ext.rt.api.This;

import java.util.function.Predicate;

@Extension
public class MyObject {

    @Extension
    public static @Self Object foobar(Predicate<@Self Object> constraints) {
        // todo test thisClass
        System.out.println("hi");
        return null;
    }

    public static void mapX(@This Object thiz) {
        System.out.println("dasdassda");
    }

}