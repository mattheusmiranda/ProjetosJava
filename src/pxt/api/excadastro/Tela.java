package pxt.api.excadastro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tela {
	public static void main(String[] args) {
		List<Usuario> listaUsuarios = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		Usuario user1 = new Usuario(null, null, 0);
		Usuario user2 = new Usuario(null, null, 0);
		Usuario user3 = new Usuario(null, null, 0);

		user1.setNomeUsuario("Marianna");
		user1.setCpf("252.454.854-96");
		user1.setSenha(124);
		listaUsuarios.add(user1);

		user2.setNomeUsuario("Yasmin");
		user2.setCpf("252.454.000-96");
		user2.setSenha(323);
		listaUsuarios.add(user2);

		user3.setNomeUsuario("Julia");
		user3.setCpf("252.454.111-96");
		user3.setSenha(558);
		listaUsuarios.add(user3);

		int escolha = -1;

		while (escolha != 0) {

			System.out.println("1- Entrar conta\n2- Cadastrar usuario\n3- Ver usuarios cadastrados\nR:");
			escolha = Integer.parseInt(sc.nextLine());

			if (escolha == 1) {

				System.out.println("Nome do usuario: ");
				String verificarNome = sc.nextLine();

				System.out.println("Senha: ");
				int verificarSenha = Integer.parseInt(sc.nextLine());
				Usuario logarUsuario = new Usuario(verificarNome, null, verificarSenha);

				boolean achouOUsuario = false;
				for (Usuario usuario : listaUsuarios) {
					if (usuario.getNomeUsuario().equals(verificarNome)) {
						achouOUsuario = true;
						if (usuario.getSenha() == verificarSenha) {
							System.out.println("Olá " + verificarNome);
							break;
						} else {
							System.out.println("Usuario nao foi encontrado");
							break;
						}
					}
				}
				if (!achouOUsuario) {
					System.out.println("Usuario digitado não foi encontado");
				}

			} else if (escolha == 2) {
				Usuario novoUsuario = new Usuario(null, null, 0);
				System.out.println("Inforem o nome: ");
				String nomeUsuario = sc.nextLine();
				novoUsuario.setNomeUsuario(nomeUsuario);

				System.out.println("Informe o CPF: ");
				String cpfUsuario = sc.nextLine();
				novoUsuario.setCpf(cpfUsuario);
				listaUsuarios.add(novoUsuario);

				System.out.println("Usuario cadastrado");

			} else if (escolha == 3) {
				for (Usuario list : listaUsuarios) {
					System.out.println("Usuario " + list.getNomeUsuario());
				}

			}
		}
	}

	public static void imprimir() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nome do usuario: ");
		String verificarNome = sc.nextLine();

		System.out.println("Senha: ");
		int verificarSenha = Integer.parseInt(sc.nextLine());
		Usuario logarUsuario = new Usuario(verificarNome, null, verificarSenha);

		boolean achouOUsuario = false;
		for (Usuario usuario : listaUsuarios) {
			if (usuario.getNomeUsuario().equals(verificarNome)) {
				achouOUsuario = true;
				if (usuario.getSenha() == verificarSenha) {
					System.out.println("Olá " + verificarNome);
					break;
				} else {
					System.out.println("Usuario nao foi encontrado");
					break;
				}
			}
		}
		if (!achouOUsuario) {
			System.out.println("Usuario digitado não foi encontado");

		}
	}
}
