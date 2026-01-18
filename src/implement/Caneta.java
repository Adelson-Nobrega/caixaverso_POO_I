package implement;

import componentes.UtensilioDeEscrita;

public class Caneta extends UtensilioDeEscrita {

    @Override
    public void write(String text) {
        System.out.println(text);
    }

}
