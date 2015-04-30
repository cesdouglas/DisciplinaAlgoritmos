package lista4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe17 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat numFormatado = new DecimalFormat ("R$ ###0.00");
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
		double maiorPreco=0;
		double menorPreco=9999;
		int clienteMaior = 0;
		int clienteMenor = 0;

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
			
			//Valor Final da loca��o
			System.out.println("Quantidade de DVDs: " + contDvd);
			System.out.println("Valor Total: " + numFormatado.format(valorTotal));
			totalLoc=totalLoc+valorTotal;

			if(valorTotal>maiorPreco){
				clienteMaior = codigoCliente;
				maiorPreco=valorTotal;
			}else
				if(valorTotal<menorPreco){
					clienteMenor = codigoCliente;
					menorPreco=valorTotal;
				}

			locacao++;
			System.out.println("Deseja cadastrar nova loca��o? \n S- SIM \n N-N�O: ");
			deseja2 = entrada.next().charAt(0);
			deseja2 = Character.toUpperCase(deseja2);

			while(deseja2!='S' && deseja2!='N'){
				System.out.println("C�digo Incorreto!!! \n Deseja cadastrar nova loca��o? \n S- SIM \n N-N�O:");
				deseja2 = entrada.next().charAt(0);
				deseja2 = Character.toUpperCase(deseja2);	
			}
			deseja='S';
			valorTotal=0;
			contDvd=0;
			
		}
		
		System.out.println("Num�ro de loca��es: " + locacao);
		System.out.println("Valor total de loca��es:" + numFormatado.format(totalLoc));
		System.out.println("C�digo Cliente: " + clienteMaior + " Maior Pre�o: " + numFormatado.format(maiorPreco));
		System.out.println("C�digo Cliente: " + clienteMenor + " Menor Pre�o: " + numFormatado.format(menorPreco));
		


		entrada.close();
	}
}
