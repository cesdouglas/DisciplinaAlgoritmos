package br.com.fiap.matriz;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String produto[] = new String[5];
		double precoProdutoLoja[][] = new double[5][4];
		double custoTransporte[] = new double[5];
		double valorImpostoProdutoLoja[][] = new double[5][4];
		
		produto[0] = "Produto 1";
		produto[1] = "Produto 2";
		produto[2] = "Produto 3";
		produto[3] = "Produto 4";
		produto[4] = "Produto 5";
		
		custoTransporte[0] = 200;
		custoTransporte[1] = 100;
		custoTransporte[2] = 500;
		custoTransporte[3] = 20;
		custoTransporte[4] = 30;
		
		//Atribuicao preco
		for (int produtos = 0; produtos < precoProdutoLoja.length; produtos++) {
			for (int lojas = 0; lojas < precoProdutoLoja[produtos].length; lojas++) {
				precoProdutoLoja[produtos][lojas] = Math.random()*100;
			}
		}
		
		//Atribuicao imposto
		for (int produtos = 0; produtos < valorImpostoProdutoLoja.length; produtos++) {
			for (int lojas = 0; lojas < valorImpostoProdutoLoja[produtos].length; lojas++) {
				if(precoProdutoLoja[produtos][lojas]<=50){
					valorImpostoProdutoLoja[produtos][lojas] = precoProdutoLoja[produtos][lojas]*0.05;
				}else if(precoProdutoLoja[produtos][lojas]<=100){				
					valorImpostoProdutoLoja[produtos][lojas] = precoProdutoLoja[produtos][lojas]*0.10;
				}else{
					valorImpostoProdutoLoja[produtos][lojas] = precoProdutoLoja[produtos][lojas]*0.20;
				}
			}
		}
		
		//Impressao Relatorio
		for (int produtos = 0; produtos < valorImpostoProdutoLoja.length; produtos++) {
			for (int lojas = 0; lojas < valorImpostoProdutoLoja[produtos].length; lojas++) {
				System.out.println(produto[produtos]);
				System.out.println("Loja: " + lojas);
				System.out.println("Imposto: " + valorImpostoProdutoLoja[produtos][lojas]);
				System.out.println("Custo Transporte: " + custoTransporte[produtos]);
				System.out.println("Preco: " + precoProdutoLoja[produtos][lojas]);
				System.out.println("Preco Final: " + precoProdutoLoja[produtos][lojas]+valorImpostoProdutoLoja[produtos][lojas]+custoTransporte[produtos]);
				System.out.println("-------------------------------------------");
			}
		}
		
		
		
		entrada.close();

	}

}
