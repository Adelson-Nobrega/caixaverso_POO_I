package exercicios;

import java.util.List;
import java.util.stream.Collectors;

public class FiltroNegativos {

    void main() {
        List<Integer> numeros = List.of(-3, 22, -26, 35, -49, 50, -58, 0, 84, -119, -185, 203);
        List<Integer> semNegativos = removerNegativos(numeros);
        System.out.println(semNegativos);
    }

    public List<Integer> removerNegativos(List<Integer> numeros) {
        return numeros.stream()
                      .filter(n -> n >= 0)
                      .collect(Collectors.toList());
    }
}