package br.com.fiap.matriz;

import java.util.Scanner;

public class Exercicio02media {

	public static void main(String[] args) {
		String alunosNomes[] = new String[3];
		double alunosNotas[][] = new double[3][3];
		Scanner entrada = new Scanner(System.in);
		double media = 0;
		
		for (int i = 0; i < alunosNomes.length; i++) {
			System.out.println("Digite o nome do " + (i+1) + "º aluno:");
			alunosNomes[i] = entrada.next();
		}
		
		for (int linhas = 0; linhas < alunosNotas.length; linhas++) {
			for (int colunas = 0; colunas < alunosNotas[linhas].length; colunas++) {
				System.out.println("Insira a nota [" + (colunas+1) + "]:");
				alunosNotas[linhas][colunas] = entrada.nextDouble();
			}
		}
		
		for (int linhas = 0; linhas < alunosNotas.length; linhas++) {
			//Segundo FOR utilizado para colunas
			System.out.println("Aluno: [" + (alunosNomes[linhas]) + "]:");
			for (int colunas = 0; colunas < alunosNotas[linhas].length; colunas++) {
				System.out.println("\tNota: [" + (colunas+1) + "] = " + alunosNotas[linhas][colunas]);
				media+=alunosNotas[linhas][colunas];
			}
			System.out.println("\tMedia Final:" + media/3);
			media = 0;
		}
	
		
		
		entrada.close();

	}

}