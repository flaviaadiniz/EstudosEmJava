package generics;

import java.util.Scanner;

public class PrintServiceApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        PrintService<Integer> printService = new PrintService<>();

        System.out.print("Quantos números? ");
        int nInt = scanner.nextInt();

        for (int i = 0; i < nInt; i++) {
            System.out.print("Valor " + (i+1) + ": ");
            int value = scanner.nextInt();
            printService.addValue(value);
        }

        printService.print();
        System.out.println("Primeiro valor: " + printService.getFirst());


        System.out.println();


        PrintService<String> printService1 = new PrintService<>();

        System.out.print("Quantas palavras? ");
        int nString = scanner.nextInt();

        for (int i = 0; i < nString; i++) {
            System.out.print("Palavra " + (i+1) + ": ");
            String value = scanner.next();
            printService1.addValue(value);
        }

        printService1.print();
        System.out.println("Primeiro valor: " + printService1.getFirst());

        scanner.close();

    }


}
