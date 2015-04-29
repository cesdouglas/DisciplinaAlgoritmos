package lista4;

public class Exe18 {

	public static void main(String[] args) {
	
		double salario = 2000;
		double aumento = 0.015;
		int ano = 2010;
		
		for(int i=1;i<6 ;i++){
			if(i==1){
				System.out.println("Ano " + ano +  " salário: " + salario);
			}
			ano++;
			salario=salario+(salario*aumento);
			System.out.println("Ano " + ano +  " salário: " + salario);
			aumento*=2;
		}
		
	}

}
