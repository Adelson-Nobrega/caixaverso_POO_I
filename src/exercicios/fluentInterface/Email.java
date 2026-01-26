package exercicios.fluentInterface;

import java.util.ArrayList;
import java.util.List;

public class Email {

    public String sender;
    public List<String> receivers = new ArrayList<>();
    public String subject = "";
    public String body = "";

    private Email() { }

    public String getSender() {
        return sender;
    }

    public List<String> getReceivers() {
        return receivers;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public static Email builder() {
        return new Email();
    }

    public Email from(String sender) {
        this.sender = sender;
        return this;
    }

    public Email to(String receiver) {
        this.receivers.add(receiver);
        return this;
    }

    public Email subject(String subject) {
        this.subject = subject;
        return this;
    }

    public Email body(String body) {
        this.body = body;
        return this;
    }

    public Email build() {
        System.out.println(this);
        return this;
    }

    @Override
    public String toString() {
        return "Email \n" +
                " De: " + sender + '\n' +
                " Para: " + receivers + '\n' +
                " Assunto: " + subject + '\n' +
                " Mensagem: " + body;
    }
}
