package interfaces.comparable.seminterface;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        String path = "C:\\Users\\ffdin\\IdeaProjects\\EstudosEmJava\\src\\interfaces\\comparable\\in.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String name = bufferedReader.readLine();
            while (name != null) {
                list.add(name);
                name = bufferedReader.readLine();
            }
            Collections.sort(list);
            for (String s : list) {
                System.out.println(s);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
