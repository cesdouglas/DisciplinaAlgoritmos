package lista4;
import java.util.Scanner;

public class Exe04 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int nota1, nota2, nota3, totalAprov, totalReprov, totalReprovFreq, freq, matricula;
		double media;
		String msg;
		
		nota1 = 0;
		nota2 = 0;
		nota3 = 0;
		totalAprov = 0;
		totalReprov = 0;
		totalReprovFreq = 0;
		freq = 0;
		matricula = 0;		
		media = 0;
		msg = null;
		


		for(int c=1;c<3;c++){
		   System.out.println("Matrícula:");
		   matricula=entrada.nextInt();
		   System.out.println("Digite as notas:");
		   nota1=entrada.nextInt();
		   nota2=entrada.nextInt();
		   nota3=entrada.nextInt();
		   System.out.println("Frequência:");
		   freq=entrada.nextInt();
		   media=(nota1+nota2+nota3)/3;
		   if((media>=6)&&(freq>=40)){
		      msg=("Aluno Aprovado!");
		      totalAprov++;
		   }else{
		      msg=("Aluno Reprovado!");
		      totalReprov++;
		   }
		   if(freq<40){
		      totalReprovFreq++;
		   }
		   System.out.println("");
		   System.out.println("------------------------------------------");
		   System.out.println("Matrícula:" + matricula);
		   System.out.println("Nota Final:" + media);
		   System.out.println(msg);
		}
	
		System.out.println("");
		System.out.println("------------------------------------------");
		System.out.println("Total de Alunos Aprovados:"  + totalAprov);
		System.out.println("Total de Alunos Reprovados:" +  totalReprov);
		System.out.println("Total de Alunos Reprovados por Frequência:" + totalReprovFreq);
		
		entrada.close();
	}

}
