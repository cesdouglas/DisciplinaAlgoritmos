package megadescanso;

public class ProfessorModalidade {
	private String dtAptidao;
	private Professor professor;
	private Modalidade modalidade;
	
	public ProfessorModalidade() {
		super();
	}

	public ProfessorModalidade(String dtAptidao, Professor professor,
			Modalidade modalidade) {
		super();
		this.dtAptidao = dtAptidao;
		this.professor = professor;
		this.modalidade = modalidade;
	}

	public String getDtAptidao() {
		return dtAptidao;
	}

	public void setDtAptidao(String dtAptidao) {
		this.dtAptidao = dtAptidao;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Modalidade getModalidade() {
		return modalidade;
	}

	public void setModalidade(Modalidade modalidade) {
		this.modalidade = modalidade;
	}
	
	
}
