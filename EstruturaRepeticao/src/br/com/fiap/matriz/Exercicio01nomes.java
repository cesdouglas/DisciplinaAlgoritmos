package br.com.fiap.matriz;

import java.util.Scanner;

public class Exercicio01nomes {

	public static void main(String[] args) {
		String alunosNomes[] = new String[3];
		double alunosNotas[][] = new double[3][3];
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < alunosNomes.length; i++) {
			System.out.println("Digite o nome do " + (i+1) + "� aluno:");
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
			for (int colunas = 0; colunas < alunosNotas[linhas].length; colunas++) {
				System.out.println("Aluno: [" + (alunosNomes[linhas]) + "] Nota: [" + (colunas+1) + "] = " + alunosNotas[linhas][colunas]);				 
			}
		}
	
		
		
		entrada.close();

	}

}
