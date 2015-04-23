package ExerciciosRepeticao;
import java.util.Scanner;

public class Exe12 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		String sexo = null;
		int mes = 0;
		int crianca = 0;
		int sexoM = 0;
		int sexoF = 0;
		int nasc24 = 0;
		
		System.out.println("Numero de crian�as nascida no per�odo: ");
		crianca = entrada.nextInt();
		
		while(crianca==0){
			System.out.println("Numero de crian�as nascida no per�odo: ");
			crianca = entrada.nextInt();
		}
		
		for(int i=1;i<=crianca;i++){
			System.out.println("Digite o sexo da " + i + "� crian�a: ");
			sexo=entrada.next();
			
			while((!sexo.equalsIgnoreCase ("f")) && !(sexo.equalsIgnoreCase("m"))){
				System.out.println("Digite o sexo da " + i + "� crian�a: ");
				sexo=entrada.next();
			}
			
			if(sexo.equalsIgnoreCase("m")){
				sexoM++;
			}else{
				sexoF++;
			}
			
			System.out.println("Digite o tempo de vida (em meses) da " + i + "� crian�a: ");
			mes=entrada.nextInt();
			
			if(mes<=24){
				nasc24++;
			}
		}
		
	
		
		System.out.println("Percentagem de crian�as do sexo M: "+(double)sexoM/crianca*100+("%"));
		System.out.println("Percentagem de crian�as do sexo F: "+(double)sexoF/crianca*100+("%"));
		System.out.println("Percentagem que viveram 24 meses ou menos: " +(double)nasc24/crianca*100+("%"));
		
		entrada.close();
	}
}
