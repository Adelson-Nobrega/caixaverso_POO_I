package veiculos.embarcacoes;

public class BarcoAVela extends Barco{

    private float medVento;
    private int velas;

    public BarcoAVela(String cor, float tamanho, int lugares, float medVento, int velas) {
        super(cor, tamanho, lugares);
        this.medVento = medVento;
        this.velas = velas;
    }

    @Override
    public void navegar() {
        
    }
}
