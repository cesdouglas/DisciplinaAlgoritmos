package lista4;
import javax.swing.JOptionPane;


public class Exe03 {
	public static void main(String[] args) {
		int cont=0;
		int cand1=0;
		int cand2=0;
		int cand3=0;
		int cand4=0;
		int branco=0;
		int nulo=0;
		double total=0;
		double percNulo=0;
		double percBranco=0;

		String d_cont = JOptionPane.showInputDialog("Digite o número do candidato");

		cont = Integer.parseInt(d_cont);


		while (cont!=0){
			if (cont==1){
				cand1++;
			} else if (cont==2){
				cand2++;
			} else if (cont==3){
				cand3++;
			} else if (cont==4){
				cand4++;
			} else if (cont==5){
				nulo++;
			} else if (cont==6){
				branco++;
			} else {
				System.out.println("Voto Inválido!");
				total--;
			}
			if (cont<7) {
				System.out.println("Voto computado com sucesso!");
			}
			total++;

			d_cont = JOptionPane.showInputDialog("Digite o número do candidato");
			cont = Integer.parseInt(d_cont);

		}

		percBranco=branco/total*100;
		percNulo=nulo/total*100;


		System.out.println("Total de Votos Candidato 1:" + cand1);
		System.out.println("Total de Votos Candidato 2:" + cand2);
		System.out.println("Total de Votos Candidato 3:" + cand3);
		System.out.println("Total de Votos Candidato 4:" + cand4);
		System.out.println("Total de Votos Nulos:" + nulo);
		System.out.println("Total de Votos Brancos:" + branco);
		System.out.println("Porcentagem de votos nulos:" + percNulo + "%");
		System.out.println("Porcentagem de votos brancos:" + percBranco + "%");


	}
}
