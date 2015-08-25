package br.com.fiap.matriz;


public class GeracaoNumberRandom {

	public static void main(String[] args) {
		
		System.out.println(randomInteger(500));
		
	}

	public static int randomInteger(int range) {

		return (int) (Math.random() * range);
	}
}
