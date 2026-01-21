package comparators;

import java.util.Arrays;
import java.util.List;

public class MainCalculoNumerosInteiros {

    void main() {

        List<Integer> numeros = Arrays.asList(35, 21, 8, 1, 99, 31, 15);

        Integer acumulador = 0;
        for (Integer numero : numeros) {
            acumulador += numero;
        }
        System.out.println("Soma dos números: " + acumulador);

        numeros.stream()
                .reduce(Integer::sum)
                .ifPresent(soma -> System.out.println("Soma dos números: " + soma));
    }
}
