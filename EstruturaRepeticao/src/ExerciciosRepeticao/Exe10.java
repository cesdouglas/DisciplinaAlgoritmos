package ExerciciosRepeticao;
import java.util.Scanner;
public class Exe10 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		char codigo = '\u0000';
		double totalV = 0, totalP = 0, valor = 0, total = 0;
		
		for(int i=0;i<10;i++){
			System.out.println("Valor: ");
			entrada.nextDouble();
			
			System.out.println("Informe código de transação: \n V - Transação à vista \n P - Transação a prazo");
			codigo = entrada.next().charAt(0);
			codigo = Character.toUpperCase(codigo);
			
			while(codigo!='V' && codigo!='P'){
				System.out.println("Código errado!!! \n Informe código de transação: \n V - Transação à vista \n P - Transação a prazo");
				codigo = entrada.next().charAt(0);
				codigo = Character.toUpperCase(codigo);
			}
			
			if(codigo=='V'){
				totalV=totalV+valor;
			}else{
				totalP=totalP+valor;
			}
			total=total+valor;
		}
		
		System.out.println("Total de compras à vista: " + totalV);
		System.out.println("Total de compras à prazo: " + totalP);
		System.out.println("Total de compras efetuadas: " + total);
		
		entrada.close();
	}
}
