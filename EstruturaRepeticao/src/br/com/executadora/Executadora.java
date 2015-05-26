package br.com.executadora;
import br.com.beans.Categoria;
import br.com.beans.Produto;
import br.com.beans.Subcategoria;
import br.com.util.Util;

public class Executadora {

	public static void main(String[] args) {
		Categoria c = new Categoria();
		Subcategoria s = new Subcategoria();
		Produto p = new Produto();
		
		c.setNome("Informática");
		s.setCategoria(c);
		s.setNome("Notebook");
		p.setSubcategoria(s);
		p.setNome("Samsung");
		p.setValor(2500);
		
		Produto p2 = new Produto();
		p2.setNome("Toshiba");
		p2.setValor(1800);
		
		Produto p3 = new Produto();
		p3.setNome("Acer");
		p3.setValor(3100);
		
		Util u = new Util();
		u.descontoDeNatal(p.getValor(),p2.getValor(),p3.getValor());
		
//		System.out.println("O produto "+p.getNome()+" é da subcategoria "+p.getSubcategoria().getNome()+" da categoria "+p.getSubcategoria().getCategoria().getNome()+" e custa: "+p.getValor());
		System.out.println(u.descontoDeNatal(p.getValor(),p2.getValor(),p3.getValor()));
	}
	
}
