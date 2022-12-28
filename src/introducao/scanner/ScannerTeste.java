package introducao.scanner;

import java.util.Scanner;

public class ScannerTeste {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numInt = scanner.nextInt();
        System.out.println("O número digitado é: " + numInt);

        System.out.print("Digite um número real: ");
        double numReal = scanner.nextDouble();
        System.out.println("O número digitado é: " + numReal);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.next();
        System.out.println("A palavra digitada é: " + palavra);

        System.out.print("Digite uma letra: ");
        char letra = scanner.next().charAt(0);
        System.out.println("A letra digitada é: " + letra);

        System.out.print("Digite uma frase: ");
        scanner.nextLine(); //este nextLine consome a quebra de linha deixada na resposta anterior
        String frase = scanner.nextLine();
        System.out.println("A frase digitada é: " + frase);


    }

}
