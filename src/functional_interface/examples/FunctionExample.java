package src.functional_interface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {
    public static void main(String[] args) {
        //Cria lista de números int
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        //Usa Function com lambda para dobrar todos os números
        Function<Integer, Integer> dobrar = numero -> numero *2;

        //Usa função para dobrar todos os números no Stream e armazená-los em outra lista
        List<Integer> numerosDobrados = numeros.stream()
                .map(dobrar)
                .collect(Collectors.toList());

        //Imprimir a lista de números dobrados
        numerosDobrados.forEach(System.out::println);
    }
}
