package br.com.bytebank.testes;
import br.com.bytebank.modelos.Funcionario;
import br.com.bytebank.modelos.Gerente;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario nico = new Gerente();
		
		nico.setSalario(1600);
		nico.setNome("nico pereira");
		nico.setCpf("122.122.122-34");
		
		System.out.println(nico.getNome());
		System.out.println(nico.getCpf());
		System.out.println(nico.getBonificacao());
		
		Gerente joao = new Gerente();
		
		joao.setNome("Joao da neves");
		joao.setSenha(123);
		joao.setSalario(2000.00);
		
		boolean autenticacao = joao.autentica(123);
		System.out.println(joao.getNome());
		System.out.println(joao.getSalario());
		System.out.println(joao.getCpf());
		System.out.println(joao.getBonificacao());
		System.out.println(autenticacao);
		
	}

}
