package semestre2.alg.exfixacao;

public class Ex3 {

	public static void main(String[] args){
		int vetor1[] = {3,5,4,2,2,5,3,2,5,9};
		int vetor2[] = {7,15,20,0,18,4,55,23,8,6};
		int vetorResultante[] = new int[20];
		int n=0;
		
		for(int i = 0; i<20; i++){
			vetorResultante[i] = vetor1[n];
			i++;
			vetorResultante[i] = vetor2[n];			
			n++;
		}
		
		for(int i = 0; i<20; i++){
			System.out.print("["+vetorResultante[i]+"], ");
		}

	}

}
