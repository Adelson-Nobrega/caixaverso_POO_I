package function;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.function.Function;

public class DateConverterToBrazil implements Function<LocalDate, String> {

    final DateTimeFormatter dataBrazil = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Override
    public String apply(LocalDate date) {
        return date.format(dataBrazil);
    }
}
