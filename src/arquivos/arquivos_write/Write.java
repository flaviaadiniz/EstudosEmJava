package arquivos.arquivos_write;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Write {

    public static void main(String[] args) {

        String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};

        String path = "C:\\Users\\ffdin\\Desktop\\TECH\\out.txt";

        //usando este caminho, cria o arquivo teste.txt neste arquivo (CursoProfNelio)
        String pathTeste = "C:\\Users\\ffdin\\IdeaProjects\\CursoProfNelio\\src\\ArquivosWrite\\teste.txt";

        /* O parâmetro TRUE é para sinalizar que não quero recriar o arquivo caso ele já exista, apenas
        adicionar depois do que já existe */
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
