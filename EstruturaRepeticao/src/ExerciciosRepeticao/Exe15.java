package ExerciciosRepeticao;

import java.util.Scanner;

public class Exe15 {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner entrada = new Scanner(System.in);
		int idade = 1;
		char sexo = '\u0000';
		char exp = '\u0000';
		int contM = 0;
		int contF = 0;
		double idadeMedia = 0;
		int menorIdade = 0;
		int cont45 = 0;
		int cont21S = 0;
		
		// Entradas

		while (idade != 0){
			System.out.println("Idade: ");
			idade = entrada.nextInt();
			if(idade!=0){
				System.out.println("Sexo: ");
				System.out.println("M - Masculino");
				System.out.println("F - Feminino");
				sexo = entrada.next().charAt(0);
				sexo = Character.toUpperCase(sexo);
				System.out.println("Experiência: ");
				System.out.println("S - Sim");
				System.out.println("N - Não");
				exp = entrada.next().charAt(0);
				exp = Character.toUpperCase(exp);
				
				if(sexo=='M'){
					contM++;
					idadeMedia=idadeMedia+idade;
					if(idade>45){
						cont45++;
					}
				}else{
					contF++;
					if(idade<21 && exp=='S'){
						cont21S++;
					}
				}
				
				if(sexo=='F' && exp=='S'){
					if(idade<menorIdade){
						menorIdade=idade;
					}
				}
				
			}
			
		}

		System.out.println("Candidatos Femininos: " + contF);
		System.out.println("Candidatos Masculinos: " + contM);
		System.out.println("Idade Média de Homens com experiência: " + (double)idadeMedia/contM);
		System.out.println("Porcentagem de homens com mais de 45 Anos " + (double)cont45/contM*100 + "%");
		System.out.println("Porcentagem de mulheres com menos de 21 Anos com experiência: " + (double)cont21S/contF*100 + "%");
		System.out.println("Menor idade entre as mulheres com experiência: " + menorIdade);
		
		entrada.close();
	}
}
