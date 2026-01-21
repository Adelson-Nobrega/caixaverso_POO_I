package exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OrdenaLista {

    void main() {
        List<Integer> numeros = Arrays.asList(35, 21, 8, 1, 99, 31, 15);
        List<Integer> ordenada = ordenarListaComLambda(numeros);
        System.out.println(ordenada);
    }

    public static List<Integer> ordenarListaComLambda(List<Integer> array) {
        return array.stream()
                    .sorted((i1, i2) -> i1 - i2)
                    .collect(Collectors.toList());
    }
}
