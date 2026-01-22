package exercicios;

import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicatesFinder {

    void main() {
        Stream<Integer> lista = Stream.of(3, 26, 26, 35, 49, 49, 50, 58, 84, 88, 105, 105, 185);

        Set<Integer> duplicados = findDuplicateInStream(lista);
        System.out.println(duplicados);
    }

    public <T> Set<T> findDuplicateInStream(Stream<T> stream) {
        return stream.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                     .entrySet()
                     .stream()
                     .filter(x -> x.getValue() > 1)
                     .map(Map.Entry::getKey)
                     .collect(Collectors.toSet());
    }
}
