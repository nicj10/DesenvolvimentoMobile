package terceiro;

public class ContatoProfissional implements Contato {
	private String telefone;
	private String nomeContato;
	private String empresa;
	
	public ContatoProfissional(String nomeContato, String telefone, String empresa) {
		this.nomeContato = nomeContato;
		this.telefone = telefone;
		this.empresa = empresa;
	}
	
	@Override
	public void ligar() {
		System.out.println("Ligando para " + this.nomeContato);
	}
	@Override
	public void adicionarContato(String nome, String numero) {
		System.out.print("Contato de " + nome + " adicionado com sucesso \n" + "Número salvo: " + numero);
	}

	@Override
	public void excluirContato() {
		System.out.print("Contato de " + this.nomeContato + " excluído com sucesso!");
		
	}

	@Override
	public void mostrarDados() {
		System.out.print("Nome: " + this.nomeContato + "\n" + "Contato: " + this.telefone + "\n" + "Empresa: " + this.empresa);
		
	}

}
