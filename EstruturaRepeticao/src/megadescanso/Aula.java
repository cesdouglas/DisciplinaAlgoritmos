package megadescanso;

public class Aula {
	private int sequencia;
	private Modalidade modalidade;
	private Sala sala;
	private String dificuldade;
	private String horarioInicio;
	private String duracao;
	
	public Aula() {
		super();
	}

	public Aula(int sequencia, Modalidade modalidade, Sala sala,
			String dificuldade, String horarioInicio, String duracao) {
		super();
		this.sequencia = sequencia;
		this.modalidade = modalidade;
		this.sala = sala;
		this.dificuldade = dificuldade;
		this.horarioInicio = horarioInicio;
		this.duracao = duracao;
	}

	public int getSequencia() {
		return sequencia;
	}

	public void setSequencia(int sequencia) {
		this.sequencia = sequencia;
	}

	public Modalidade getModalidade() {
		return modalidade;
	}

	public void setModalidade(Modalidade modalidade) {
		this.modalidade = modalidade;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public String getDificuldade() {
		return dificuldade;
	}

	public void setDificuldade(String dificuldade) {
		this.dificuldade = dificuldade;
	}

	public String getHorarioInicio() {
		return horarioInicio;
	}

	public void setHorarioInicio(String horarioInicio) {
		this.horarioInicio = horarioInicio;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	
}
