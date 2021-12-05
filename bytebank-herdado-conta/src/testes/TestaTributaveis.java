package testes;

import br.com.bytebank.modelos.CalculadorDeImposto;
import br.com.bytebank.modelos.ContaCorrente;
import br.com.bytebank.modelos.SeguroDeVida;

public class TestaTributaveis {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.deposita(1100);

		System.out.println("Saldo conta corrente: " + cc.getSaldo());
		System.out.println("Valor do imposto sobre o saldo: " + cc.getValorImposto());

		SeguroDeVida seguro = new SeguroDeVida();
		System.out.println("Valor da taxa do seguro de vida: " + seguro.getValorImposto());

		CalculadorDeImposto calculador = new CalculadorDeImposto();

		calculador.registra(cc);
		calculador.registra(seguro);

		System.out.println("Total de imposto cobrado em cima de CC: " + calculador.getTotalImposto());

	}

}
