
public class ContaCorrente extends Conta implements Tributavel {
	public ContaCorrente(int agencia, int numero) {
		super(agencia,numero);
	}
	
	@Override
	public boolean saca(double valor) {
		double novoValor = valor + 0.20;
		return super.saca(novoValor);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}

	@Override
	public double getValorImposto() {
		// TODO Auto-generated method stub
		return super.saldo * 0.01;
	}

	
}
