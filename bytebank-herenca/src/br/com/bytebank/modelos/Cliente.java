package br.com.bytebank.modelos;

public class Cliente implements Autenticavel{
	
	AlteticacaoUtil altenticador;
	
	public Cliente() {
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

}
