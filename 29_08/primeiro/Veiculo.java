package primeiro;
public abstract class Veiculo {
    protected int qtdeRodas;
    protected String modelo;
    protected String marca;

    public Veiculo(int qtdeRodas, String modelo, String marca) {
        this.qtdeRodas = qtdeRodas;
        this.modelo = modelo;
        this.marca = marca;
    }

    protected Veiculo() {
    }

    public void exibirDados() {
        System.out.print("Veiculo com " + qtdeRodas + " e Modelo " + modelo + " da marca " + marca);
    }

}