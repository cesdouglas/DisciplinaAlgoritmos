package br.com.fiap.beans1;

public class PFisica extends Pessoa {
	protected String rg;
	protected String cpf;
	
	public PFisica() {
		super();
	}

	public PFisica(String rg, String cpf) {
		super();
		this.rg = rg;
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
