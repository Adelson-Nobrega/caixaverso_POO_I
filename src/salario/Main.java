package salario;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    void main() {

        Scanner input = new Scanner(System.in);
        boolean fim = false;
        List<Ponto> pontos = new ArrayList<>();
        String data;
        String hora;
        String opcao;

        IO.println("CALCULADORA DE SALÁRIO/n");

        while (!fim) {
            Ponto ponto = new Ponto();
            IO.print("Informe o dia trabalhado (dd/mm/yyyy): ");
            data = input.nextLine();
            ponto.setDiaTrabalhado(LocalDate.parse(data));
            IO.print("Informe a hora de entrada (hh:mm): ");
            hora = input.nextLine();
            ponto.setHoraEntrada1(LocalTime.parse(hora));
            IO.print("Informe a hora de saída para o almoço (hh:mm): ");
            hora = input.nextLine();
            ponto.setHoraSaida1(LocalTime.parse(hora));
            IO.print("Informe a hora do retorno do almoço (hh:mm): ");
            hora = input.nextLine();
            ponto.setHoraEntrada2(LocalTime.parse(hora));
            IO.print("Informe a hora de saída (hh:mm): ");
            hora = input.nextLine();
            ponto.setHoraSaida2(LocalTime.parse(hora));
            pontos.add(ponto);

            IO.print("\nDeseja informar novo dia trabalhado (S ou N)? ");
            opcao = input.next();
            if (opcao.equalsIgnoreCase("N")) {
                fim = true;
            }
        }


    }
}
