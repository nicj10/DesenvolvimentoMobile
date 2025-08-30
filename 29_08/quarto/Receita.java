package quarto;

public class Receita implements Transacao {
    private String desc; 
    private double valor;
    public Receita(String d, double v){
    	desc=d;
    	valor=v;}
    
    public String getDescricao(){
    	return desc;
    	}
    public double getValor(){
    	return valor;
    	}
    public boolean isDespesa(){
    	return false;
    	}
}