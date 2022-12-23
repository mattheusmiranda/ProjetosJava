package exsobreescrita;

public class Pessoa {
	private String nome;
	private String cpf;
	
	// construtor
	public Pessoa (String nome, String cpf) {
		this.nome = nome; 
		this.cpf = cpf;
	}
	
	// metodo
	public void imprime() {
		System.out.println("Nome: " + this.nome);
		System.out.println("CPF: " + this.cpf);
	}
}
