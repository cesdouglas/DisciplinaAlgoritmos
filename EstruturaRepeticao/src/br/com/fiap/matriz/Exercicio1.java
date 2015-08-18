package br.com.fiap.matriz;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int m[][] = new int[2][2];
		int r[][] = new int[2][2];
		int maiorNum = Integer.MIN_VALUE;
		//Integer.MIN_VALUE atribui o menor valor inteiro possível;

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.println("Digite um número: ");
				m[i][j]=entrada.nextInt();
				if(maiorNum<m[i][j]){
					maiorNum = m[i][j];
				}
			}
		}

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				r[i][j] = m[i][j]*maiorNum;
				System.out.println(r[i][j]);
			}
		}		
		
		
		entrada.close();
	}
}


