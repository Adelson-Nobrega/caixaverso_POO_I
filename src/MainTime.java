import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class MainTime {

    void main() {
        var formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);

        var london = ZonedDateTime.now(ZoneId.of("Europe/London"));
        System.out.println(formatter.withLocale(Locale.UK).format(london));

        var australia = london.withZoneSameInstant(ZoneId.of("Australia/Sydney"));
        System.out.println(formatter.withLocale(new Locale("en", "AU")).format(australia));

        var brasil = london.withZoneSameInstant(ZoneId.of("America/Sao_Paulo"));
        System.out.println(formatter.withLocale(new Locale("pt", "BR")).format(brasil));

        var leticiaNasceu = "06/04/2009 20:45:00";
        var pessoalFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        var data = LocalDateTime.parse(leticiaNasceu, pessoalFormatter);
        System.out.println(pessoalFormatter.format(data));
    }
}