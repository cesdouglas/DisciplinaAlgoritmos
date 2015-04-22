package ExerciciosRepeticao;
import java.util.Scanner;

public class Exe06 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int idade,i, qtPessId, azul, qt;
		double peso, altura, soma; 
		char corOlho, corCabelo;
		
		qt = 0;
		azul = 0;
		idade = 0;
		i = 0;
		qtPessId = 0;
		peso = 0;
		altura = 0;
		soma = 0;		
		
		while(i<10){
			System.out.println("Idade: ");
			idade=entrada.nextInt();
			
			System.out.println("Peso: ");			
			peso=entrada.nextDouble();
			
			System.out.println("Altura: ");
			altura=entrada.nextDouble();
			
			System.out.println("Cor do Olho: ");
			corOlho=entrada.next().charAt(0);
			
			System.out.println("Cor do Cabelo: ");
			corCabelo=entrada.next().charAt(0);
			
			if((idade>50) && (peso<60)){
				qtPessId++;
			}			
			
			if(corOlho =='A'){
				azul++;
			}			
					
			if((corCabelo != 'R') && (corOlho != 'A')){
					qt++;
			}
													
			if(altura < 1.50){
				soma=soma+altura;
			}
									
			i++;			
		}
		
		System.out.println("Pessoas com idade > 50 anos e peso < 60 Kg: " + qtPessId);
		System.out.println("Média de pessoas com altura < 1,50 m: " + (double)soma/i);
		System.out.println("Porcentagem de pessoas com olhos azuis: " + (double)azul/i*100 + "%");
		System.out.println("Pessoas ruivas que não possuem olhos azuis: " + (double)qt/i*100 + "%");
		
		
		
		entrada.close();
	}

}
