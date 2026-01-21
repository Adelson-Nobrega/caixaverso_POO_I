package comparators;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MainComparatorList {

    void main() {

        List<Integer> numeros = Arrays.asList(35, 3, 21, 8, 1, 99, 31, 15);

        Comparator<Integer> crescente = (left, right) -> {
            IO.println("Comparando " + left + " e " + right);
            return left - right;
        };

        numeros.sort(crescente);
        IO.println(numeros);

        Comparator<Integer> decrescente = (left, right) -> {
            IO.println("Comparando " + right + " e " + left);
            return right - left;
        };

        numeros.sort(decrescente);
        IO.println(numeros);
    }
}
