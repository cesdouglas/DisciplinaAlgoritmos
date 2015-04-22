package CorrecaoNAC;
import java.util.Scanner;

public class CorrecaoNAC {

	public static void main (String[] args){
		
		Scanner entrada = new Scanner(System.in);
		
		String nome, plano, opcao, depart, msg;
		int idade, dependente, tempo;
		double valorPlan, valorTotal, valorDesconto, valorFinal, desconto;
		
		msg = null;
		nome = null;
		plano = null;
		opcao = null;
		depart = null;
		idade = 0;
		dependente = 0;
		tempo = 0;
		valorPlan = 0;
		valorTotal = 0;
		valorDesconto = 0;
		valorFinal = 0;
		desconto = 0;
		
		
		
		
		//Entradas
		System.out.println("Idade do Funcionário:");
		nome=entrada.next();
		
		System.out.println("Idade do Funcionário:");
		idade=entrada.nextInt();
		
		System.out.println("Planos de Saúde");
		System.out.println("FESP - Perfil SP");
		System.out.println("PPQS - Preferencial Plus");
		System.out.println("TQSP - Nacional");
		System.out.println("Digite o plano   desejado:");
		plano=entrada.next();
		
		System.out.println("Opções de Plano de Saúde");
		System.out.println("EF - Enfermaria");
		System.out.println("AP - Apartamento");
		System.out.println("Digite a opção do plano:");
		opcao=entrada.next();
		
		System.out.println("Digite o número de dependentes do funcionário:");
		dependente=entrada.nextInt();
		
		System.out.println("Departamentos");
		System.out.println("ADM - Admnistração");
		System.out.println("COM - Comercial");
		System.out.println("TI - Tecnologia");
		System.out.println("FIN - Financeiro");
		System.out.println("Digite o departamento do funcionário:");
		depart=entrada.next();
		
		System.out.println("Digite o tempo de empresa do funcionário:");
		tempo=entrada.nextInt();
		
		//Processamento
		
		switch (plano){
		case "FESP":
			if(opcao.equalsIgnoreCase("EF")){
				if (idade<50){
					valorPlan=121.5;							
				}else{
					valorPlan=133.8;
				}
			}else
				if(idade<50){
					valorPlan=179.8;
				}else{
					valorPlan=197.8;
				}
		break;
		case "PPQS":
			if(opcao.equalsIgnoreCase("EF")){
				if(idade>50){
					valorPlan=167.8;
				}else{
					valorPlan=185.4;						
				}
			}else{
				if(idade<50){
					valorPlan=202.6;
				}else{
					valorPlan=227.3;
				}
			}
		break;
		default:
			if(idade<50){
				valorPlan=341.6;
			}else{
				valorPlan=435.8;
			}
		}
		
		//Cálculo Plano
		
		valorTotal = valorPlan + (valorPlan * dependente);
		
		//Percentual Desconto
		
		switch(depart){
		case "ADM":
			if(opcao.equalsIgnoreCase("FESP")){
				desconto=0.05;
			}else{
				desconto=0.07;
			}
		break;
		case "FIN":
			if(opcao.equalsIgnoreCase("FESP")){
				desconto=0.05;
			}else{
				desconto=0.07;
			}
		break;
		case "COM":
			if(opcao.equalsIgnoreCase("AP")){
				desconto=0.1;
			}
		break;
		default:
			if(opcao.equalsIgnoreCase("EF")){
				desconto=0.12;
			}else{
				desconto=0.8;
			}
		}	
		
		//Cálculo Desconto
				
		valorDesconto = valorTotal * desconto;

		valorFinal = valorTotal - valorDesconto;
		
		//Regra RH

		if ((tempo > 10) && (tempo <= 15) || (idade > 40)){
		   msg = "Aviso: Verificar no RH a datado curso de reciclagem!!!";
		}
		
		System.out.println("DADOS DO FUNCIONÁRIO"); 
		System.out.println("Nome do Funcionário: " + nome);
		System.out.println("Idade do Funcionário:" + idade);
		System.out.println("Departamento: " + depart);
		System.out.println("Tempo de Empresa:" + tempo);

		System.out.println("DADOS DO PLANO");
		System.out.println("Plano de Saúde: " + plano);
		System.out.println("Valor do Plano:" + valorPlan);
		System.out.println("Número de Dependentes:" + dependente);
		System.out.println("Valor Total da Assistência Médica:" + valorTotal);
		System.out.println("Percentual de desconto:" + desconto);
		System.out.println("Valor Final:" + valorFinal);
		System.out.println(msg);
		
		entrada.close();
	}
}
