package exercicios;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

public class Sexta13 {

    void main() {
        Scanner input = new Scanner(System.in);
        int ano;
        int mes;

        System.out.print("Informe um ano (yyyy): ");
        ano = input.nextInt();
        System.out.print("Informe um mês (01 - 12): ");
        mes = input.nextInt();

        if (ehSexta13(ano, mes)) {
            System.out.println("É sexta-feira 13!");
        } else {
            System.out.println("Não é sexta-feira 13.");
        }
    }

    public boolean ehSexta13(int ano, int mes) {
        try {
            LocalDate data = LocalDate.of(ano, mes, 13);
            return data.getDayOfWeek().getValue() == 5;
        } catch (DateTimeException e) {
            System.out.println("Mês inválido!");
            return false;
        }
    }
}
