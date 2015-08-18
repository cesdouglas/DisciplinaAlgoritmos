package br.com.fiap.matriz;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String lojas[] = new String[8];
		String produtos[] = new String[4];
		double precoLojasProdutos[][] = new double[8][4];
		
		lojas[0] = "Loja 1";
		lojas[1] = "Loja 2";
		lojas[2] = "Loja 3";
		lojas[3] = "Loja 4";
		lojas[4] = "Loja 5";
		lojas[5] = "Loja 6";
		lojas[6] = "Loja 7";
		lojas[7] = "Loja 8";
		
		produtos[0] = "Produto 1";
		produtos[1] = "Produto 2";
		produtos[2] = "Produto 3";
		produtos[3] = "Produto 4";
		
		for (int i = 0; i < precoLojasProdutos.length; i++) {
			for (int j = 0; j < precoLojasProdutos[i].length; j++) {
				System.out.println(lojas[i]+ " " + produtos[j] + " " + " Preço: ");					
				precoLojasProdutos[i][j] = entrada.nextDouble();
			}
		}
		
		for (int i = 0; i < precoLojasProdutos.length; i++) {
			for (int j = 0; j < precoLojasProdutos[i].length; j++) {
				if(precoLojasProdutos[i][j]<=120){
					System.out.println(lojas[i]+ " " + produtos[j] + " " + " Preço: " + precoLojasProdutos[i][j]);
				}
			}
		}
		
		
		
		
		entrada.close();
	}

}
