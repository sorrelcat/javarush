package com.javarush.task.task38.task3811;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by sorre on 10.10.2017.
 */

@Target(value = ElementType.TYPE)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface Ticket {
    enum Priority { LOW, MEDIUM, HIGH }

    Priority priority() default Priority.MEDIUM;
    String createdBy() default "Amigo";
    String [] tags() default {};
}
