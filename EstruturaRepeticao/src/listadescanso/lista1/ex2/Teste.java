package listadescanso.lista1.ex2;

public class Teste {
	public static void main(String[] args) {
		BoasVindas b = new BoasVindas();
		
		b.setCurso("TDS");
//		b.setDtNasc(1992,09,29);
//		Não sei utilizar a Classe Calendar
		b.setNome("Douglas");
		b.setRm(73872);
		
		System.out.println("Nome: " + b.getNome() + "\nCurso: " + b.getCurso() + "\nData de Nacimento: " + b.getDtNasc() + "\nRM: " + b.getRm());
	}
}
