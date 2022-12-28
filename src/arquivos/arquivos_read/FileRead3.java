package arquivos.arquivos_read;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//igual ao Arquivo2 mas menos verboso!

public class FileRead3 {

    public static void main(String[] args) {

        String path = "C:\\Users\\ffdin\\Desktop\\TECH\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

}