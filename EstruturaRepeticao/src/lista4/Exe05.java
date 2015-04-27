package lista4;
import java.util.Scanner;


public class Exe05 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int id, pessoa, opA, opB, opC, opD, opE, soma;
		double media;
		String op;
		
		id=0;
		pessoa = 0;
		opA = 0;
		opB = 0;
		opC = 0;
		opD = 0;
		opE = 0;
		soma = 0;
		media = 0;
		op = null;		


		do{
		   System.out.println("Idade:");
		   id=entrada.nextInt();
		   if (id != 0){
			  System.out.println("");
		      System.out.println("Digite a letra correspondente a opinião sobre o filme:");
		      System.out.println("A - Ótimo");
		      System.out.println("B - Bom");
		      System.out.println("C - Regular");
		      System.out.println("D - Ruim");
		      System.out.println("E - Péssimo");
		      op=entrada.next();
		      while ((op != "A") && (op != "B") && (op != "C") && (op != "D") && (op != "E")){
		         System.out.println("Código Inválido!");
		         System.out.println("Digite a letra correspondente a opinião sobre o filme:");
		         System.out.println("A - Ótimo");
		         System.out.println("B - Bom");
		         System.out.println("C - Regular");
		         System.out.println("D - Ruim");
		         System.out.println("E - Péssimo");
		         op=entrada.next();
		      }
		      pessoa++;
		      soma=soma+id;
		      if(op == "A"){
		    	  opA++;
		      }else{
		         if(op == "B"){
		            opB++;
		         }else{
		            if(op == "C"){
		               opC++;
		            }else{
		               if(op == "D"){
		                  opD++;
		               }else{
		                  opE++;
		               }
		             }
		          }		     
		      }
		   }
		   
		}while(id==0);

		media=soma/pessoa;


		System.out.println();
		System.out.println("-------------------------------");
		System.out.println("Quantidade de pessoas" + pessoa);
		System.out.println("Média de Idade:" + media);
		System.out.println("Porcentagem de cada uma das Respostas:");
		System.out.println(opA/pessoa*100 + ("%"));
		System.out.println(opB/pessoa*100 + ("%"));
		System.out.println(opC/pessoa*100 + ("%"));
		System.out.println(opD/pessoa*100 + ("%"));
		System.out.println(opE/pessoa*100 + ("%"));
		
		entrada.close();

	}
}
