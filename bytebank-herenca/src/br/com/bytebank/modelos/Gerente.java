package br.com.bytebank.modelos;

public class Gerente extends Funcionario implements Autenticavel {
	
	AlteticacaoUtil altenticador;
	
	public Gerente() {
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
		return super.getSalario();
	}
}
