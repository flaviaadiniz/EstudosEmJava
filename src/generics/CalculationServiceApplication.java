package generics;

import java.util.Arrays;
import java.util.List;

public class CalculationServiceApplication {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(4, 10, 20, 9, 87, 3);
        System.out.println(CalculationService.max(integerList));


        List<String> stringList = Arrays.asList("Flávia", "Marcela", "Angela", "Eduarda");
        System.out.println(CalculationService.max(stringList));



    }

}
