package br.com.util;
import br.com.beans.*;

public class Util {
	public double desconto;
	 public double valorFinal;


	public double descontoDeNatal(double v1, double v2,double v3) {
		if ((v1+v2+v3)>5000){
			desconto=1000;
		}
		valorFinal=v1+v2+v3-desconto;
		return valorFinal;
	}
}
