package implement.embarcacoes;

import componentes.Motor;

public class BarcoAMotor extends Barco{

    private Motor motor;

    public BarcoAMotor(String cor, float tamanho, int lugares, Motor motor) {
        super(cor, tamanho, lugares);
        this.motor = motor;
    }

    @Override
    public void navegar() {

    }
}
