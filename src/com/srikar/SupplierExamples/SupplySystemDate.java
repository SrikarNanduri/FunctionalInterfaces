package com.srikar.SupplierExamples;

import java.util.Date;
import java.util.function.Supplier;

/**
 * Created by Srikar on Feb, 2019
 */
public class SupplySystemDate {

    public static void main(String[] args){
        Supplier<Date> supplier = Date::new;

        System.out.println(supplier.get());
        System.out.println(supplier.get());
    }
}
