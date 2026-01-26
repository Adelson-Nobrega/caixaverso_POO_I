package exercicios.fluentInterface;

public class CriaEmail {

    void main() {

        Email email = Email.builder()
                           .from("ana@mail.com")
                           .to("maria@mail.com")
                           .subject("Boas vindas")
                           .body("Olá Maria!")
                           .build();
    }
}
