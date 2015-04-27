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
		
		
		System.out.println("Qual o n�mero de produtos?");
		
		produtos = entrada.nextInt();
		
		for(int i = 1; i<produtos+1; i++){
			System.out.println("Pre�o de Etiqueta do " + i + "� produto: ");
			pe = entrada.nextDouble();
			total = total + pe;
			}			
			
		System.out.println("Escolha a condi��o de pagamento: ");
		System.out.println("1 - � vista em dinheiro ou cheque, com 10% de desconto");
		System.out.println("2 - � vista com cart�o de cr�dito, com 5% de desconto");
		System.out.println("3 - Em 2 vezes, pre�o normal de etiqueta sem juros");
		System.out.println("4 - Em 3 vezes, pre�o de etiqueta com acr�scimo de 10%");
		cp = entrada.nextInt();
		
		while(cp<1 || cp>4){
			System.out.println("C�digo Incorreto!!!" + "\n" + "Digite Novamente: " );
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
