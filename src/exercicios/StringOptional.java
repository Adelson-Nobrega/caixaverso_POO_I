package exercicios;

import java.util.Optional;

public class StringOptional {

    void main() {

    }

    public Optional<String> optionalOfString(String text) {
        return text.isEmpty() ? Optional.empty() : Optional.of(text);
    }
}
