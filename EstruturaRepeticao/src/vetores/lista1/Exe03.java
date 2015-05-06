package vetores.lista1;

import java.util.Scanner;

public class Exe03 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
	
		float[] arrayTemp = new float [8];
		double soma = 0;
		int dia = 0;
		int i = 0;
		
		for(i=0;i<7;i++){		
			System.out.println("Digite a temperatuda do " + (i+1) + "º dia: " );
			arrayTemp[i] = entrada.nextFloat();	
			soma = soma + arrayTemp[i];
		}
		
		for(i=0;i<7;i++){
			if(arrayTemp[i] > soma/7){
				dia++;
			}
		}
		
		
		System.out.println(soma/7);
		System.out.println(dia);
		
		
		entrada.close();
	}
}
