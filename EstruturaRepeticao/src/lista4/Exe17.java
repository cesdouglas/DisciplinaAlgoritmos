package lista4;

import java.util.Scanner;

public class Exe17 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int codigoCliente = 0;
		int codigoDvd = 0;
		char tipo = '\u0000';
		double valor = 0;
		char deseja = 'S';
		int contDvd = 0;	
		double valorTotal = 0;
		char deseja2= 'S';
		int locacao = 0;
		double totalLoc = 0;
		int i = 0;
		double maiorPreco=0;
		double menorPreco=0;
		int cliente = 0;

		while(deseja2=='S'){
			System.out.println("C�digo do cliente: ");
			codigoCliente = entrada.nextInt();

			while(deseja=='S'){
				System.out.println("C�digo DVD: ");
				codigoDvd = entrada.nextInt();

				//Valida��o C�digo DVD
				while(codigoDvd<1 || codigoDvd>20){
					System.out.println("C�digo Errado!!! \n Digite novamente o c�digo DVD: ");
					codigoDvd = entrada.nextInt();
				}

				System.out.println("Digite o tipo: \n A-A��o \n C-Com�dia \n D-Drama");
				tipo = entrada.next().charAt(0);
				tipo = Character.toUpperCase(tipo);

				//Valida��o Tipo DVD
				while(tipo!='A' && tipo!='C' && tipo!='D'){
					System.out.println("C�digo errado!!! \n Digite o tipo novamente: \n A-A��o \n C-Com�dia \n D-Drama");
					tipo = entrada.next().charAt(0);
					tipo = Character.toUpperCase(tipo);
				}

				//Tabela
				if(codigoDvd>=1 && codigoDvd<=10){
					if(tipo=='A'){
						valor=8;
					}else
						if(tipo=='C'){
							valor=12;
						}else{
							valor=10;
						}
				}else{
					if(tipo=='A'){
						valor=5;
					}else
						if(tipo=='C'){
							valor=7;
						}else{
							valor=9;
						}
				}

				System.out.println("Deseja Alugar mais DVDs? \n S- SIM \n N-N�O: ");
				deseja = entrada.next().charAt(0);
				deseja = Character.toUpperCase(deseja);

				while(deseja!='S' && deseja!='N'){
					System.out.println("C�digo Incorreto!!! \n Deseja Alugar mais DVDs? \n S- SIM \n N-N�O:");
					deseja = entrada.next().charAt(0);
					deseja = Character.toUpperCase(deseja);	
				}
				contDvd++;
				valorTotal=valorTotal+valor;
			}

			//Promo��o Loca��o
			if(contDvd>=4){
				valorTotal=valorTotal*0.95;
			}
			i++;
			//Valor Final da loca��o
			System.out.println("Valor Total: " + valorTotal);
			totalLoc=totalLoc+valorTotal;
			if(i==1){
				cliente = codigoCliente;
				maiorPreco=valorTotal;
				menorPreco=valorTotal;
			}else
				if(valorTotal>maiorPreco){
					cliente = codigoCliente;
					maiorPreco=valorTotal;
				}else
					if(valorTotal<menorPreco){
						cliente = codigoCliente;
						menorPreco=valorTotal;
					}

			System.out.println("Deseja cadastrar nova loca��o? \n S- SIM \n N-N�O: ");
			deseja2 = entrada.next().charAt(0);
			deseja2 = Character.toUpperCase(deseja2);

			while(deseja2!='S' && deseja2!='N'){
				System.out.println("C�digo Incorreto!!! \n Deseja cadastrar nova loca��o? \n S- SIM \n N-N�O:");
				deseja2 = entrada.next().charAt(0);
				deseja2 = Character.toUpperCase(deseja2);	
			}
			locacao++;
		}
		
		System.out.println("Num�ro de loca��es: " + locacao);
		System.out.println("Valor total de loca��es:" + totalLoc);
		System.out.println("C�digo Cliente: " + cliente + " Maior Pre�o: " + maiorPreco);
		System.out.println("C�digo Cliente: " + cliente + " Menor Pre�o: " + menorPreco);
		


		entrada.close();
	}
}
