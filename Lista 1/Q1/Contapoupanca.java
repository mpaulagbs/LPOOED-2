
public class Contapoupanca extends Conta {
	
	private int DiaRendimento;
	
	Contapoupanca(String nome, String numConta, double saldo, int DiaRendimento) {
		super(nome, saldo, numConta);
		this.setDiaRendimento(DiaRendimento);
	}
	
	public double NovoSaldo (double taxa) {
		return saldo += taxa;
	}
	
	public int getDiaRendimento() {
		return DiaRendimento;
	}

	public void setDiaRendimento(int DiaRendimento) {
		this.DiaRendimento = DiaRendimento;
	}
}
