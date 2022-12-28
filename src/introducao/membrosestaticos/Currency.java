package introducao.membrosestaticos;

import java.util.Scanner;

public class Currency {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o valor do dólar hoje? ");
        double dollarOfTheDay = scanner.nextDouble();

        System.out.println("Quantos dólares deseja comprar? ");
        double dollarAmount = scanner.nextDouble();

        System.out.println(CurrencyConverter.convertToReal(dollarOfTheDay, dollarAmount));


        scanner.close();
    }

}
