package componentes;

import java.util.List;

public class MotorBarco extends Motor{

    public MotorBarco(String name, float potencia, List pistons) {
        super("Embarcação", 20, List.of("one", "two"));
    }

    @Override
    public float produzirForca() {
        return potenciaHP * 1.2f;
    }
}
