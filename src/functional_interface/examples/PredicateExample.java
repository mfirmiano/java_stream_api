package src.functional_interface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");

        //Cria Predicate que verifica se palavra tem mais de 5 caracteres
        Predicate<String> maiorCincoCaracteres = palavra -> palavra.length() < 5;

        //Stream para filtrar as palavras com mais de 5 caracteres
        //Imprimir cada palavra filtrada

        palavras.stream()
                .filter(maiorCincoCaracteres)
                .forEach(System.out::println);
    }
}
