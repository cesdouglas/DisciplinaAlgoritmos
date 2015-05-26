package megadescanso;

public class Frequencia {
	private int sequencia;
	private Aula aula;
	private ProfessorModalidade professor;
	private String dtAula;
	
	public Frequencia() {
		super();
	}

	public Frequencia(int sequencia, Aula aula, ProfessorModalidade professor,
			String dtAula) {
		super();
		this.sequencia = sequencia;
		this.aula = aula;
		this.professor = professor;
		this.dtAula = dtAula;
	}

	public int getSequencia() {
		return sequencia;
	}

	public void setSequencia(int sequencia) {
		this.sequencia = sequencia;
	}

	public Aula getAula() {
		return aula;
	}

	public void setAula(Aula aula) {
		this.aula = aula;
	}

	public ProfessorModalidade getProfessor() {
		return professor;
	}

	public void setProfessor(ProfessorModalidade professor) {
		this.professor = professor;
	}

	public String getDtAula() {
		return dtAula;
	}

	public void setDtAula(String dtAula) {
		this.dtAula = dtAula;
	}
	
	
	
}
