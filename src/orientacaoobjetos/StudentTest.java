package orientacaoobjetos;

import java.util.Scanner;

public class StudentTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Student's name: ");
        String name = scanner.nextLine();
        System.out.print("Grade 1: ");
        double grade1 = scanner.nextDouble();
        System.out.print("Grade 2: ");
        double grade2 = scanner.nextDouble();
        System.out.print("Grade 3: ");
        double grade3 = scanner.nextDouble();

        Student student = new Student(name, grade1, grade2, grade3);

        student.getResult();

        scanner.close();


    }

}
