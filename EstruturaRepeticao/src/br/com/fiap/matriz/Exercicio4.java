package br.com.fiap.matriz;

import java.text.DecimalFormat;

public class Exercicio4 {
	public static void main(String[] args) {
		double vendedorVendaSemanais[][] = new double[5][4];
		double valorMes[] = new double[5];
		double valorTotalMes=0;
		double valorTotalSemana=0;
		double totalTeste = 0;
		
		DecimalFormat numFormatado = new DecimalFormat("R$ ###0.00");
		
		//Atriubuição de valores
		for (int vendedor = 0; vendedor < vendedorVendaSemanais.length; vendedor++) {
			for (int vendaSemanal = 0; vendaSemanal < vendedorVendaSemanais[vendedor].length; vendaSemanal++) {
				vendedorVendaSemanais[vendedor][vendaSemanal] = Math.random()*1000;
			}
		}
		
		//Imprime o total de vendas do mês de cada vendedor
		System.out.println("O total de vendas do mês de cada vendedor");
		for (int vendedor = 0; vendedor < vendedorVendaSemanais.length; vendedor++) {
			System.out.println("Vendedor" + (vendedor+1) + ":");
			for (int vendaSemanal = 0; vendaSemanal < vendedorVendaSemanais[vendedor].length; vendaSemanal++) {
				valorMes[vendedor] += vendedorVendaSemanais[vendedor][vendaSemanal];
			}
			totalTeste+=valorMes[vendedor];
			System.out.println(numFormatado.format(valorMes[vendedor]));
		}
		
		System.out.println("Teste:" + numFormatado.format(totalTeste));
		totalTeste = 0;
		
		//O total de vendas de cada semana (todos os vendedores juntos)
		System.out.println("-------------------------------------------------------------");
		System.out.println("O total de vendas de cada semana (todos os vendedores juntos)");
		for (int vendaSemanal = 0; vendaSemanal < 4; vendaSemanal++) {
			for (int vendedor = 0; vendedor < vendedorVendaSemanais[vendaSemanal].length; vendedor++) {
				valorTotalSemana += vendedorVendaSemanais[vendedor][vendaSemanal];
			}
			totalTeste += valorTotalSemana;
			System.out.println("Semana " + (vendaSemanal+1) + ": " + numFormatado.format(valorTotalSemana));
			valorTotalSemana=0;
		}
		
		System.out.println("Teste:" + numFormatado.format(totalTeste));
		totalTeste = 0;
		
		
		//O total de vendas do mês	
		System.out.println("-------------------------------------------------------------");
		System.out.println("O total de vendas do mês");
		for (double d : valorMes) {
			valorTotalMes += d;
		}
		System.out.println(numFormatado.format(valorTotalMes));
		
	}
}
