package vetores.lista1;

import java.util.Scanner;

public class Exe01 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int[] arrayNumero = new int [7];	
		int i=0;
		int impar = 0;
		int par = 0;
		
		for(i=1;i<7;i++){
			System.out.println("Digite o " +i+ "º número: " );
			arrayNumero[i] = entrada.nextInt();
			if(arrayNumero[i]%2 == 0){
				System.out.println("Este número é par!");
				par++;
			}else{
				System.out.println("Este número é ímpar!");
				impar++;
			}
		}
		
		
		
		System.out.println("Quantidade de números pares: " + par);
		System.out.println("Quantidade de números ímpares : " + impar);
				
		
		entrada.close();
	}
}
