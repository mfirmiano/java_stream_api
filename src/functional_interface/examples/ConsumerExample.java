package src.functional_interface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        //Cria lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        Consumer<Integer> imprimirNumeroPar = numero ->{
            if (numero % 2 == 0){
                System.out.println(numero);
            }
        };

        numeros.forEach(imprimirNumeroPar);
    }
}
