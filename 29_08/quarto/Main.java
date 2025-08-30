package quarto;

public class Main {
	public static void main(String[] args){
	Gerenciador g = new Gerenciador();
	
     g.add(new Receita("Salário",3000));
     g.add(new Despesa("Aluguel",1200));
     g.add(new Despesa("Lanche",30));
     g.listar();
     System.out.println("Saldo: R$"+g.saldo());
}
}
