package algoritimos.metodos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1 {
	public static double percentualAcrescimo(double precoAntigo, double precoAtual){
		double percentual = (100 * (precoAtual-precoAntigo))/precoAntigo;
		
		return percentual;
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat formata = new DecimalFormat("00"); 
		
		System.out.println("Preço Antigo: ");
		double precoAntigo = entrada.nextDouble();
		System.out.println("Preço Atual: ");
		double precoAtual = entrada.nextDouble();		
		
		
		System.out.println("O percentual de acrécimo é: " + formata.format(percentualAcrescimo(precoAntigo, precoAtual)) + "%");
		
		entrada.close();
	}
}
