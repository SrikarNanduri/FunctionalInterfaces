package com.srikar.PredicateExamples;

/**
 * Created by srikar on Feb, 2019
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

/**
 * Problem:
 * write a predicate to check whether the given collection is empty or not.
 */
public class CollectionIsEmpty {
    public static void main(String [] args){
        Predicate<Collection> predicate = Collection::isEmpty;
        List<String> strings = new ArrayList<>();
        System.out.println(predicate.test(strings)); // true
        strings.add("Hello World");
        System.out.println(predicate.test(strings)); // false
    }
}
