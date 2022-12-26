package pxt.api.trasacao;

public class Usuario {
	private String nome;
	private int numeroDaConta;
	private double saldoAtual;
	private double transferir;
	private int senhaConta;

	public Usuario(String nome,int numeroDaConta, double saldo,int senhaConta) {
		this.nome = nome;
		this.numeroDaConta = numeroDaConta;
		this.saldoAtual = saldo;
		this.senhaConta = senhaConta;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	public double getSaldo() {
		return saldoAtual;
	}

	public void setSaldo(double saldo) {
		this.saldoAtual = saldo;
	}
	
	
	public double getTransferir() {
		return transferir;
	}

	public void setTransferir(double transferir) {
		System.out.println("Saldo: ");
		this.transferir = saldoAtual - transferir;
	}
	
	public double getSaldoAtual() {
		return saldoAtual;
	}

	public void setSaldoAtual(double saldoAtual) {
		this.saldoAtual = saldoAtual;
	}

	public int getSenhaConta() {
		return senhaConta;
	}

	public void setSenhaConta(int senhaConta) {
		this.senhaConta = senhaConta;
	}

}
