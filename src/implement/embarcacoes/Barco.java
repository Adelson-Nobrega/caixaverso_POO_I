package implement.embarcacoes;

public abstract class Barco {

    private String cor;
    private float tamanho;
    private int lugares;
    private float velocidadeAtual;

    public Barco(String cor, float tamanho, int lugares) {
        this.cor = cor;
        this.tamanho = tamanho;
        this.lugares = lugares;
        velocidadeAtual = 0;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    public int getLugares() {
        return lugares;
    }

    public void setLugares(int lugares) {
        this.lugares = lugares;
    }

    public float getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public abstract void navegar();
}
