package vetores.lista1;

import java.util.Scanner;

public class Exe02 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double[] arrayNumero = new double [7];	
		char[] arrayLetra = new char [7];
		int i=0;
		double somaC = 0, somaD = 0;
		
		
		for(i=1;i<7;i++){
			System.out.println("Digite o " +i+ "� valor: " );
			arrayNumero[i] = entrada.nextDouble();
			
			System.out.println("Digite o c�digo para o " +i+ "� valor: " );
			arrayLetra[i] = entrada.next().charAt(0);
			arrayLetra[i] = Character.toUpperCase(arrayLetra[i]);
			
			while(arrayLetra[i]!='D' && arrayLetra[i]!='C'){
				System.out.println("C�digo errado!!! \n Digite o c�digo para o " +i+ "� valor: " );
				arrayLetra[i] = entrada.next().charAt(0);
				arrayLetra[i] = Character.toUpperCase(arrayLetra[i]);
			}
			
			if(arrayLetra[i] == 'D'){
				somaC=somaC+arrayNumero[i];		
			}else{
				somaD=somaD+arrayNumero[i];				
			}
		}
		
		
		
		System.out.println("O total de d�bitos: " + somaD);
		System.out.println("O total de cr�ditos: " + somaC);
		System.out.println("O resultado �: " + (somaC-somaD));
		
				
		
		entrada.close();
	}
}
