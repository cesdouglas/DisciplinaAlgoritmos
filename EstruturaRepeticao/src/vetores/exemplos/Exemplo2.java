package vetores.exemplos;

import java.util.Scanner;

public class Exemplo2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String[] arrayNome = new String[3];
		float[] arrayTemp = new float [3];
		
		for(int i=0;i<3;i++){
			arrayNome[i] = entrada.next();	
			arrayTemp[i] = entrada.nextFloat();	
		}
		
		for(int i=0;i<3;i++){
			if(arrayTemp[i] > 37){
				System.out.println("Nome: "+ arrayNome[i] + " Temperatura: " +  arrayTemp[i] + "º");
			}			
		}		
		
		entrada.close();
	}
}
