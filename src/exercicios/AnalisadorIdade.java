package exercicios;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AnalisadorIdade {

    void main() {
        List<Integer> idades = List.of(14, 18, 25, 15, 22, 29, 16, 30);

        Predicate<Integer> verificador = criarVerificador();
        List<Integer> maiorIdade = remover(idades, verificador);
        System.out.println(maiorIdade);
    }

    public Predicate<Integer> criarVerificador() {
        return idade -> idade >= 18;
    }

    public List<Integer> remover(List<Integer> colecao, Predicate<Integer> verificador) {
        return colecao.stream()
                      .filter(verificador)
                      .collect(Collectors.toList());
    }
}
