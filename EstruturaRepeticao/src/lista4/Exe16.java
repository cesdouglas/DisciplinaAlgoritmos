package lista4;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Exe16 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat numFormatado = new DecimalFormat("R$ ###0.00");
		String nome = null;
		char sexo = '\u0000';
		char classe = '\u0000';
		int dias = 0;
		String opcao = null;
		int km = 0;
		double valorTarifa = 0;
		double totalLoca = 0;
		int tc = 0;
		int tl = 0;
		double maiorLoca = 0;
		
		for(int i=1; i<4; i++){			
			System.out.println(i + "º Locação");
			System.out.println("Nome: ");
			nome = entrada.next();
			System.out.println("Sexo: ");
			System.out.println("M - Masculino");
			System.out.println("F - Feminino");
			sexo = entrada.next().charAt(0);
			sexo = Character.toUpperCase(sexo);
			System.out.println("Classe: ");
			System.out.println("A - Econômico");
			System.out.println("F - Intermediário");
			System.out.println("H - Executivo");
			classe = entrada.next().charAt(0);
			classe = Character.toUpperCase(classe);
			System.out.println("Dias: ");
			dias = entrada.nextInt();
			System.out.println("Opção: ");
			System.out.println("TC - Tarifa Controlada");
			System.out.println("TL - Tarifa Livre");		
			opcao = entrada.next();
			while(!opcao.equalsIgnoreCase("TC") && !opcao.equalsIgnoreCase("TL")){
				System.out.println("Opção Inválida!!!");
				System.out.println("Opção: ");
				System.out.println("TC - Tarifa Controlada");
				System.out.println("TL - Tarifa Livre");		
				opcao = entrada.next();
			}
			if(opcao.equalsIgnoreCase("TC")){
				System.out.println("KM: ");
				km=entrada.nextInt();
			}
			if(classe=='A'){
				if(opcao.equalsIgnoreCase("TC")){
					valorTarifa = dias*29.9+km*0.46;
				}else{
					valorTarifa = dias*89.9;
				}
			}else
				if(classe=='F'){
					if(opcao.equalsIgnoreCase("TC")){
						valorTarifa = dias*85.9+km*0.9; 
					}else{
						valorTarifa = dias*158.9;
					}
				}else{
					if(opcao.equalsIgnoreCase("TC")){
						valorTarifa = dias*137.9+km*1.5;
					}else{
						valorTarifa = dias*274;
					}
				}
			
			if(opcao.equalsIgnoreCase("TC")){
				tc++;
			}else{
				tl++;
			}
			
			totalLoca=totalLoca+valorTarifa;
			
			System.out.println("Valor da Locação: " + numFormatado.format(valorTarifa));
			
			if(valorTarifa>maiorLoca){
				maiorLoca=valorTarifa;
			}
		}
		
		System.out.println("Valor total das locações: " + numFormatado.format(totalLoca));
		System.out.println("Locações para TC: " + tc);
		System.out.println("Locações para TL: " + tl);				
		System.out.println("Valor da maior locação: " + numFormatado.format(maiorLoca));				
		
		entrada.close();
	}

}
