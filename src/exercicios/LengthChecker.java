package exercicios;

import java.util.List;
import java.util.function.Predicate;

public class LengthChecker {

    void main() {

        int min = 5;
        int max = 8;
        List<String> lista = List.of("bola", "casa", "sonho", "escola", "chuveiro", "escadaria", "telefone");

        List<String> novaLista = lista.stream()
                                      .filter(lengthInRangePredicate(min, max))
                                      .toList();
        System.out.println(novaLista);
    }

    public Predicate<String> lengthInRangePredicate(int min, int max) {
        return palavra -> palavra.length() >= min && palavra.length() <= max;
    }
}