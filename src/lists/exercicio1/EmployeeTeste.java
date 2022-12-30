package lists.exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class EmployeeTeste {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("- SISTEMA DE CADASTRO DE FUNCIONÁRIOS - ");
        System.out.print("Quantos funcionários deseja cadastrar? ");
        int numEmployees = scanner.nextInt();

        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Funcionário #" + (i + 1) + ": ");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("NOME: ");
            String name = scanner.nextLine();
            System.out.print("SALÁRIO: ");
            double salary = scanner.nextDouble();

            employees.add(new Employee(id, name, salary));
        }


        Employee tempEmployee;
        do {
            System.out.print("\nDigite o ID do funcionário que receberá um aumento salarial: ");
            int idForRaise = scanner.nextInt();

            tempEmployee = employees.stream().filter(emp -> emp.getId() == idForRaise).findFirst().orElse(null);

            if (tempEmployee == null) {
                System.out.println("Este ID não existe!");
            }
        } while (tempEmployee == null);


        System.out.print("Qual a porcentagem do aumento salarial? ");
        double raisePercentage = scanner.nextDouble();
        tempEmployee.raiseSalary(raisePercentage);


        System.out.println(" ");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        scanner.close();
    }

}
