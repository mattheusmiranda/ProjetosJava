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

		Informaçoes Produto1 = new Informaçoes();
		Informaçoes Produto2 = new Informaçoes();
		Informaçoes Produto3 = new Informaçoes();
		Informaçoes Produto4 = new Informaçoes();

		Produto1.setNomeProduto("Memoria ram 8gb");
		Produto1.setPreco(110.90);
		Produto1.setCodigoProduto(704);
		ListaCodigo.add(Produto1.getCodigoProduto());
		
		Produto2.setNomeProduto("Gabinete");
		Produto2.setPreco(300.00);
		Produto2.setCodigoProduto(898);
		ListaCodigo.add(Produto2.getCodigoProduto());

		Produto3.setNomeProduto("Placa mãe");
		Produto3.setPreco(889.90);
		Produto3.setCodigoProduto(127);
		ListaCodigo.add(Produto3.getCodigoProduto());

		Produto4.setNomeProduto("Processador ryzen 5");
		Produto4.setPreco(990.90);
		Produto4.setCodigoProduto(153);
		ListaCodigo.add(Produto4.getCodigoProduto());

		ListaCidades.add("Belo Horizonte");
		ListaCidades.add("São Paulo");
		ListaCidades.add("Brasilia");
		
		// MENU/ESCOLHA DE PRODUTO
		System.out.println("---------NOSSOS PRODUTOS---------\n");

		System.out.println("Produto 1: " + Produto1.getNomeProduto() + "\ncodigo: " + Produto1.getCodigoProduto()
				+ "\nPreço: " + Produto1.getPreco() + "\n");
		System.out.println("Produto 2: " + Produto2.getNomeProduto() + "\ncodigo: " + Produto2.getCodigoProduto()
				+ "\nPreço: " + Produto2.getPreco() + "\n");
		System.out.println("Produto 3: " + Produto3.getNomeProduto() + "\ncodigo: " + Produto3.getCodigoProduto()
				+ "\nPreço: " + Produto3.getPreco() + "\n");
		System.out.println("Produto 4: " + Produto4.getNomeProduto() + "\ncodigo: " + Produto4.getCodigoProduto()
				+ "\nPreço: " + Produto4.getPreco() + "\n");

		System.out.println("Codigo do produto para enviar para o cliente: ");
		int codigoProdutoParaEnvio = sc.nextInt();

		if (ListaCodigo.contains(codigoProdutoParaEnvio)) {
			
		} else {
			System.out.println("Produto nao encontrado");
		}

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
			if(codigoProdutoParaEnvio == Produto1.getCodigoProduto()) {
				operacaoDesconto(Produto1.getPreco(), quantidadeProduto);
			} 
			else if (codigoProdutoParaEnvio == Produto2.getCodigoProduto()) {
				operacaoDesconto(Produto2.getPreco(), quantidadeProduto);
			}
			else if(codigoProdutoParaEnvio == Produto3.getCodigoProduto()) {
				operacaoDesconto(Produto3.getPreco(), quantidadeProduto);
			}
			else {
				operacaoDesconto(Produto4.getPreco(), quantidadeProduto);
			}
		}
		
		System.out.println(notaFiscal(Produto1.getNomeProduto(), quantidadeProduto));
	}
	
	private static char[] notaFiscal(String nomeProduto, int quantidadeProduto) {
		// TODO Auto-generated method stub
		return null;
	}

	public static double operacaoDesconto(double valProduto, double valQuantidade ) {
		double n = valProduto * valQuantidade  * 0.15;
		double m = valProduto * valQuantidade - n;
		System.out.println("Preço total com desconto de  15%: " + m);
		//System.out.println(m);
		return 0;
		
	}
	
	public static void notaFiscal(Informaçoes nomeProduto, int valQuantidade ) {
		System.out.println("--------NOTA FISCAL--------");
		System.out.println("Nome: " + nomeProduto.getNomeProduto());
		System.out.println("Quantidade em estoque: " + valQuantidade);
		System.out.println("Data de criação: " + nomeProduto.getDataPedido());
		//System.out.println("Codigo: " + produto.getCodigo());

	}
}