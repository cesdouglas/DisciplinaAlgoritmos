package ltp.orientacaoobjeto;

public class Produto {
	protected String descricao;
	protected int codigo;
	protected double valor;
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public Produto(String descricao, int codigo, double valor) {
		super();
		this.descricao = descricao;
		this.codigo = codigo;
		this.valor = valor;
	}
	
	public Produto() {
		super();
	}

	
	
}
