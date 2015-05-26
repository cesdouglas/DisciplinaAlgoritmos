package megadescanso;

public class Sala {
	private int numero;
	private int andar;
	private int sequencia;
	private int capacidade;
	private String observacao;
	
	public Sala() {
		super();
	}

	public Sala(int numero, int andar, int sequencia, int capacidade,
			String observacao) {
		super();
		this.numero = numero;
		this.andar = andar;
		this.sequencia = sequencia;
		this.capacidade = capacidade;
		this.observacao = observacao;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAndar() {
		return andar;
	}

	public void setAndar(int andar) {
		this.andar = andar;
	}

	public int getSequencia() {
		return sequencia;
	}

	public void setSequencia(int sequencia) {
		this.sequencia = sequencia;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
}
