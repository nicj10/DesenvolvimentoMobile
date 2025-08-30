package quinto;

import java.util.*;

public class Ger {
    List<Investimento> lista = new ArrayList<>();

    void add(Investimento i){ lista.add(i); }

    double total(){
        double s = 0;
        for(Investimento i:lista) s += i.retorno();
        return s;
    }

    void revisar(){
        for(Investimento i:lista)
            if(i.revisao())
                System.out.println("⚠ Revisar: " + ((Base)i).nome);
    }
}

