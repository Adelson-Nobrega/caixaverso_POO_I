package exercicios;

import java.util.List;
import java.util.stream.Collectors;

public class NomesToMaisculas {

    void main() {
        List<String> nomesErrados = List.of("joão", "Maria", "daVI", "PALOMA", "LEtícia");
        List<String> nomesCorrigidos = corrigir(nomesErrados);
        System.out.println(nomesCorrigidos);
    }

    public List<String> corrigir(List<String> nomes){
        return nomes.stream()
                    .map(String::toUpperCase)
                    .collect(Collectors.toList());
    }
}
