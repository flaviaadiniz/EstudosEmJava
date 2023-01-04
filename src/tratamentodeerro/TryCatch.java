package tratamentodeerro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite nomes: ");
        String[] nomes = scanner.nextLine().split(" ");


        try {
            System.out.print("Digite a posição do nome que deseja ver: ");
            int posicao = scanner.nextInt();
            System.out.println(nomes[posicao]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Esta posição não existe!");
        } catch (InputMismatchException e) {
            System.out.println("O valor digitado deve ser um número!");
        }

        System.out.println("Fim do programa!");

        scanner.close();

    }

}
