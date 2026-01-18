package exercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CalcDifAnos {

    void main() {
        Scanner input = new Scanner(System.in);
        String inicio;
        String fim;
        int anos;

        IO.print("Informe a data de inicio (dd/mm/yyyy): ");
        inicio = input.nextLine();
        IO.print("Informe a data fim (dd/mm/yyyy): ");
        fim = input.nextLine();
        anos = obterDiferencaEmAnos(inicio, fim);

        IO.println("A diferença entre as datas é de " + anos + " anos.");
    }

    public static int obterDiferencaEmAnos(String inicio, String fim) {
        LocalDate dataInicio = LocalDate.parse(inicio, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate dataFim = LocalDate.parse(fim, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        if (dataFim.getMonth().getValue() < dataInicio.getMonth().getValue()) {
            return dataFim.getYear() - dataInicio.getYear() - 1;
        }
        return dataFim.getYear() - dataInicio.getYear();
    }
}
