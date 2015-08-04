package semestre2.alg.exfixacao;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String mes[] =  {"janeiro", "fevereiro", "marco", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
		double temp[] = new double[12];
		double maiorTemp = 0;
		double menorTemp = 0;
		int maiorMes = 0;
		int menorMes = 0;

		for(int i = 0; i<temp.length; i++){
			System.out.println("Insira a temperatura correspondente ao mês de " + mes[i] +":");
			temp[i] = entrada.nextDouble();

			if(i==0){
				maiorTemp = temp[i];
				menorTemp = temp[i];
				maiorMes = i;
				menorMes = i;
			}else{							
				if(maiorTemp<temp[i]){
					maiorTemp=temp[i];
					maiorMes = i;
				}
				if(menorTemp>temp[i]){
					menorTemp=temp[i];
					menorMes = i;
				}			
			}
		}

		System.out.println("Menor temperatura: " + menorTemp + "° que foi no mês de " + mes[menorMes] + "\nMaior temperatura: " + maiorTemp + "° que foi no mês de " + mes[maiorMes]);


		entrada.close();
	}

}
