package quinto;

public class Acoes extends Base {
    double taxa;

    public Acoes(String n, double v, boolean r, double t){
        super(n,v,r);
        taxa = t;
    }

    @Override
    public double retorno(){ return valor * taxa; }
}