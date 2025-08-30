package quinto;

public class FII extends Base {
    double rend;

    public FII(String n, double v, boolean r, double rendM){
        super(n,v,r);
        rend = rendM;
    }

    @Override
    public double retorno(){ return valor * rend * 12; }
}
