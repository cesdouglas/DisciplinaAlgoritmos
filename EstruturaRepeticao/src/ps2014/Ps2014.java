package ps2014;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ps2014 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat numFormatado = new DecimalFormat("R$ ###0.00");

		String nome = "null";
		int codigo = 0;
		int categoria = 0;
		int quant = 0;
		double valorCompra = 0;
		double valorTotal = 0;
		double totalVenda = 0;
		double maiorVenda = 0;
		double valor = 0;
		char desejaIngresso = 'S';
		char desejaVenda = 'S';
		int ingresso = 0;
		int ingressoVendido = 0;
		int venda = 0;
		int fp = 0;
		int parcela = 0;

		while (desejaVenda == 'S') {

			System.out.println("Nome do cliente: ");
			nome = entrada.next();
			desejaIngresso = 'S';
			while (desejaIngresso == 'S') {
				System.out.println("Código do Jogo: ");
				codigo = entrada.nextInt();

				while (codigo < 1 || codigo > 7) {
					System.out
							.println("Código inválido!!! \n Código do Jogo: ");
					codigo = entrada.nextInt();
				}

				System.out.println("Categoria: ");
				categoria = entrada.nextInt();

				while (categoria < 1 || categoria > 4) {
					System.out.println("Código inválido!!! \n Categoria: ");
					categoria = entrada.nextInt();
				}

				System.out.println("Quantidade de ingressos: ");
				quant = entrada.nextInt();

				switch (categoria) {
				case 1:
					if (codigo == 1) {
						valor = 990;
					} else if (codigo == 2) {
						valor = 350;
					} else if (codigo == 3) {
						valor = 440;
					} else if (codigo == 4) {
						valor = 660;
					} else if (codigo == 5) {
						valor = 1320;
					} else if (codigo == 6) {
						valor = 660;
					} else {
						valor = 1980;
					}
					break;
				case 2:
					if (codigo == 1) {
						valor = 660;
					} else if (codigo == 2) {
						valor = 270;
					} else if (codigo == 3) {
						valor = 330;
					} else if (codigo == 4) {
						valor = 440;
					} else if (codigo == 5) {
						valor = 880;
					} else if (codigo == 6) {
						valor = 440;
					} else {
						valor = 1320;
					}
					break;

				case 3:
					if (codigo == 1) {
						valor = 440;
					} else if (codigo == 2) {
						valor = 180;
					} else if (codigo == 3) {
						valor = 220;
					} else if (codigo == 4) {
						valor = 330;
					} else if (codigo == 5) {
						valor = 550;
					} else if (codigo == 6) {
						valor = 330;
					} else {
						valor = 880;
					}
					break;
				default:
					if (codigo == 1) {
						valor = 160;
					} else if (codigo == 2) {
						valor = 60;
					} else if (codigo == 3) {
						valor = 110;
					} else if (codigo == 4) {
						valor = 170;
					} else if (codigo == 5) {
						valor = 220;
					} else if (codigo == 6) {
						valor = 170;
					} else {
						valor = 330;
					}
					break;
				}

				valorCompra += valor * quant;
				ingresso += quant;
				valorTotal += valorCompra;

				System.out
						.println("Valor: " + numFormatado.format(valorCompra));

				System.out.println("Deseja comprar mais ingressos? S/N");
				desejaIngresso = entrada.next().charAt(0);
				desejaIngresso = Character.toUpperCase(desejaIngresso);
				while (desejaIngresso != 'S' && desejaIngresso != 'N') {
					System.out
							.println("Código inválido!!! \n Deseja comprar mais ingressos? S/N");
					desejaIngresso = entrada.next().charAt(0);
					desejaIngresso = Character.toUpperCase(desejaIngresso);
				}
			}

			System.out.println("Nome do cliente: " + nome
					+ "\n Quantidade de Ingressos: " + ingresso + "\n Valor: "
					+ valorCompra);

			System.out
					.println("Forma de Pagamento? \n 1 - Pagamento à vista 5% de desconto \n 2 - Pagamento parcelado");
			fp = entrada.nextInt();

			while (fp < 1 || fp > 2) {
				System.out
						.println("Código inválido!!! \n Forma de Pagamento? \n 1 - Pagamento à vista 5% de desconto \n 2 - Pagamento parcelado (máximo 10 parcelas)");
				fp = entrada.nextInt();
			}

			if (fp == 1) {
				valorTotal *= 0.95;
				System.out.println("Valor à vista: "
						+ numFormatado.format(valorCompra));
			} else {
				System.out.println("Número de Parcelas: ");
				parcela = entrada.nextInt();
				while (parcela > 10 || parcela < 1) {
					System.out
							.println("Número de Parcelas Inválido!!! \n Número de Parcelas: ");
					parcela = entrada.nextInt();
				}
				System.out.println("Parcelado: " + parcela + "x"
						+ numFormatado.format(valorCompra / parcela));
			}

			totalVenda += valorTotal;
			ingressoVendido += ingresso;

			if (valorTotal > maiorVenda) {
				maiorVenda = valorTotal;
			}

			System.out.println("Deseja cadastrar uma nova venda? S/N");
			desejaVenda = entrada.next().charAt(0);
			desejaVenda = Character.toUpperCase(desejaVenda);
			while (desejaVenda != 'S' && desejaVenda != 'N') {
				System.out
						.println("Código inválido!!! \n Deseja cadastrar uma nova venda? S/N");
				desejaVenda = entrada.next().charAt(0);
				desejaVenda = Character.toUpperCase(desejaVenda);
			}
			ingresso = 0;
			quant = 0;
			valorCompra = 0;
			valorTotal = 0;
			venda++;
		}

		System.out.println("Total de Ingressos Vendidos: " + ingressoVendido
				+ "\n Total de Vendas Realizadas: " + venda
				+ "\n Valor Total das Vendas: "
				+ numFormatado.format(totalVenda) + "\n Valor da Maior Venda: "
				+ maiorVenda);

		entrada.close();
	}
}
