package ExerciciosRepeticao;
import java.util.Scanner;


public class Exe01 {



	public static void main(String[] args) {
		
		//Cria��o da vari�vel para entrada de dados
		Scanner entrada = new Scanner (System.in);
		
		//declaca��o das vari�veis
		int idade, contador, qtd1, qtd2;
		double peso, altura, totPeso, totAltura;
		
		//Atribuir valores as vari�veis
		idade = 0;
		contador = 0;
		qtd1=0;
		qtd2=0;
		peso=0;
		altura=0;
		totPeso=0;
		totAltura=0;
		
		//Estrutura de Repeti��o
		while(contador<5){
			System.out.println("Digite a idade:");
			idade=entrada.nextInt();
			
			System.out.println("Digite a altura:");
			altura=entrada.nextDouble();
			
			System.out.println("Digite o peso:");
			peso=entrada.nextDouble();
			
			contador++;
			if(idade>50){
				qtd1++;
			}else{
				if(idade>10 && idade<20){
					qtd2++;
					totAltura = totAltura + altura;
					
				}
			}
			if(peso<40){
				totPeso++;
			}		
		}
		
		System.out.println("Quantidade de pessoas com idade superior  50 anos:"+qtd1);
		if (qtd2 !=0){
		System.out.println("A m�dia das alturas das pessoas com idade entre 10 e 20:"+totAltura/qtd2);
		}
		System.out.println("A porcentagem de pessoas com peso inferior a 40 quilos:"+(totPeso/5)*100 + ("%"));
		
		entrada.close();
	}
}
