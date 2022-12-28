package orientacaoobjetos;

import java.util.Scanner;

public class EmployeeTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Gross salary: ");
        double grossSalary = scanner.nextDouble();

        System.out.print("Tax (in percentage): ");
        double tax = scanner.nextDouble();

        Employee employee = new Employee(name, grossSalary, tax);
        employee.getNetSalary();
        System.out.println(employee);

        System.out.print("Which percentage to increase salary? ");
        double percentage = scanner.nextDouble();
        employee.increaseSalary(percentage);
        System.out.println(employee);

        scanner.close();

    }

}
