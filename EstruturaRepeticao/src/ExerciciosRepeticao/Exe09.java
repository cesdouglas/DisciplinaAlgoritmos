package ExerciciosRepeticao;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Exe09 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat numFormatado = new DecimalFormat("R$ ###0.00");
		double pe = 0;
		int cp = 0;		
		int produtos = 0;
		double total = 0;
		
		
		System.out.println("Qual o número de produtos?");
		
		produtos = entrada.nextInt();
		
		for(int i = 1; i<produtos+1; i++){
			System.out.println("Preço de Etiqueta do " + i + "º produto: ");
			pe = entrada.nextDouble();
			total = total + pe;
			}			
			
		System.out.println("Escolha a condição de pagamento: ");
		System.out.println("1 - À vista em dinheiro ou cheque, com 10% de desconto");
		System.out.println("2 - À vista com cartão de crédito, com 5% de desconto");
		System.out.println("3 - Em 2 vezes, preço normal de etiqueta sem juros");
		System.out.println("4 - Em 3 vezes, preço de etiqueta com acréscimo de 10%");
		cp = entrada.nextInt();
		
		while(cp<1 || cp>4){
			System.out.println("Código Incorreto!!!" + "\n" + "Digite Novamente: " );
			cp = entrada.nextInt();
			
		}
		
		if(cp==1){
			System.out.println(numFormatado.format(total*0.90));
		}else
			if(cp==2){
				System.out.println(numFormatado.format(total*0.95));
			}else
				if(cp==3){
					System.out.println("2 parcelas de: " + numFormatado.format(total/2));
				}else{
					System.out.println("3 parcelas de: " + numFormatado.format(total*1.10/3));
				}
		
		
		
		entrada.close();
	}
}
