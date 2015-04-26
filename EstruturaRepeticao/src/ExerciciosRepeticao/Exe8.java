package ExerciciosRepeticao;
import java.util.Scanner;
public class Exe8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int codigo = 1;
		int tipo = 0;
		double valor = 0;
		int cliente = 0;
		double juros = 0;
		double total = 0;
		double totalJuros=0;
		
		while(codigo!=0){
			System.out.println("Código do Cliente: ");
			codigo = entrada.nextInt();
			if(codigo!=0){			
				System.out.println("Digite o tipo de conta: ");
				System.out.println("1 - Poupança");
				System.out.println("2 - Poupança Plus");
				System.out.println("3 - Fundo de Renda Fixa");			
				tipo = entrada.nextInt();
				while(tipo<1 || tipo>3){
					System.out.println("Digite o tipo de conta corretamente: ");
					tipo = entrada.nextInt();
				}
				System.out.println("Valor Investido: ");
				valor = entrada.nextDouble();

				total=total+valor;
				
				if(tipo==1){
					juros = valor*0.015;
				}else
					if(tipo==2){
						juros = valor*0.02;
					}else{
						juros = valor*0.04;
					}
			
				totalJuros=totalJuros+juros;				
				
				cliente++;
				
				System.out.println("Rendimento Mensal: " + (valor+juros));
			}
		}
		
		System.out.println("Total Investido: " + total);
		System.out.println("Total de Juros: " + totalJuros);
		System.out.println("Total de Clientes: " + cliente);
		entrada.close();
	}

}
