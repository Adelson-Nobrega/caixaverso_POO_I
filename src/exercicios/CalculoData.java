package exercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CalculoData {

    void main() {
        Scanner input = new Scanner(System.in);
        String data;
        int dias;
        LocalDate dataFinal;

        IO.print("Informe uma data (dd/mm/yyyy): ");
        data = input.nextLine();
        IO.print("Informe a quantidade de dias que deseja avançar: ");
        dias = input.nextInt();
        dataFinal = avancaDias(LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy")), dias);
        IO.println("Data final: " + dataFinal.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }

    public LocalDate avancaDias(LocalDate data, int dias) {
        return data.plusDays(dias);
    }
}
