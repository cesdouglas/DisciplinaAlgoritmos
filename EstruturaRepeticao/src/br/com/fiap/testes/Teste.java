package br.com.fiap.testes;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Livro;

public class Teste {
	public static void main(String[] args) {
		Livro p = new Livro();
		p.setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor: ")));
	
	}
}
