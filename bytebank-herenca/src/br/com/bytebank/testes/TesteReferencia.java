package br.com.bytebank.testes;
import br.com.bytebank.modelos.ControleBonificacao;
import br.com.bytebank.modelos.EditorDeVideo;
import br.com.bytebank.modelos.Funcionario;
import br.com.bytebank.modelos.Gerente;

public class TesteReferencia {

	public static void main(String[] args) {
		Funcionario g1 = new Gerente();
		g1.setNome("Israel");
		g1.setSalario(5000);
		
	
		
		Funcionario ev = new EditorDeVideo();
		ev.setSalario(2500);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		
		controle.registra(ev);
		System.out.println(controle.getSoma());
		
		System.out.println(g1.getBonificacao());
		
		System.out.println(ev.getBonificacao());

	}

}
