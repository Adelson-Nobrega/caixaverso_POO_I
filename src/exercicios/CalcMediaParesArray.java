package exercicios;

import java.util.stream.Stream;

public class CalcMediaParesArray {

    void main() {
        Integer[] valores = {3, 22, 26, 35, 49, 50, 58, 84, 88, 92, 105, 119, 185, 203};
        double media = calculaMediaPares(valores);
        System.out.println(media);
    }

    public static double calculaMediaPares(Integer[] input) {
        Stream<Integer> stream = Stream.of(input);
        return stream.filter(n -> n % 2 == 0)
                     .mapToInt(Integer::intValue)
                     .average()
                     .orElse(0);
    }
}
