package quinto;

public class Tesouro extends Base {
    double juros;

    public Tesouro(String n, double v, boolean r, double j){
        super(n,v,r);
        juros = j;
    }

    @Override
    public double retorno(){ return valor * juros; }
}

