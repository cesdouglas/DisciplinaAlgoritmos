package ltp.orientacaoobjeto;

import javax.swing.JOptionPane;

public class Teste {
	public static void main(String[] args) {
		Livro p = new Livro();
		p.setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor: ")));
	
	}
}
