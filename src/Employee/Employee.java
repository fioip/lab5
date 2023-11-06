package Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee {

    String name, email;
    int hourRate, capacity, freeDays;

    public Employee(String name, String email, int hourRate, int capacity, int freeDays) {
        this.name=name;
        this.email=email;
        this.hourRate=hourRate;
        this.capacity=capacity;
        this.freeDays=freeDays;
    }

    public int calculateDailyIncome() {
        return hourRate*capacity;
    }

    public int calculateMonthlyIncome() {
        return (20-this.freeDays)*calculateDailyIncome();
    }

    public static void main(String[] args) {
        ArrayList<Employee> employeeList = new ArrayList<Employee>();

        Scanner scanner6 = new Scanner(System.in);
        System.out.print("Number of employees: ");
        int employeeNumber = scanner6.nextInt();

        for(int i=0;i< employeeNumber;i++) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.print("Employee name: ");
            String name = scanner1.nextLine();

            Scanner scanner2 = new Scanner(System.in);
            System.out.print("Employee email: ");
            String email = scanner2.nextLine();

            Scanner scanner3 = new Scanner(System.in);
            System.out.print("Employee hour rate: ");
            int hourRate = scanner3.nextInt();

            Scanner scanner4 = new Scanner(System.in);
            System.out.print("Employee capacity: ");
            int capacity = scanner4.nextInt();

            Scanner scanner5 = new Scanner(System.in);
            System.out.print("Employee free days: ");
            int freeDays = scanner5.nextInt();

            Employee employee = new Employee(name, email, hourRate, capacity, freeDays);
            employeeList.add(employee);
        }

        for(Employee em:employeeList) {
            em.calculateMonthlyIncome();
            System.out.println("Monthly income: " + em.calculateMonthlyIncome());
        }
        
    }
}
