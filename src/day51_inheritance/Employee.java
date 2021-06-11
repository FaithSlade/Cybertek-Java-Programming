package day51_inheritance;

public class Employee { //parent class
    String jobTitle;

    public double calculateSalary(double hourlyRate){
        return 52 * 40 * hourlyRate * 1.1;
    }
}
