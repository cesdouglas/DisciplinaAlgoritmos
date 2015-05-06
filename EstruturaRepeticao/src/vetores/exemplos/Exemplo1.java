package vetores.exemplos;
import java.util.Scanner;

public class Exemplo1{
	public static void main (String[] args){

		Scanner entrada = new Scanner(System.in);

		String[] arrayNome = new String[5];		
		int i = 0;
		
		while(i<5){
			System.out.println("Digite um nome: ");
			arrayNome[i] = entrada.next();
			i++;
		}
		
		for(i=0;i<5;i++){

			System.out.println("O nome " + (i+1) +  " captado foi " + arrayNome[i]);
		}


		entrada.close();
	}
}