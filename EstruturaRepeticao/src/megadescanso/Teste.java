package megadescanso;
import javax.swing.JOptionPane;

import megadescanso.*;


public class Teste {
	
	public static String texto(String msg){
		return JOptionPane.showInputDialog(msg);
	}

	public static void main(String[] args) {
		Sala s = new Sala();
		s.setAndar(4);
		s.setCapacidade(40);
		s.setNumero(1);
		s.setObservacao("Tatame Liso");
		s.setSequencia(01);
		Modalidade m = new Modalidade();
		m.setCodigo(12);
		m.setDtInicio("20/10/2014");
		m.setModalidade("Kung Fu");
		
		String tipo=texto("Deseja cadastrar aluno ou professor ? (A/P/M)");
			 if ( tipo.equalsIgnoreCase("A") ){
				Aluno a = new Aluno();
				a.setCpf(texto("Digite o CPF"));
				a.setDtMatricula(texto("Digite a  Matricula"));
				a.setDtNascimento(texto("Digite a Data de Nascimento"));
				a.setEmail(texto("Digite o e-mail"));
				a.setEndereco(texto("Digite o endereço"));
			}else  if ( tipo.equalsIgnoreCase("P") ){
				Professor p = new Professor();
			}else if ( tipo.equalsIgnoreCase("M")){
				Medico med = new Medico();
			}
	
		
	}
}
