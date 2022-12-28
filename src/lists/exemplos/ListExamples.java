package lists.exemplos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListExamples {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Flávia");
        nomes.add("Marcela");
        nomes.add("Angela");
        nomes.add("Roberta");
        nomes.add("Eduarda");
        nomes.add("Ana");

        //Imprimir todos os itens da lista
        for (String nome : nomes) {
            System.out.println(nome);
        }


        //Utilizar uma expressão lambda para remover nomes que começam com M:
        System.out.println("\nUsando REMOVE IF: ");
        nomes.removeIf(nome -> nome.startsWith("M"));
        for (String nome : nomes) {
            System.out.println(nome);
        }


        //Procurar o index do objeto passado como parâmetro
        System.out.println("\nUsando INDEX OF:");
        System.out.println("Index do nome Flávia: " + nomes.indexOf("Flávia"));
        System.out.println("Index do nome Eduarda: " + nomes.indexOf("Eduarda"));


        /* Criar uma nova lista que recebe o resultado de transformar a lista 'nomes' em stream e passar o filter com um
        predicate (expressão lambda que retorna true or false) */
        System.out.println("\nUsando FILTER: ");                                           //ou .toList();
        List<String> namesStartWithA = nomes.stream().filter(nome -> nome.startsWith("A")).collect(Collectors.toList());
        for (String nome : namesStartWithA) {
            System.out.println(nome);
        }


        /* Criar uma variável do tipo String que recebe o resultado de transformar a lista 'nomes' em stream, passar o
        filter com um predicate e depois localizar a primeira entrada */
        System.out.println("\nUsando FIND FIRST: ");
        String firstNameA = nomes.stream().filter(nome -> nome.startsWith("A")).findFirst().orElse(null);
        System.out.println(firstNameA);


        /* Criar uma nova lista que recebe o resultado de transformar a lista 'nomes' em stream e executar uma ação em
        cada item da lista (neste caso, passar todos para upper case) */
        System.out.println("\nUsando MAP:");
        List<String> namesUpperCase = nomes.stream().map(nome -> nome.toUpperCase()).toList();
        for (String nome : namesUpperCase) {
            System.out.println(nome);
        }

    }


}
