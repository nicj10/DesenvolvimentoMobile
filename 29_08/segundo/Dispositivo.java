package segundo;

public abstract class Dispositivo {
    protected double tamanhoTela;
    protected int memoriaRAM;
    protected int armazenamento;

    public Dispositivo(double tamanhoTela, int memoriaRAM, int armazenamento) {
        this.tamanhoTela = tamanhoTela;
        this.memoriaRAM = memoriaRAM;
        this.armazenamento = armazenamento;
    }

    public void exibirDados() {
        System.out.println("----FICHA TÉCNICA----\n" +
                "Tamanho da tela: " + tamanhoTela + "\n" +
                "Memória RAM: " + memoriaRAM + "\n" +
                "Armazenamento: " + armazenamento);

    }
}
