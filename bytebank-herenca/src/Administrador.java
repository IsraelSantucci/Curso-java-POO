
public class Administrador extends Funcionario implements Autenticavel {

	AlteticacaoUtil altenticador;
	
	public Administrador() {
		this.altenticador = new AlteticacaoUtil();
	}
	
	@Override
	public void setSenha(int senha) {
		this.altenticador.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) {
		return this.altenticador.autentica(senha);
	}
	
	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return 50;
	}

}
