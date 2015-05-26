package br.com.fiap.beans1;

public class PFisicaAcademia extends PFisica {
	protected int numeroMatricula;
	protected String dtNascimento;
	protected char sexo;
	
	
	public PFisicaAcademia() {
		super();
	}

	public PFisicaAcademia(int numeroMatricula, String dtNascimento, char sexo) {
		super();
		this.numeroMatricula = numeroMatricula;
		this.dtNascimento = dtNascimento;
		this.sexo = sexo;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}

	public String getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(String dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	
}
