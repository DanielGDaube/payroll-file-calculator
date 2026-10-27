package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class PayrollCalculator {
    public static void main(String[] args) throws FileNotFoundException {

        try {
            BufferedReader employeeReader = new BufferedReader(new FileReader("employees.csv"));
        }
        catch (Exception e){
            System.out.println("Something went wrong");

        }
    }
}
