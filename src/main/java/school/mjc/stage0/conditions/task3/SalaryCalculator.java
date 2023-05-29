package school.mjc.stage0.conditions.task3;


public class SalaryCalculator {
    public void calculateSalary(int salary) {

        if (salary < 0) {
            System.out.println("wrong input!");
            return;
        }
        double taxes;

        if (salary <= 10000 && salary > 0) {
            taxes = salary * 0.15;
        } else if (salary <= 20000 && salary > 10000) {
            taxes = salary * 0.18;
        } else {
            taxes = salary * 0.20;
        }

        // Calculate the net salary
        double netSalary = salary - taxes;

        // Print the net salary
        System.out.println(netSalary);
    }
}

