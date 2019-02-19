package com.srikar.SupplierExamples;

import java.util.function.Supplier;

/**
 * Created by Srikar on Feb, 2019
 */
public class GenerateRandomName {

    public  static void main(String [] args){
        Supplier<String> supplier = () -> {
            String[] arrayOfNames = {"Jane", "Vennesa", "Jake", "santiago"};
            int random = (int) (Math.random()*4);
            return arrayOfNames[random];
        };

        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
    }
}
