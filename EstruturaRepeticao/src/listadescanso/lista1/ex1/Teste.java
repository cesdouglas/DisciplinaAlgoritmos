package listadescanso.lista1.ex1;

public class Teste {	
	public static void main(String[] args) {
		Carro c = new Carro();
		
		c.setCor("Azul");
		c.setModelo("Fusca");
		
		System.out.println("Cor: "+ c.getCor() + "\nModelo: " + c.getModelo());
	}
}
