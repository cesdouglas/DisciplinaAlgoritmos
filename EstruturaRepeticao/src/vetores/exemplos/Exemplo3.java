package vetores.exemplos;

import java.util.Scanner;

public class Exemplo3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float[] arrayNumero = new float [10];
		float soma = 0;
		int i=0;
		
		for(i=1;i<11;i++){
			System.out.println("Digite o " +i+ "� n�mero: " );
			arrayNumero[i] = entrada.nextFloat();
			soma = soma + arrayNumero[i];
		}
		
		
		
		System.out.println("A m�dia dos 10 n�meros � igual: " + soma/10);
				
		
		entrada.close();
	}
}
