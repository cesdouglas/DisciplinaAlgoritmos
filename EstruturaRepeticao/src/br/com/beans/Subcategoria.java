package br.com.beans;

public class Subcategoria {
	private String nome;
	private Categoria categoria;
	
	public Subcategoria(){
		
	}
	public Subcategoria(String nome, Categoria categoria){
		
	}
	public void setNome (String nome){
		this.nome=nome;
	}
	public String getNome (){
		return nome;
	}
	public void setCategoria (Categoria categoria){
		this.categoria=categoria;
	}
	public Categoria getCategoria (){
		return categoria;
	}
}
