package megadescanso;

public class Aluno extends PFisicaAcademia {
	private PJuridica instituicao;
	private String dtMatricula;
	
	public void mostraTudo (Aluno a){
		System.out.println(a.getCpf(),a.getDtMatricula(),getDtNascimento(),a.getEmail(),a.getEndereco(),a.getInstituicao(),a.getNome(),a.getNumeroMatricula());
	}
	
	public Aluno() {
		super();
	}

	public Aluno(PJuridica instituicao, String dtMatricula) {
		super();
		this.instituicao = instituicao;
		this.dtMatricula = dtMatricula;
	}

	public PJuridica getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(PJuridica instituicao) {
		this.instituicao = instituicao;
	}

	public String getDtMatricula() {
		return dtMatricula;
	}

	public void setDtMatricula(String dtMatricula) {
		this.dtMatricula = dtMatricula;
	}
	
}
