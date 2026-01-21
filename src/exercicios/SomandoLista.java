package exercicios;

import java.util.List;

public class SomandoLista {

    void main() {
        Integer[] valores = {3, 22, 26, 35, 49, 50, 58, 84, 88, 92, 105, 119, 185, 203};
        int soma = somaLista(valores);
        System.out.println(soma);
    }

    public static int somaLista(Integer[] array) {
        List<Integer> lista = List.of(array);
        return lista.stream()
                    .mapToInt(Integer::intValue)
                    .sum();
    }
}
