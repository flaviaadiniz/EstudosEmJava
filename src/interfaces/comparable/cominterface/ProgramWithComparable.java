package interfaces.comparable.cominterface;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProgramWithComparable {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        String path = "C:\\Users\\ffdin\\IdeaProjects\\EstudosEmJava\\src\\interfaces\\comparable\\in2.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String employeeCsv = bufferedReader.readLine();
            while (employeeCsv != null) {
                String[] fields = employeeCsv.split(",");
                list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                employeeCsv = bufferedReader.readLine();
            }
            Collections.sort(list);
            for (Employee emp : list) {
                System.out.println(emp.getName() + ", " + emp.getSalary());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
