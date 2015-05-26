package megadescanso;

public class PJuridica extends Pessoa {
	protected String cnpj;
	protected String url;
	protected String contato;
	private int qtdFuncionario;
	private double PercentualDesconto;
	private int codigo;
	
	public PJuridica() {
		super();
	}

	public PJuridica(String cnpj, String url, String contato,
			int qtdFuncionario, double percentualDesconto, int codigo) {
		super();
		this.cnpj = cnpj;
		this.url = url;
		this.contato = contato;
		this.qtdFuncionario = qtdFuncionario;
		PercentualDesconto = percentualDesconto;
		this.codigo = codigo;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public int getQtdFuncionario() {
		return qtdFuncionario;
	}

	public void setQtdFuncionario(int qtdFuncionario) {
		this.qtdFuncionario = qtdFuncionario;
	}

	public double getPercentualDesconto() {
		return PercentualDesconto;
	}

	public void setPercentualDesconto(double percentualDesconto) {
		PercentualDesconto = percentualDesconto;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
}
