package lista4;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe14 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		DecimalFormat numFormatado = new DecimalFormat ("R$ ###0.00");

		//Declara��o de vari�veis
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
			System.out.println("Pre�o Unit�rio do : " + i + "� produto: "); 
			preco = entrada.nextDouble();
			System.out.println("Refrigera��o:");
			System.out.println("S - Sim");
			System.out.println("N - N�o");
			refri = entrada.next().charAt(0);
			refri = Character.toUpperCase(refri);

			while(refri!='S' && refri!='N'){
				System.out.println("C�digo Inv�lido!!!");
				System.out.println();
				System.out.println("Digite novamente:");
				System.out.println("Refrigera��o:");
				System.out.println("S - Sim");
				System.out.println("N - N�o");
				refri = entrada.next().charAt(0);
				refri = Character.toUpperCase(refri);
			}

			System.out.println("Categoria do " + i + "� produto: ");
			System.out.println("A - Alimenta��o");
			System.out.println("L - Limpeza");
			System.out.println("V - Vestu�rio");
			categoria = entrada.next().charAt(0);
			categoria = Character.toUpperCase(categoria);

			while(categoria!='A' && categoria!='L' && categoria!='V' ){
				System.out.println("C�digo Inv�lido!!!");
				System.out.println();
				System.out.println("Digite novamente:");
				System.out.println("Categoria: ");
				System.out.println("A - Alimenta��o");
				System.out.println("L - Limpeza");
				System.out.println("V - Vestu�rio");
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

			//Pre�o Final
			precoFinal=estoq+preco*imposto;

			//Tabela Classifica��o
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

			//M�dias
			mediaEstoq=mediaEstoq+estoq+imposto;
			mediaImposto=mediaImposto+imposto;

			//Maior e menor pre�o
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

		//Sa�das
		System.out.println("M�dia dos Custos de Estocagem: "+ mediaEstoq/12 + "%");
		System.out.println("M�dia dos Custos de Impostos: "+ mediaImposto/12 + "%");
		System.out.println("Maior Pre�o: " + numFormatado.format(maiorPreco));
		System.out.println("Menor Pre�o: " + numFormatado.format(menorPreco));
		System.out.println("Total dos Impostos: " + (totalImposto));
		System.out.println("Qtde produtos class Barato: " + contBarato);
		System.out.println("Qtde produtos class Normal: " + contNormal);
		System.out.println("Qtde produtos class Caro: " + contCaro);






		entrada.close();
	}
}
