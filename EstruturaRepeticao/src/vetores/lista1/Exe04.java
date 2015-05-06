package vetores.lista1;
import java.util.Scanner;

public class Exe04{
	public static void main (String[] args){
		Scanner entrada = new Scanner(System.in);
		String[] arrayNome = new String[10];	
		String digitado = null;
		int i = 0;
		for(i=0;i<10;i++){
			System.out.println("Digite o " + (i+1) +  "º nome: ");
			arrayNome[i] = entrada.next();		
		}
		System.out.println("Digite o nome para procurar no vetor: ");
		digitado = entrada.next();		
		for(i=0;i<10;i++){	
			if(digitado.equalsIgnoreCase(digitado)==arrayNome[i].equalsIgnoreCase(digitado)){
				System.out.println("Achei! Posição: " + (i+1) + "º");
			}else{
				System.out.println("Não Achei!!!");
			}
		}
		entrada.close();
	}
}