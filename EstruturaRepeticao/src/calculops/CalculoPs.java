package calculops;

import javax.swing.JOptionPane;

public class CalculoPs {
	public static void main(String[] args) {		
		double am = 0;
		double nac = 0;
		double ps = 0;
		double mediaSemestral = 6;
		
		
		nac = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da NAC: "));		
		am = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do AM: "));
		
		
//		mediaSemestral = am*0.3 + nac*0.2 + ps*0.5;
		
		
		ps = (mediaSemestral - ((am*0.3) + (nac*0.2)));
		
		System.out.println("Você precisa tirar: " + ps*2);
		System.out.println("Você precisa tirar(convertido): " + ps);
		
		
	}
}
