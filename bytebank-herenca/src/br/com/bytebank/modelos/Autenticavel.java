package br.com.bytebank.modelos;

public interface Autenticavel {

	public void setSenha(int senha);
	
	public boolean autentica(int senha);
	
}
