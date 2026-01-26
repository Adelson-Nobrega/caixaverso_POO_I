package exercicios.comparaPreco;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class AnalisadorDePrecos {

    void main() {

        Orcamento orcamento = new Orcamento(2800.00, 1300.00);

        List<Celular> celPesquisa = new ArrayList<>();
        celPesquisa.add(new Celular(1280.00));
        celPesquisa.add(new Celular(1925.00));
        celPesquisa.add(new Celular(2675.00));
        celPesquisa.add(new Celular(2930.00));

        List<Celular> celOrcamento = new ArrayList<>();

        celPesquisa.forEach(celular ->
                Optional.ofNullable(celular)
                        .filter(cabeNoOrcamento(orcamento))
                        .ifPresent(celOrcamento::add));

        System.out.println("Celulares que cabem no orçamento: " + celOrcamento);
    }

    public Predicate<Celular> cabeNoOrcamento(Orcamento orc) {
        return celular -> celular.getPreco() >= orc.getMin() && celular.getPreco() <= orc.getMax();
    }
}
