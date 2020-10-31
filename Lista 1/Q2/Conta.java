
public class Conta {

	protected String nome;
	protected double saldo;
	protected String numConta;
	
	Conta (String nome, double saldo, String numConta){
		this.setNome(nome);
		this.setSaldo(saldo);
		this.setNumConta(numConta);
	}
	
	public void sacar (double valor) {
		saldo -= valor;
	}
	
	public void deposito (double valor) {
		saldo += valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
