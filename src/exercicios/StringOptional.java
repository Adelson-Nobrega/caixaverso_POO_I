package exercicios;

import java.util.Optional;

public class StringOptional {

    void main() {

        String[] palavras = {"bola", "", "casa", "carro", "    ", "flamengo"};
        for (String palavra : palavras) {
            System.out.println(optionalOfString(palavra));
        }
    }

    public Optional<String> optionalOfString(String text) {
        return text.isEmpty() ? Optional.empty() : Optional.of(text);
    }
}
