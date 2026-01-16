package function;

import java.time.LocalDate;
import java.util.function.Predicate;

public class DateFilter implements Predicate<LocalDate> {

    final LocalDate teste = LocalDate.of(2020, 12, 31);

    @Override
    public boolean test(LocalDate date) {
        return date.isAfter(teste);
    }
}
