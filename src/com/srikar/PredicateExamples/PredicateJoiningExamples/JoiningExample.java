package com.srikar.PredicateExamples.PredicateJoiningExamples;

import java.util.function.Predicate;

/**
 * Created by srikar on Feb, 2019
 */
public class JoiningExample {
    public static void main(String [] args){
        int[] array = {0, 5, 10, 15, 20, 25, 30, 35, 40, 45};
        Predicate<Integer> predicate1 = i -> i > 10;
        Predicate<Integer> predicate2 = i -> i % 2 == 0;
        System.out.println("Greater than 10: ");
        method(predicate1, array);
        System.out.println("Even numbers: ");
        method(predicate2, array);

        //negate()
        System.out.println("Less than 10");
        method(predicate1.negate(), array);

        //and()
        System.out.println("Both greater than 10 and even: ");
        method(predicate1.and(predicate2), array);

        //or()
        System.out.println("Greater than 10 or even");
        method(predicate1.or(predicate2), array);

    }

    private static void method(Predicate<Integer> predicate, int[] array){
        for (int num: array) {
            if(predicate.test(num)){
                System.out.println(num);
            }
        }
    }
}
