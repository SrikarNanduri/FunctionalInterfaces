package com.srikar.Streams.IntermediateOperations;


import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Srikar on Feb, 2019
 */

//  flatMap() is used when we have a List of List<T> and we need a single List containing elements of all the member lists.
public class FlatMapExample {

    public static void main(String [] args){
        List<Integer> a = Arrays.asList(1, 2, 3);
        List<Integer> b = Arrays.asList(4, 5);
        List<Integer> c = Arrays.asList(6, 7, 8);

        List<List<Integer>> listOfListofInts = Arrays.asList(a, b, c);

        System.out.println("Before flattening : " + listOfListofInts);

        List<Integer> listofInts = listOfListofInts.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        System.out.println("After flattening  : " + listofInts);

    }

}
