package com.demo.aspectprogramming.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation enables a method to only be executed as a read-only transaction if read-only config is turned on.
 * Logic for this annotation lies in AspectConfiguration.java
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface EnableReadOnlyTransaction {
    boolean readOnly() default true;
}
