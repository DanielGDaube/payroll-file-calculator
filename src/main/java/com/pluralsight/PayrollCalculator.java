package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;

public class PayrollCalculator {
    public static void main(String[] args)  {

        try {
            BufferedReader employeeReader = new BufferedReader(new FileReader("employees.csv"));
            employeeReader.readLine();

            String line;

            while ((line = employeeReader.readLine()) != null) {
                String[] tokens = line.split("\\|");
                int id = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                double hours = Double.parseDouble(tokens[2]);
                double pay = Double.parseDouble(tokens[3]);

                Employee employee = new Employee(id, name, hours, pay);

                System.out.printf("%s, %s: $%.2f %n",
                        employee.getEmployeeId(), employee.getName(), employee.getGrossPay());
            }

        }
        catch (Exception e){
            System.out.println("Something went wrong");

        }
    }
}
