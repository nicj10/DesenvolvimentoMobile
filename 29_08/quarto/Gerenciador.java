package quarto;
import java.util.*;

public class Gerenciador {
    List<Transacao> lista = new ArrayList<>();

    void add(Transacao t){ lista.add(t); }
    double saldo(){
        double s=0;
        for(Transacao t:lista)
            s += t.isDespesa()? -t.getValor() : t.getValor();
        return s;
    }
    void listar(){
        for(Transacao t:lista)
            System.out.println((t.isDespesa()?"Despesa":"Receita")+
                               ": "+t.getDescricao()+" R$"+t.getValor());
    }
}
