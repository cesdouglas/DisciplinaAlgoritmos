package algoritimos.metodos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex2 {
	public static double calcularMedia(double nota1, double nota2, double nota3, char letra){
		
		double media = 0;
		
		if(letra == 'A'){
			media = (nota1+nota2+nota3)/3;
			System.out.println("Sua média aritmética é: "+media);
		}else if(letra == 'P'){
			media = (nota1*0.5+nota2*0.3+nota3*0.2)/3;
			System.out.println("Sua média ponderada é: "+media);
		}else{
			System.out.println("Código Inválido!!! \nExecute o programa novamente!");
		}
		
		return media;
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat formata = new DecimalFormat("#0.00");
		
		System.out.println("Digite a primeira nota: ");
		double nota1 = entrada.nextDouble();
		System.out.println("Digite a segunda nota: ");
		double nota2 = entrada.nextDouble();
		System.out.println("Digite a terceira nota: ");
		double nota3 = entrada.nextDouble();
		System.out.println("Digite 'P' para media ponderada ou 'A' para media aritmética: ");
		char opcao = entrada.next().charAt(0);
		opcao = Character.toUpperCase(opcao);
		
		formata.format(calcularMedia(nota1,nota2,nota3,opcao));
		
		
		
		entrada.close();
		
	}
}
