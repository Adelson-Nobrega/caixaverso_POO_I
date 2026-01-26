package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConverteToCSV {

    void main() {
        int[] lista = {3, 22, 27, 35, 49, 50, 59, 84};
        String csv = converterParaCSV(lista);
        System.out.println(csv);
    }

    public static String converterParaCSV(int[] numeros) {
        List<Integer> novaLista = new ArrayList<>();
        for (int num : numeros) novaLista.add(num);

        return novaLista.stream()
                .map(n -> (n % 2 == 0 ? "p" : "i") + n)
                .collect(Collectors.joining(","));
    }
}
