package exercicios;

import java.util.function.IntUnaryOperator;
import java.util.random.RandomGenerator;

public class RandomInt {

    void main() {

        int min = 25;
        int max = 75;

        IntUnaryOperator intAleatorio = boundedRandomIntSupplier(min, max);
        System.out.println(intAleatorio.applyAsInt(0));
    }

    public IntUnaryOperator boundedRandomIntSupplier(int min, int max) {
        return num -> RandomGenerator.getDefault().nextInt(min, max + 1);
    }
}
