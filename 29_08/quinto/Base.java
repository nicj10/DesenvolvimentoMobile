package quinto;

public abstract class Base implements Investimento {
    String nome;
    double valor;
    boolean rev;

    Base(String n, double v, boolean r){
        nome = n;
        valor = v;
        rev = r;
    }

    @Override
    public boolean revisao(){ return rev; }
}
