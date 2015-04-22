package ExerciciosRepeticao;
import java.util.Scanner;

public class Exe02 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int idade, cont1, cont2, cont3, cont4, cont5;
		double porc;
				
		idade = 0;
		cont1 = 0;
		cont2 = 0;
		cont3 = 0;
		cont4 = 0;
		cont5 = 0;
		porc = 0;
		

		for(int cont=1;cont<5;cont++){
		   System.out.println("Idade:");
		   idade=entrada.nextInt();
		   if(idade<15){
		      cont1++;
		   }else{
		      if(idade<=30){
		         cont2++;		    
		      }else{
		         if(idade<=45){
		            cont3++;		         
		         }else{
		            if(idade<=60){
		               cont4++;
		            }else{
		               cont5++;
		             }  
		          }
		       }            
		    }
		}

		porc=cont1/5;



		System.out.println("-------------------------------------------");
		System.out.println("Faixa Etária");
		System.out.println("1ª:" + cont1);
		System.out.println("2ª:" + cont2);
		System.out.println("3ª:" + cont3);
		System.out.println("4ª:" + cont4);
		System.out.println("5ª:" + cont5);
		System.out.println();
		System.out.println("Percentual 1ª:" + porc + ("%"));
		
		entrada.close();
	}
	
	

}
