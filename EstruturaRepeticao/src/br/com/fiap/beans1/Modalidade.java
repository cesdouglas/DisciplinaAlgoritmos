package br.com.fiap.beans1;

public class Modalidade {
	private int codigo;
	private String modalidade;
	private String dtInicio;
	private String dtTermino;
	
	public Modalidade() {
		super();
	}

	public Modalidade(int codigo, String modalidade, String dtInicio,
			String dtTermino) {
		super();
		this.codigo = codigo;
		this.modalidade = modalidade;
		this.dtInicio = dtInicio;
		this.dtTermino = dtTermino;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public String getDtInicio() {
		return dtInicio;
	}

	public void setDtInicio(String dtInicio) {
		this.dtInicio = dtInicio;
	}

	public String getDtTermino() {
		return dtTermino;
	}

	public void setDtTermino(String dtTermino) {
		this.dtTermino = dtTermino;
	}
		
}
