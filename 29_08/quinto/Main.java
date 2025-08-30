package quinto;

public class Main {
    public static void main(String[] args){
        Ger g = new Ger();
        g.add(new Acoes("Petrobras",10000,true,0.1));
        g.add(new FII("XPTO11",5000,false,0.02));
        g.add(new Tesouro("Selic",2000,false,0.12));

        System.out.println("Retorno total: " + g.total());
        g.revisar();
    }
}

