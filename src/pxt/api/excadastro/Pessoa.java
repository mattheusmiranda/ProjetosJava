package pxt.api.excadastro;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

//entrar na conta
public class Pessoa {

	private String nomeUsuario;
	private String cpf;
	
	public Pessoa(String nomeUsuario, String cpf) {
		this.nomeUsuario = nomeUsuario;
		this.cpf = cpf;
	}
	
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}