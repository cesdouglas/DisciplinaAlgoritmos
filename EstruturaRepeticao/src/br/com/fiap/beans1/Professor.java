package br.com.fiap.beans1;

public class Professor extends PFisicaAcademia{
	private String apelido;
	
	public Professor() {
		super();
	}

	public Professor(String apelido) {
		super();
		this.apelido = apelido;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}	
}
