package nac;
import java.text.DecimalFormat;
import java.util.Scanner;

public class DOUGLASCONSTANTINOCES_RM73872 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat formataMoeda = new DecimalFormat("R$ ###0.00");
		int codigo = 0;
		int cpf = 0;
		int totalItem = 0;
		int quant = 0;
		double valor = 0;
		char condicao = '\u0000';	
		double total = 0;
		double acre = 1.01;
		int parcela = 0;
		char deseja = 'S';
		int venda = 0;
		int vista = 0;
		int prazo = 0;		
		

		while(deseja!='N'){
			System.out.println("__________Venda" + (venda+1) +  "__________");
			System.out.println("Digite seu CPF: ");
			cpf = entrada.nextInt();

			System.out.println("Digite o código do produto: ");
			codigo = entrada.nextInt();

			while(codigo!=0){			
				System.out.println("Digite o valor do produto: ");
				valor = entrada.nextDouble();

				System.out.println("Digite a quantidade de produtos: ");
				quant = entrada.nextInt();	
				
				total+=valor*quant;
				totalItem++;

				System.out.println("Digite o código do produto: ");
				codigo = entrada.nextInt();
				
			}
			
			System.out.println("Dados da Compra: \n Total de itens: " + totalItem + "\n Total da Compra: " + total);
			

			System.out.println("Digite a condição de pagamento V - à vista P - prazo: ");
			condicao = entrada.next().charAt(0);
			condicao = Character.toUpperCase(condicao);
			while(condicao!='V' && condicao!='P'){
				System.out.println("Código Incorreto!!! \n Digite a condição de pagamento V - à vista P - prazo: ");
				condicao = entrada.next().charAt(0);
				condicao = Character.toUpperCase(condicao);				
			}
			
			if(condicao == 'V'){
				total*=0.93;
				vista++;
				System.out.println("Valor Final: " + formataMoeda.format(total));
			}else{
				System.out.println("Formas de parcelamento: ");
				for(int i=3; i<14;i+=2){
					System.out.println("O preço final parcelado em " + i + " X é de " + formataMoeda.format(total*acre) + " com parcelas de " +  formataMoeda.format((total*acre)/i) );
					acre+=0.02;					
				}
				System.out.println("Digite o número de parcelas: ");
				parcela = entrada.nextInt();
				prazo++;
			}

			System.out.println("Deseja cadastrar uma nova venda? S/N");
			deseja = entrada.next().charAt(0);
			deseja = Character.toUpperCase(deseja);
			while(deseja!='S' && deseja!='N'){
				System.out.println("Código incorreto!!! \n Deseja cadastrar uma nova venda? S/N");
				deseja = entrada.next().charAt(0);
				deseja = Character.toUpperCase(deseja);
			}
			totalItem = 0;
			total = 0;
			venda++;
		}
		System.out.println("RELATÓRIO FINAL RICARDO ELETRO");
		System.out.println("Numero de vendas: " + venda);
		System.out.println("Quantidade de vendas à vista: " + vista);
		System.out.println("Quantidade de vendas à prazo: " + prazo);

		entrada.close();
	}
}
