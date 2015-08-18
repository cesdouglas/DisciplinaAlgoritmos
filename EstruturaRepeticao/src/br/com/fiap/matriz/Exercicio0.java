package br.com.fiap.matriz;

import java.util.Scanner;

public class Exercicio0 {

	public static void main(String[] args) {
		double alunosNotas[][] = new double[3][3];
		Scanner entrada = new Scanner(System.in);
		
		//Cadastrar notas dos alunos
		//Primeiro FOR utilizado para linhas
		for (int linhas = 0; linhas < alunosNotas.length; linhas++) {
			//Segundo FOR utilizado para colunas
			for (int colunas = 0; colunas < alunosNotas[linhas].length; colunas++) {
				System.out.println("Insira a nota [" + (colunas+1) + "]:");
				alunosNotas[linhas][colunas] = entrada.nextDouble();
			}
		}
		
		for (int linhas = 0; linhas < alunosNotas.length; linhas++) {
			//Segundo FOR utilizado para colunas
			for (int colunas = 0; colunas < alunosNotas[linhas].length; colunas++) {
				System.out.println("Aluno: [" + (linhas+1) + "] Nota: [" + (colunas+1) + "] = " + alunosNotas[linhas][colunas]);				 
			}
		}
		
		
		
		
		
		
		entrada.close();

	}

}
