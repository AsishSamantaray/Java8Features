package com.asish.java8.lambda.functionalinterface;

/* Functional interfaces are new additions in java 8
 * which permit exactly one abstract method inside them.
 */
@FunctionalInterface
public interface Drawable {
    void draw();

//    void msg();     // Not Allowed in @FunctionalInterface.
}
