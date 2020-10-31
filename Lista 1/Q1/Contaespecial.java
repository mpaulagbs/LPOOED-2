
public class Contaespecial extends Conta {
		
	private double extremo;

	Contaespecial(String nome, String numConta, double saldo, double extremo) {
		super(nome, saldo, numConta);
		this.setExtremo(extremo);
	}
	@Override
	
	public void sacar (double valor) {
		this.setSaldo(this.getSaldo() - valor);
	}

	public double getExtremo() {
		return extremo;
	}

	public void setExtremo(double extremo) {
		this.extremo = extremo;
	}
}