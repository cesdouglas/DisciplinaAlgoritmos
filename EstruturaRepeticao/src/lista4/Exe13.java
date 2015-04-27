package lista4;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe13 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		DecimalFormat numFormatado = new DecimalFormat ("#,##0.00");
		
		double divida = 0;
		double juros = 1.10;
		
		divida = entrada.nextDouble();
		
		System.out.println(("Valor da Dívida: R$")+ numFormatado.format(divida) + " | Valor do Juros: R$" + numFormatado.format(0) + " dividido em: " + 1 + " parcelas de R$" + numFormatado.format(divida));
		for(int i=3;i<15;i+=3){
			System.out.println(("Valor da Dívida: R$")+ numFormatado.format(divida*juros) + " | Valor do Juros: R$" + numFormatado.format(divida*juros-divida) + " dividido em: " + i + " parcelas de R$" + numFormatado.format(divida*juros/i));
		
			juros+=0.05; 
		}
		
		entrada.close();
	}
}
