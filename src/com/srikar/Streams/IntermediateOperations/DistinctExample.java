package com.srikar.Streams.IntermediateOperations;

/**
 * Created by Srikar on Feb, 2019
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
* distinct() does not take any argument and returns the distinct elements in the stream, eliminating duplicates.
* It uses the equals() method of the elements to decide whether two elements are equal or not:
*/

public class DistinctExample {
    public static void main(String [] args){
        List<Integer> intList = Arrays.asList(2, 5, 3, 2, 4, 3);
        List<Integer> distinctIntList = intList.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctIntList);
    }
}
