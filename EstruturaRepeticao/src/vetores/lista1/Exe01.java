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
			System.out.println("Digite o " +i+ "� n�mero: " );
			arrayNumero[i] = entrada.nextInt();
			if(arrayNumero[i]%2 == 0){
				System.out.println("Este n�mero � par!");
				par++;
			}else{
				System.out.println("Este n�mero � �mpar!");
				impar++;
			}
		}
		
		
		
		System.out.println("Quantidade de n�meros pares: " + par);
		System.out.println("Quantidade de n�meros �mpares : " + impar);
				
		
		entrada.close();
	}
}
