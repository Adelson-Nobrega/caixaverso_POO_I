package exercicios;

import java.util.List;

public class DobrandoLista {

    void main() {
        List<Integer> numeros = List.of(3, 22, 26, 35, 49, 50, 58, 84, 88, 105, 185, 203);

        List<Integer> listaDobrada = dobrar(numeros);
        System.out.println(listaDobrada);
    }

    public List<Integer> dobrar(List<Integer> numeros) {
        return numeros.stream()
                      .map(n -> n * 2)
                      .toList();
    }
}
