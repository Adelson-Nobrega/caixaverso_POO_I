package componentes;

import java.util.List;

public abstract class Motor {

    private String name;
    private Boolean start;
    float potenciaHP;
    private List pistons;

    public Motor(
            String name,
            float potencia,
            List pistons
    ) {
        this.name = name;
        this.potenciaHP = potencia;
        this.pistons = pistons;
        this.start = false;
    }

    public String getName() {
        return name;
    }

    public void setStart(Boolean start) {
        this.start = start;
    }

    public Boolean getStart() {
        return start;
    }

    public List getPistons() {
        return pistons;
    }

    public abstract float produzirForca();

    @Override
    public String toString() {
        return "componentes.Motor{" +
                "name='" + name + '\'' +
                ", start=" + start +
                ", pistons=" + pistons +
                '}';
    }
}
