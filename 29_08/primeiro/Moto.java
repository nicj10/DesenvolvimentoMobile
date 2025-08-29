package primeiro;

public class Moto extends Veiculo {
    private String cor;
    private int cilindradas;

    public Moto(int qtdeRodas, String modelo, String marca, String cor, int cilindradas) {
        super(qtdeRodas, modelo, marca);
        this.cor = cor;
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibirDados() {
        System.out.println("Moto linda na cor " + cor + " com " + cilindradas + " cilindradas. Tá no precinho!!!");
    }
}
