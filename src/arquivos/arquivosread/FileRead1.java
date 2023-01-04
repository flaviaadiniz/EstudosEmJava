package arquivos.arquivosread;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileRead1 {

    public static void main(String[] args) {

        //o caminho pode ser criado em uma String ou passado como argumento no new File().
        String caminhoDoArquivo = "C:\\Users\\ffdin\\Desktop\\TECH\\in.txt";

        File arquivo = new File(caminhoDoArquivo);

        Scanner scanner = null;

        try {
            scanner = new Scanner(arquivo);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

    }

}

