package componentes;

import java.util.List;

public class Motor16 extends Motor{

    public Motor16() {
        super("componentes.Motor 1.6", 120, List.of("one", "two", "three", "four"));
    }

    @Override
    public float produzirForca() {
        return potenciaHP * 1.8f;
    }
}
