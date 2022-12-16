package pxt.api.estoqueprodutos;

import java.util.ArrayList;
import java.util.Scanner;

import pxt.api.gestaoestoque.Produto;

public class Tela {
	public static void main(String[] args) {

		ArrayList<Informaçoes> Produtos = new ArrayList<>();
		ArrayList<String> ListaCidades = new ArrayList<>();
		ArrayList<String> ListaProdutos = new ArrayList<>();
		ArrayList<Double> ListaPreços = new ArrayList<>();
		ArrayList<Integer> ListaCodigo = new ArrayList<>();

		Scanner sc = new Scanner(System.in);

		ListaProdutos.add("Memoria ram 8gb");
		ListaProdutos.add("Gabinete");
		ListaProdutos.add("Placa mãe");
		ListaProdutos.add("processador ryzen 5");

		ListaPreços.add(110.90);
		ListaPreços.add(300.00);
		ListaPreços.add(889.90);
		ListaPreços.add(990.90);

		ListaCodigo.add(704);
		ListaCodigo.add(898);
		ListaCodigo.add(127);
		ListaCodigo.add(153);

		ListaCidades.add("Belo Horizonte");
		ListaCidades.add("São Paulo");
		ListaCidades.add("Brasilia");

		// MENU/ESCOLHA DE PRODUTO
		System.out.println("---------NOSSOS PRODUTOS---------\n");

		System.out.println("Produto 1: " + ListaProdutos.get(0) + "\ncodigo: " + ListaCodigo.get(0) + "\nPreço: "
				+ ListaPreços.get(0) + "\n");
		System.out.println("Produto 2: " + ListaProdutos.get(1) + "\ncodigo: " + ListaCodigo.get(1) + "\nPreço: "
				+ ListaPreços.get(1) + "\n");
		System.out.println("Produto 3: " + ListaProdutos.get(2) + "\ncodigo: " + ListaCodigo.get(2) + "\nPreço: "
				+ ListaPreços.get(2) + "\n");
		System.out.println("Produto 4: " + ListaProdutos.get(3) + "\ncodigo: " + ListaCodigo.get(3) + "\nPreço: "
				+ ListaPreços.get(3) + "\n");

		System.out.println("Codigo do produto para enviar para o cliente: ");
		int codigoProdutoParaEnvio = sc.nextInt();
		Informaçoes codProduto = new Informaçoes();
		codProduto.setCodigoProduto(codigoProdutoParaEnvio);

		switch (codigoProdutoParaEnvio) {
		case 704: {
			// break;
		}
		case 898: {
			// break;
		}
		case 127: {
			// break;
		}
		case 153: {
			// break;
		}
		default:
			// System.out.println("Produto inexistente");

			// EXPECIFICAÇÕES DO PEDIDO

			System.out.println("\nQuantos produtos são? ");
			int quantidadeProduto = sc.nextInt();
			Informaçoes numeroDeProdutos = new Informaçoes();
			numeroDeProdutos.setQtddProdutos(quantidadeProduto);

			System.out.println("\nCidades em que entregamos: ");
			System.out.println(ListaCidades);
			System.out.println("\nQual a cidade para o envio? ");
			String cidadeParaEnvio = sc.next();

			if (ListaCidades.contains(cidadeParaEnvio)) {
				System.out.println("Valor do frete: 80.00"); // ver com o maske mais opçoes de frete
			} else {
				System.out.println("Nao enviamos para essa cidade");
			}

			if (quantidadeProduto >= 4) {
				if (codigoProdutoParaEnvio == ListaCodigo.get(0)) {
					double valTotal1 = ListaPreços.get(0) * numeroDeProdutos.getQtddProdutos();
					double desc1 = valTotal1 * (15 / 100);
					System.out.println("Valor com desconto: " + desc1);
				} else if (codigoProdutoParaEnvio == ListaCodigo.get(1)) {
					double valTotal1 = ListaPreços.get(1) * numeroDeProdutos.getQtddProdutos();
					double desc1 = valTotal1 * (15 / 100);
					System.out.println("Valor com desconto: " + desc1);
				} else if (codigoProdutoParaEnvio == ListaCodigo.get(2)) {
					double valTotal1 = ListaPreços.get(2) * numeroDeProdutos.getQtddProdutos();
					double desc1 = valTotal1 * (15 / 100);
					System.out.println("Valor com desconto: " + desc1);
				} else {
					double valTotal1 = ListaPreços.get(3) * numeroDeProdutos.getQtddProdutos();
					double desc1 = valTotal1 * (15 / 100);
					System.out.println("Valor com desconto: " + desc1);
				}
			}
			System.out.print(notaFiscal(codProduto));

		}
	}
	

	public static void notaFiscal(Informaçoes produto) {
		System.out.println("Produto: " + produto.getNomeProduto());
		System.out.println("Quantidade em estoque: " + produto.getQtddProdutos());
		System.out.println("Data de criação: " + produto.getDataPedido());
		System.out.println("Codigo: " + produto.getCodigoProduto());
		System.out.println("Valor total: "  );

	}
	
}

/*
 * package pxt.api.estoqueprodutos;
 * 
 * import java.util.ArrayList; import java.util.Scanner;
 * 
 * public class Tela { public static void main(String[] args) {
 * 
 * ArrayList<Informaçoes> Produtos = new ArrayList<>(); ArrayList<String>
 * ListaCidades = new ArrayList<>();
 * 
 * Scanner sc = new Scanner(System.in);
 * 
 * Informaçoes Produto1 = new Informaçoes(); Informaçoes Produto2 = new
 * Informaçoes(); Informaçoes Produto3 = new Informaçoes(); Informaçoes Produto4
 * = new Informaçoes();
 * 
 * Produto1.setNomeProduto("Memoria ram 8gb"); Produto1.setPreco(110.90);
 * Produto1.setCodigoProduto(704); Produtos.add(Produto1);
 * 
 * 
 * Produto2.setNomeProduto("Gabinete"); Produto2.setPreco(300.00);
 * Produto2.setCodigoProduto(898); Produtos.add(Produto2);
 * 
 * Produto3.setNomeProduto("Placa mãe"); Produto3.setPreco(889.90);
 * Produto3.setCodigoProduto(127); Produtos.add(Produto3);
 * 
 * Produto4.setNomeProduto("processador ryzen 5"); Produto4.setPreco(990.90);
 * Produto4.setCodigoProduto(153); Produtos.add(Produto4);
 * 
 * ListaCidades.add("Belo Horizonte"); ListaCidades.add("São Paulo");
 * ListaCidades.add("Brasilia");
 * 
 * 
 * // MENU/ESCOLHA DE PRODUTO
 * System.out.println("---------NOSSOS PRODUTOS---------\n");
 * 
 * System.out.println("Produto 1: " + Produto1.getNomeProduto() + "\ncodigo: " +
 * Produto1.getCodigoProduto() + "\nPreço: " + Produto1.getPreco() + "\n" );
 * System.out.println("Produto 2: " + Produto2.getNomeProduto() + "\ncodigo: " +
 * Produto2.getCodigoProduto() + "\nPreço: " + Produto2.getPreco() + "\n" );
 * System.out.println("Produto 3: " + Produto3.getNomeProduto() + "\ncodigo: " +
 * Produto3.getCodigoProduto() + "\nPreço: " + Produto3.getPreco() + "\n");
 * System.out.println("Produto 4: " + Produto4.getNomeProduto() + "\ncodigo: " +
 * Produto4.getCodigoProduto() + "\nPreço: " + Produto4.getPreco() + "\n");
 * 
 * System.out.println("Codigo do produto para enviar para o cliente: "); int
 * codigoProdutoParaEnvio = sc.nextInt(); Informaçoes codProduto = new
 * Informaçoes(); codProduto.setCodigoProduto(codigoProdutoParaEnvio);
 * 
 * switch (codigoProdutoParaEnvio) { case 704: { break; } case 898: { break; }
 * case 127: { break; } case 153: { break; } default:
 * System.out.println("Produto inexistente"); }
 * 
 * // EXPECIFICAÇÕES DO PEDIDO
 * 
 * System.out.println("\nQuantos produtos são? "); int quantidadeProduto =
 * sc.nextInt(); Informaçoes numeroDeProdutos = new Informaçoes();
 * numeroDeProdutos.setQtddProdutos(quantidadeProduto);
 * 
 * System.out.println("\nCidades em que entregamos: ");
 * System.out.println(ListaCidades);
 * System.out.println("\nQual a cidade para o envio? "); String cidadeParaEnvio
 * = sc.next();
 * 
 * if(ListaCidades.contains(cidadeParaEnvio)) {
 * System.out.println("Valor do frete: 80.00"); // ver com o maske mais opçoes
 * de frete } else { System.out.println("Nao enviamos para essa cidade"); } } }
 */