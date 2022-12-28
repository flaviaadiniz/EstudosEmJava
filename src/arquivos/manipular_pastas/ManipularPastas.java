package arquivos.manipular_pastas;

import java.io.File;
import java.util.Scanner;

public class ManipularPastas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome da pasta: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        //cria um array de Files com arquivos que sejam diretórios (pastas)
        File[] folders = path.listFiles(File::isDirectory);
        for (File folder : folders) {
            System.out.println(folder);
        }

        //cria um array de Files com arquivos que sejam files (arquivos)
        File[] files = path.listFiles(File::isFile);
        for (File file : files) {
            System.out.println(file);
        }

        boolean success = new File(strPath + "\\teste").mkdir();
        System.out.println("Directory successfully created: " + success);

        sc.close();
    }
}
