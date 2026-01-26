package exercicios;

import java.util.ArrayList;
import java.util.List;

public class OperaMapFilterReduce {

    void main() {
        int[] lista = {3, 22, 27, 35, 49, 50, 59, 84};

        int somaPar10 = efetuaMulti10(lista);
        System.out.println(somaPar10);
    }

    public int efetuaMulti10(int[] valores) {
        List<Integer> novaLista = new ArrayList<>();
        for (int valor : valores) novaLista.add(valor);
        return novaLista.stream()
                        .filter(x -> x % 2 == 0)
                        .map(x -> x * 10)
                        .reduce(0, Integer::sum);
    }
}
