package exercicios.comparaPreco;

public class Celular {

    private Double preco;

    public Celular(Double preco) {
        this.preco = preco;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Preco = R$ " + preco;
    }
}
