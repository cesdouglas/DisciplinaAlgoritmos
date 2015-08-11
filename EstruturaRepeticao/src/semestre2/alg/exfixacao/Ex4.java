package semestre2.alg.exfixacao;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		String funcionario[] = new String[5];
		double salario[] = new double[5];
		int tempoServico[] = new int[5];
		String naoAumento[] = new String[5];
		String funcionarioAumento[] = new String[5];
		double valorAumento[] = new double[5];
		/*Object valorAument[][] = new Object[5][5];*/
		
		int n = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		//Atribuição dos Valores
		for(int i = 0; i<5; i++){
			System.out.println("Nome:");
			funcionario[i] = entrada.next();
			System.out.println("Salário:");
			salario[i] = entrada.nextDouble();
			System.out.println("Tempo de serviço em anos:");
			tempoServico[i] = entrada.nextInt();
			
			if(tempoServico[i]>5 && salario[i]<400){
				funcionarioAumento[n] = funcionario[i];
				valorAumento[n] = salario[i]*1.35;
			}else if(tempoServico[i]>5){
				funcionarioAumento[n] = funcionario[i];
				valorAumento[n] = salario[i]*1.25;
			}else if(salario[i]<400){
				funcionarioAumento[n] = funcionario[i];
				valorAumento[n] = salario[i]*1.15;
			}else{
				naoAumento[n] = funcionario[i];
			}
			n++;
			
		}
		
		
		//Relatório 1
		System.out.println("----Nao terao aumento----");
		for(String x : naoAumento){
			if(!x.equals(null)){
			System.out.println("\tNome:"+x);
			}
		}		
		
		//Relatório 2
		System.out.println("----Terao aumento----");
		for(String x : funcionarioAumento){
			if(!x.equals(null)){
			System.out.println("Nome: "+x);
			}
		}
		for(double x : valorAumento){
			System.out.println("Novo Valor: "+x);			
		}
		
		
		entrada.close();
	}

}
