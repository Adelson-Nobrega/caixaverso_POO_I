package exercicios;

import java.util.ArrayList;
import java.util.List;

public class OperaMapFilterSorted {

    void main() {
        int[] lista = {35, 22, 17, 39, 4, 50, 19, 63};

        int[] listaOrdenada = ordenaMulti3(lista);
        System.out.println(listaOrdenada);
    }

    public int[] ordenaMulti3(int[] valores) {
        List<Integer> novaLista = new ArrayList<>();
        for (int valor : valores) novaLista.add(valor);
        return novaLista.stream()
                        .map(x -> x * 3)
                        .sorted()
                        .mapToInt(Integer::intValue)
                        .toArray();
    }
}
