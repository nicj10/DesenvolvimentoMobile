package primeiro;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro(4, "Classic", "Chevrolet", 2, "Gas");
        Moto moto = new Moto(2, "Pop 100", "Honda", "Vermelha", 125);

        carro.exibirDados();
        moto.exibirDados();
    }
}
