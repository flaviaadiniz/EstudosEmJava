package arrays.exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class ProductArray {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos produtos quer cadastrar? ");
        int numProducts = scanner.nextInt();
        scanner.nextLine();

        Product[] products = new Product[numProducts];

        for (int i = 0; i < products.length; i++) {
            System.out.print("Nome do produto " + (i+1) + ": ");
            String productName = scanner.nextLine();

            System.out.print("Preço do produto " + (i+1) + ": ");
            double productPrice = scanner.nextDouble();
            scanner.nextLine();

            products[i] = new Product(productName, productPrice);
        }

        double sum = 0.0;
        for (int i = 0; i < products.length; i++) {
            sum += products[i].getPrice();
        }
        double avgPrice = sum / numProducts;


        System.out.println("\n| ----- PRODUTOS CADASTRADOS ----- |");
        for (Product product : products) {
            System.out.println(product);
        }

        System.out.println("A média de preço dos produtos é R$" + String.format("%.2f", avgPrice));

        scanner.close();
    }
}
