package segundo;

public class Celular extends Dispositivo {
    final int bateria;
    final String marca;
    final String modelo;

    public Celular(double tamanhoTela, int memoriaRAM, int armazenamento, int bateria, String marca, String modelo) {
        super(tamanhoTela, memoriaRAM, armazenamento);
        this.bateria = bateria;
        this.marca = marca;
        this.modelo = modelo;
    }
    @Override
    public void exibirDados() {
        System.out.println("----CELULAR----\n" + "Modelo: " + modelo + "\n" +
        "Marca: " + marca + "\n" +
        "Bateria: " + bateria + " mAh\n" +
        "Tamanho da tela: " + tamanhoTela + " polegadas\n" +
        "Mémoria RAM: " + memoriaRAM + "\n" +
        "Mémoia ROM: " + armazenamento + "GB");
    }
}
