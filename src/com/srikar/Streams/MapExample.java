package com.srikar.Streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Srikar on Feb, 2019
 */


//Stream map() example: We can use map() to apply functions to an stream. Let’s see how we can use it to apply upper case function to a list of Strings.
public class MapExample {

    public static void main(String[] args){
        Stream<String> names = Stream.of("kartik", "kriti", "Jane Doe", "weller", "Steve", "Jason");

        // comment any one System.out.println() and run the code.
        System.out.println(upperCaseNames(names));
        System.out.println(firstLetterCapitalize(names).stream()); //this throws java.lang.IllegalStateException: stream has already been operated upon or closed as streams are only single-use sequence of data
        // so comment out the first sout to check the next method in action

    }

    private static List<String> upperCaseNames(Stream<String> names){
       return names.map(String::toUpperCase).collect(Collectors.toList());
    }

    private static List<String> firstLetterCapitalize(Stream<String> names){
        return names.map(s -> s.toLowerCase().substring(0,1).toUpperCase() + s.substring(1)).collect(Collectors.toList());
    }
}
