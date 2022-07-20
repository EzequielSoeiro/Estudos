

//new ContaCorrente()
public class ContaCorrente extends Conta  implements Tributavel {
	
	private double ValorImposto;
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
        super.saldo += valor;
    }

	@Override
	public double getValorImposto() {
		return this.saldo * 0.01;
	}
	
}
