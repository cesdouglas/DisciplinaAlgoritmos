package lista4;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe14 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		DecimalFormat numFormatado = new DecimalFormat ("R$ ###0.00");

		//Declaração de variáveis
		double preco = 0;
		double estoq = 0;
		char refri = '\u0000';
		char categoria = '\u0000';
		double imposto = 0;
		double precoFinal = 0;
		String msg = null;
		double mediaEstoq=0;
		double mediaImposto=0;
		double maiorPreco=0;
		double menorPreco=0;
		double totalImposto=0;
		int contBarato=0;
		int contNormal=0;
		int contCaro=0;



		for(int i=1;i<13;i++){

			//Entradas
			System.out.println("Preço Unitário do : " + i + "º produto: "); 
			preco = entrada.nextDouble();
			System.out.println("Refrigeração:");
			System.out.println("S - Sim");
			System.out.println("N - Não");
			refri = entrada.next().charAt(0);
			refri = Character.toUpperCase(refri);

			while(refri!='S' && refri!='N'){
				System.out.println("Código Inválido!!!");
				System.out.println();
				System.out.println("Digite novamente:");
				System.out.println("Refrigeração:");
				System.out.println("S - Sim");
				System.out.println("N - Não");
				refri = entrada.next().charAt(0);
				refri = Character.toUpperCase(refri);
			}

			System.out.println("Categoria do " + i + "º produto: ");
			System.out.println("A - Alimentação");
			System.out.println("L - Limpeza");
			System.out.println("V - Vestuário");
			categoria = entrada.next().charAt(0);
			categoria = Character.toUpperCase(categoria);

			while(categoria!='A' && categoria!='L' && categoria!='V' ){
				System.out.println("Código Inválido!!!");
				System.out.println();
				System.out.println("Digite novamente:");
				System.out.println("Categoria: ");
				System.out.println("A - Alimentação");
				System.out.println("L - Limpeza");
				System.out.println("V - Vestuário");
				categoria = entrada.next().charAt(0);
				categoria = Character.toUpperCase(categoria);
			}

			//Tabela
			if(preco<=20){
				if(categoria=='A'){
					estoq=2;
				}else
					if(categoria=='L'){
						estoq=3;
					}else
						estoq=4;
			}else
				if(preco<=50){
					if(refri=='S'){
						estoq=6;
					}else{
						estoq=0;
					}			
				}else{
					if(refri=='S'){
						if(categoria=='A'){
							estoq=5;
						}else
							if(categoria=='L'){
								estoq=2;
							}else{
								estoq=4;
							}								
					}else{
						if(categoria=='A' || categoria=='V'){
							estoq=0;
						}else{
							estoq=1;
						}
					}
				}			

			//Imposto
			if(categoria!='A' && refri!='S'){
				imposto=1.02;
			}else{
				imposto=1.04;
			}

			//Preço Final
			precoFinal=estoq+preco*imposto;

			//Tabela Classificação
			if(precoFinal<=20){
				msg="Barato";
				contBarato++;
			}else
				if(precoFinal<100){
					msg="Normal";
					contNormal++;
				}else{
					msg="Caro";
					contCaro++;
				}
			System.out.println(msg);

			//Total Imposto
			imposto=preco*imposto-preco;
			totalImposto=totalImposto+imposto;

			//Médias
			mediaEstoq=mediaEstoq+estoq+imposto;
			mediaImposto=mediaImposto+imposto;

			//Maior e menor preço
			if(i==1){
				maiorPreco=precoFinal;
				menorPreco=precoFinal;
			}else
				if(precoFinal>maiorPreco){
					maiorPreco=precoFinal;
				}else
					if(precoFinal<menorPreco){
						menorPreco=precoFinal;
					}


		}

		//Saídas
		System.out.println("Média dos Custos de Estocagem: "+ mediaEstoq/12 + "%");
		System.out.println("Média dos Custos de Impostos: "+ mediaImposto/12 + "%");
		System.out.println("Maior Preço: " + numFormatado.format(maiorPreco));
		System.out.println("Menor Preço: " + numFormatado.format(menorPreco));
		System.out.println("Total dos Impostos: " + (totalImposto));
		System.out.println("Qtde produtos class Barato: " + contBarato);
		System.out.println("Qtde produtos class Normal: " + contNormal);
		System.out.println("Qtde produtos class Caro: " + contCaro);






		entrada.close();
	}
}
