package listadescanso.lista1.ex1;

public class Carro {
	private String modelo;
	private String cor;
	
	public void setModelo(String modelo){
		this.modelo = modelo;
	}
	
	public String getModelo(){
		return modelo;
	}
	
	public void setCor(String cor){
		this.cor = cor;
	}
	
	public String getCor(){
		return cor;
	}

	public Carro(String modelo, String cor) {
		super();
		this.modelo = modelo;
		this.cor = cor;
	}

	public Carro() {
		super();
	}	
	
}
