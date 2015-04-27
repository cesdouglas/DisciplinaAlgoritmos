package lista4;
import java.util.Scanner;
public class Exe07 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int canal = 1;
		int pessoas = 0;
		double total = 0;
		int cont4 = 0;
		int cont5 = 0;
		int cont7 = 0;
		int cont12 = 0;
		
		while(canal!=0){
			System.out.println("Canal: ");
			canal=entrada.nextInt();			
			while(canal!=0 && canal!=4 && canal!=5 && canal!=7 && canal!=12){	
				System.out.println("Canal Incorreto!!!");
				System.out.println("Digite o Canal Correto: ");
				canal=entrada.nextInt();
			}
			if(canal!=0){
				System.out.println("Pessoas: ");
				pessoas=entrada.nextInt();
				if(canal==4){
					cont4=pessoas+cont4;
				}else
					if(canal==5){
						cont5=pessoas+cont5;
					}else
						if(canal==7){
							cont7=cont7+pessoas;
						}else{
								cont12=cont12+pessoas;
							}
			}
			
						
		}
		total=cont4+cont5+cont7+cont12;
				
		System.out.println("Porcentagem de Audiência:");
		System.out.println("Canal 4: " + cont4/total*100 + "%");
		System.out.println("Canal 5: " + cont5/total*100 + "%");
		System.out.println("Canal 7: " + cont7/total*100 + "%");
		System.out.println("Canal 12: " + cont12/total*100 + "%");
		
		
		entrada.close();
	}
}
