package pxt.api.excadastro;

//cadastrar pessoas
public class Usuario extends Pessoa{
	
	private int senha;

	public Usuario(String nomeUsuario, String cpf, int senha) {
		super(nomeUsuario, cpf);
		this.senha = senha;
	}
	
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}

}