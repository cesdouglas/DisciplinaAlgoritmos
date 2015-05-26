package br.com.fiap.beans1;

public class ExameMedico {
	private Medico medico;
	private Aluno aluno;
	private int codigo;
	private String dtAvaliacao;
	private float pressao;
	private int batimentoCardiaco;
	private float altura;
	private float peso;
	private String observacao;
	
	public ExameMedico() {
		super();
	}

	public ExameMedico(Medico medico, Aluno aluno, int codigo,
			String dtAvaliacao, float pressao, int batimentoCardiaco,
			float altura, float peso, String observacao) {
		super();
		this.medico = medico;
		this.aluno = aluno;
		this.codigo = codigo;
		this.dtAvaliacao = dtAvaliacao;
		this.pressao = pressao;
		this.batimentoCardiaco = batimentoCardiaco;
		this.altura = altura;
		this.peso = peso;
		this.observacao = observacao;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDtAvaliacao() {
		return dtAvaliacao;
	}

	public void setDtAvaliacao(String dtAvaliacao) {
		this.dtAvaliacao = dtAvaliacao;
	}

	public float getPressao() {
		return pressao;
	}

	public void setPressao(float pressao) {
		this.pressao = pressao;
	}

	public int getBatimentoCardiaco() {
		return batimentoCardiaco;
	}

	public void setBatimentoCardiaco(int batimentoCardiaco) {
		this.batimentoCardiaco = batimentoCardiaco;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
	
	
}
