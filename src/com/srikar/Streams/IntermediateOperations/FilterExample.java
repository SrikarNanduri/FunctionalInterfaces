package com.srikar.Streams.IntermediateOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Srikar on Feb, 2019
 */
public class FilterExample {

    public static void main(String [] args){

        withOutStreams(initData());
        withStreams(initData());

    }

    private static void withStreams(List<String> randomNames) {

        List<String> startsWithK = randomNames.stream().filter(s -> s.substring(0,1).equalsIgnoreCase("k")).collect(Collectors.toList());

        startsWithK.stream().forEach(System.out::println);

    }


    private static void withOutStreams(List<String> randomNames){

        List<String> startsWithS = new ArrayList<>();

        for(String names : randomNames){
            if(names.substring(0, 1).equalsIgnoreCase("s")){
                startsWithS.add(names);
            }
        }

        for (String name : startsWithS)
        System.out.println(name);

    }

    private static List<String> initData(){
        List<String> randomNames = new ArrayList<>();
        randomNames.add("Kartik");
        randomNames.add("kriti");
        randomNames.add("Jane");
        randomNames.add("rich");
        randomNames.add("sam");
        randomNames.add("peter");
        randomNames.add("Samantha");

        return randomNames;
    }
}
