package pxt.api.estoqueprodutos;

import java.time.LocalDate;


public class Informaçoes {
	private double preco;
	private int desconto;
	private String nomeProduto;
	private LocalDate dataPedido =  LocalDate.now();
	private int qtddProdutos;
	private String cidadesOndeEntrega;
	private int codigoProduto;
	
	public int getCodigoProduto() {
		return codigoProduto;
	}
	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}
	
	public String getCidadesOndeEntrega() {
		return cidadesOndeEntrega;
	}
	public void setCidadesOndeEntrega(String cidadesOndeEntrega) {
		this.cidadesOndeEntrega = cidadesOndeEntrega;
	}
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public int getDesconto() {
		return desconto;
	}
	public void setDesconto(int desconto) {
		this.desconto = desconto;
	}
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	
	public LocalDate getDataPedido() {
		return dataPedido;
	}
	public void setDataPedido(LocalDate dataPedido) {
		this.dataPedido = dataPedido;
	}
	
	public int getQtddProdutos() {
		return qtddProdutos;
	}
	public void setQtddProdutos(int qtddProdutos) {
		this.qtddProdutos = qtddProdutos;
	}
	
}