package ExerciciosRepeticao;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Exe11 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		DecimalFormat numFormatado = new DecimalFormat ("#,##0.00");
		
		double carro = 0;	
		double percentual = 1.03;
		
		
		System.out.println("Digite o valor do carro: ");
		carro = entrada.nextDouble();
		
		System.out.println("Valor à vista: " + carro*0.8);
		
		
		for(int i=6;i<66;i+=6){
			System.out.println("Total de: " + numFormatado.format(carro * percentual) + " dividido em: " + i + " parcelas de " + numFormatado.format(carro * percentual/i));
			percentual+=0.03; 
		}
				
	
		entrada.close();
	}

}
