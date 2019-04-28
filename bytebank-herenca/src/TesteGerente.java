
public class TesteGerente {

	public static void main(String[] args) {
	    Gerente g1 =  new Gerente();
	    g1.setNome("Israel");
	    g1.setCpf("10777");
	    g1.setSalario(1200);
	    g1.setSenha(12345);
	    
	    System.out.println("nome: "+g1.getNome());
	    System.out.println("cpf: "+g1.getCpf());
	    System.out.println("salario: "+g1.getSalario());
	    System.out.println("Bonificaçao: "+g1.getBonificacao());
	    
	}

}
