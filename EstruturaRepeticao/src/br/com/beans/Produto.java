package br.com.beans;

public class Produto {
	private String nome;
	private Subcategoria subcategoria;
	private double valor;
	
	public Produto(){
		
	}
	public Produto(String nome,Subcategoria subcategoria,double valor){
		
	}
	public void setNome(String nome){
		this.nome=nome;
	}
	public String getNome(){
		return nome;
	}
	public void setSubcategoria(Subcategoria subcategoria){
		this.subcategoria=subcategoria;
	}
	public Subcategoria getSubcategoria(){
		return subcategoria;
	}
	public void setValor(double valor){
		this.valor=valor;
	}
	public double getValor (){
		return valor;
	}
}
