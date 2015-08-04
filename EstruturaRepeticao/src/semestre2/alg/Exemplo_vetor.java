package semestre2.alg;

import java.util.Scanner;

public class Exemplo_vetor {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		//Declaracao e Instanciacao
		int x[] = new int[3];
		
		//Declaracao, Instanciacao e Atribuicao
		int y[] = {134, 32323, 132};
		
		//Atribuicao de Valores no Vetor X
		for(int i = 0; i<x.length; i++){
			System.out.println("Insira o valor da posicao " + i + ":");
			x[i] = entrada.nextInt();
		}
				
		//Utilizando quando nao se necessita trabalhar com indice,
		//sendo apenas necessario apresentar os dados contidos no vetor
		
		for(int valorVetor: x){
			System.out.println("O valor digitado foi: " + valorVetor);
		}
		
		//Exibindo os dados do vetor Y usando o FOR
		for(int i = 0; i<y.length; i++){
			System.out.println("Valor da posicao " + i + "de y: " + y[i]);
		}
		
		entrada.close();
	}	
}
