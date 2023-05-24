package school.mjc.stage0.conditions.task3;

import java.awt.*;
import java.util.Scanner;

public class SalaryCalculator {
    public void calculateSalary(int salary) {

        if (salary <= 0){
            System.out.println("wrong input!");
            return ;
        }
        double tax = 0;
        if (salary <= 10000) {
            tax = salary * 0.15;
        } else if (salary <= 20000) {
            tax = salary * 0.18;
        } else {
            tax = salary * 0.20;
        }
        double netSalary = salary - tax;
        System.out.println(netSalary);
    }
}

