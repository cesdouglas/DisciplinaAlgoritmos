package br.com.fiap.testes;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Fornecedor;
import br.com.fiap.beans.Livro;

public class Teste {
	static String texto(String d){
		return JOptionPane.showInputDialog(d);
	}
	static double decimal(String d){
		return Double.parseDouble(JOptionPane.showInputDialog(d));
	}
	
	public static void main(String[] args) {
		Livro livro = new Livro();
		livro.setValor(decimal("Digite o valor: "));
		Fornecedor fornecedor = new Fornecedor();
		livro.setFornecedor(fornecedor);
		fornecedor.setCnpj(texto("Digite o CNPJ"));
		
	}
}
