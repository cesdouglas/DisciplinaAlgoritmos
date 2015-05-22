package ltp.orientacaoobjeto;

public class Livro extends Produto{
	private String autor;
	private String editora;
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	public Livro(String descricao, int codigo, double valor, String autor,
			String editora) {
		super(descricao, codigo, valor);
		this.autor = autor;
		this.editora = editora;
	}
	
	public Livro() {
		super();		
	}
	
	
	
}
