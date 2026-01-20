import java.util.*;
import java.util.stream.*;

public class AulaStreams {

    void main() {

//        var array = new String[] { "com", "Jesus", "serei", "salvo" };
//        var resultado = "";
//        for (var s: array) resultado = resultado + s + " ";
//        System.out.println(resultado);

        Stream<String> stream = Stream.of("c", "a", "s", "a");
        String palavra = stream.reduce("", (s, c) -> s + c);
        System.out.println(palavra);

        Stream<String> stream2 = Stream.of("b", "o", "l", "a");

        StringBuilder palavra2 = stream2.collect(
                StringBuilder::new,
                StringBuilder::append,
                StringBuilder::append);
        System.out.println(palavra2);

        Stream<String> stream3 = Stream.of("b", "o", "l", "a");
        TreeSet<String> set = stream3.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(set);

        Stream<String> stream4 = Stream.of("w", "o", "l", "f");
        Set<String> set2 = stream4.collect(Collectors.toSet());
        System.out.println(set2);

        Stream<Integer> s = Stream.iterate(1, n -> n + 1);
        s.skip(3)
                .limit(2)
                .forEach(System.out::println);

        Stream<String> s1 = Stream.of("mao", "gaiola", "bobo");
        s1.map(String::length)
                .forEach(System.out::println);

        Stream<Integer> num = Stream.of(95, 24, 85, 3, 15, 7, 185, 22);
        num.sorted(Comparator.reverseOrder()).forEach(System.out::println);

        var lista = List.of("Tony", "Andrea", "Lucas", "Alan", "Igor");
        lista.stream()
                .filter(n -> n.length() == 4)
                .sorted()
                .limit(2)
                .forEach(System.out::println);

        Stream<String> objStream = Stream.of("penguin", "fish");
        IntStream intStream = objStream.mapToInt(String::length);
        intStream.forEach(System.out::println);

        LongStream longs = LongStream.of(15, 10);
        long soma = longs.sum();
        System.out.println(soma);
        DoubleStream doubles = DoubleStream.generate(() -> Math.PI);
        //OptionalDouble min = doubles.min();

        IntStream ints = IntStream.of(95, 24, 85, 3, 15, 7, 185, 22);
        var dif = range(ints);
        IO.println(dif);

//        var compras = Stream.of("feijao", "arroz", "agua");
//        Double media = compras
//                .filter(s2 -> s2.length() > 4)
//                .collect(Collectors.averagingInt(String::length));
//        System.out.println(media);

        var compras = Stream.of("feijao", "arroz", "agua");
        TreeSet<String> resultado = compras
                .filter(s2 -> s2.startsWith("a"))
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(resultado);
    }

    private static int range(IntStream ints) {
        IntSummaryStatistics stats = ints.summaryStatistics();
        if (stats.getCount() == 0) throw new RuntimeException();
        return stats.getMax()-stats.getMin();
    }
}
