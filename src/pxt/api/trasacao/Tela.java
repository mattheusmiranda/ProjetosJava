package pxt.api.trasacao;

import java.util.ArrayList;
import java.util.Scanner;

public class Tela extends Usuario {

	public Tela(String nome, int numeroDaConta, double saldo, int senhaConta) {
		super(nome, numeroDaConta, saldo, senhaConta);
	}

	public static void main(String[] args) {

		ArrayList<Usuario> conta = new ArrayList<>();
		String conta1 = "Luz";
		double conta1Valor = 297.00;
		String conta2 = "Água";
		double conta2Valor = 87.00;

		Scanner sc = new Scanner(System.in);
		Usuario pai = new Usuario("Leandro", 704, 70000.00, 225);
		Usuario filho1 = new Usuario("Julio", 258, 700.00, 336);
		Usuario filho2 = new Usuario("Marianna", 332, 800.00, 447);

		conta.add(pai);
		conta.add(filho1);
		conta.add(filho2);

		System.out.println("--------------M BANCO--------------");

		System.out.println("Qual o numero da conta?");
		int entrada = sc.nextInt();

		for (Usuario verificarNumeroConta : conta) {
			if (verificarNumeroConta.getNumeroDaConta() == entrada) {
				System.out.println("Olá " + verificarNumeroConta.getNome()); // ajustar
				System.out.println("Saldo: " + verificarNumeroConta.getSaldo());
				break;
			} else {
				System.out.println("Conta nao encontrada");
			}
		}

		System.out.println("[1]Pagar Contas\n[2]Transferir");
		int opcaoOperacao = sc.nextInt();

		if (opcaoOperacao == 1) {
			System.out.println(
					"Contas para pagar: " + "\n" + conta1 + ": " + conta1Valor + "\n" + conta2 + ": " + conta2Valor);
			System.out.println("Qual conta quer pagar? ");
			String contaParaPagar = sc.next();

			while (contaParaPagar != conta1 && contaParaPagar != conta2) {
				if (contaParaPagar.equalsIgnoreCase(conta1)) {
					System.out.println("Digite a senha para efetuar o pagamento: ");
					int verificarSenha = sc.nextInt();

					for (Usuario verificarSenhaUsuario : conta) {
						if (verificarSenhaUsuario.getSenhaConta() == verificarSenha) {
							verificarSenhaUsuario.setTransferir(conta1Valor);
							System.out.println(verificarSenhaUsuario.getTransferir());
							break;
						} else {
							System.out.println("Senha invalida");
						}
					}

				} else if (contaParaPagar.equalsIgnoreCase(conta2)) {
					System.out.println("Digite a senha para efetuar o pagamento: ");
					int verificarSenha2 = sc.nextInt();

					for (Usuario verificarSenhaUsuario : conta) {
						if (verificarSenhaUsuario.getSenhaConta() == verificarSenha2) {
							verificarSenhaUsuario.setTransferir(conta2Valor);
							break;
						} else {
							System.out.println("Senha invalida");
						}
					}
				}
			}
		}

		System.out.println("Qual o numero da conta para transferencia? ");
		int respostaTransferencia = sc.nextInt();

		for (Usuario transferencia : conta) {
			if (transferencia.getNumeroDaConta() == respostaTransferencia) {
				System.out.println("Qual o valor da transferencia?");
				double valTransferencia = sc.nextDouble();
				transferencia.setTransferir(valTransferencia);

			}
		}

	}

}