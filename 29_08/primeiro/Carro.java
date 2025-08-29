package primeiro;

public class Carro extends Veiculo{
    private int numPortas;
    private String tipoCombustivel;

    public Carro(int qtdeRodas, String modelo, String marca, int numPortas, String tipoCombustivel) {
        super(qtdeRodas, modelo, marca);
        this.numPortas = numPortas;
        this.tipoCombustivel = tipoCombustivel;
    }

    @Override
    public void exibirDados() {
        System.out.println("Carro modelo " + modelo + " da marca " + marca + " com " + numPortas + " e movido à " + tipoCombustivel);
    }
}
