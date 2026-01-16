package salario;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public class Ponto {

    final static double valorHora = 20.00;

    private LocalDate diaTrabalhado;
    private LocalTime horaEntrada1;
    private LocalTime horaSaida1;
    private LocalTime horaEntrada2;
    private LocalTime horaSaida2;
    private double totalHoras;

    public Ponto() {
        totalHoras = 0.00;
    }

    public LocalDate getDiaTrabalhado() {
        return diaTrabalhado;
    }

    public void setDiaTrabalhado(LocalDate diaTrabalhado) {
        this.diaTrabalhado = diaTrabalhado;
    }

    public LocalTime getHoraEntrada1() {
        return horaEntrada1;
    }

    public void setHoraEntrada1(LocalTime horaEntrada1) {
        this.horaEntrada1 = horaEntrada1;
    }

    public LocalTime getHoraSaida1() {
        return horaSaida1;
    }

    public void setHoraSaida1(LocalTime horaSaida1) {
        this.horaSaida1 = horaSaida1;
    }

    public LocalTime getHoraEntrada2() {
        return horaEntrada2;
    }

    public void setHoraEntrada2(LocalTime horaEntrada2) {
        this.horaEntrada2 = horaEntrada2;
    }

    public LocalTime getHoraSaida2() {
        return horaSaida2;
    }

    public void setHoraSaida2(LocalTime horaSaida2) {
        this.horaSaida2 = horaSaida2;
    }

}
