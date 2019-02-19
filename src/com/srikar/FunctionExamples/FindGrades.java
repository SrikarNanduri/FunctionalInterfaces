package com.srikar.FunctionExamples;

/**
 * Created by srikar on Feb, 2019
 */

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/**
 *  Problem:
 *  Program to find Student Grade by using Function:
 */

public class FindGrades {

    public static void main(String [] args) {
        Map<String, Integer> studentsAndMarks = new HashMap<>();

        studentsAndMarks.put("Student1", 90);
        studentsAndMarks.put("Student2", 70);
        studentsAndMarks.put("Student3", 40);

        Function<Integer, String> function = string -> {
            String grade = null;

                if (string > 80) {
                    grade = "A Grade";

                } else if (string > 60) {
                    grade = "B Grade";

                } else if (string > 30) {
                    grade = "C Grade";

                } else {
                    grade = "Failed";
                }

            return grade;
        };

        for(Map.Entry<String, Integer> entry : studentsAndMarks.entrySet()) {

         /* Result :
            Grade of Student3 is C Grade
            Grade of Student1 is A Grade
            Grade of Student2 is B Grade */

            System.out.println("Grade of " + entry.getKey() + " is " + function.apply(entry.getValue()));
        }
    }
}
