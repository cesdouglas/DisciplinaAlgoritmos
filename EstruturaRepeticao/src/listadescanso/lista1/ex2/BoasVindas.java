package listadescanso.lista1.ex2;

import java.util.Calendar;

public class BoasVindas {
	private String nome;
	private int rm;
	private Calendar dtNasc;
	private String curso;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getRm() {
		return rm;
	}
	public void setRm(int rm) {
		this.rm = rm;
	}
	public Calendar getDtNasc() {
		return dtNasc;
	}
	public void setDtNasc(Calendar dtNasc) {
		this.dtNasc = dtNasc;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public BoasVindas(String nome, int rm, Calendar dtNasc, String curso) {
		super();
		this.nome = nome;
		this.rm = rm;
		this.dtNasc = dtNasc;
		this.curso = curso;
	}
	
	public BoasVindas() {
		super();
	}
	
	
	
}
