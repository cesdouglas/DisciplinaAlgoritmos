package semestre2.alg;

import java.util.Scanner;

public class MediaFinal {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double notas[] = new double[5];
		int notasAcima = 0;
		int notasAbaixo = 0;
		int notasIguais = 0;
		double soma = 0;
		double media = 0;
		
		for(int i = 0; i<notas.length; i++){
			System.out.println("Insira a " + (i+1) + "º nota:");
			notas[i] = entrada.nextInt();			
			soma+=notas[i];
		}
		media = soma/notas.length;
		
		for(int i = 0; i<notas.length; i++){
			if(notas[i]<media){
				notasAbaixo++;
			}else if(notas[i]>media){
				notasAcima++;
			}else if(notas[i]==media){
				notasIguais++;
			}			
		}
		
		System.out.println("Notas Iguais: "+ notasIguais + "\nNotas Abaixo: " + notasAbaixo + 
				"\nNotas Acima: " + notasAcima + "\nMédia: " + media);
		
		entrada.close();
	}
}
