package semestre2.alg.exfixacao;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String carros[] = new String[5];
		double km[] = new double[5];
		double consumo[] = new double[5];
		double maisEconomico = 0;
		
		for(int i = 0; i<carros.length; i++){
			System.out.println("Insira a " + (i+1) + "º nota:");
			System.out.println("Insira a marca do carro:");
			carros[i] = entrada.next();
			System.out.println("Insira quantos quilômetros o carro faz com um litro de combustível:");
			km[i] = entrada.nextDouble();
			consumo[i] = km[i]*1000;
			if(i==0){
				maisEconomico = km[i];
			}else{							
				if(maisEconomico<km[i]){
					maisEconomico=km[i];
				}
			}
		}
		
		for(int i = 0; i<carros.length; i++){
			System.out.println("");
		}
		
		
		entrada.close();
	}
}
