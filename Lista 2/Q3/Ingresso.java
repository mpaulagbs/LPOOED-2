
public class Ingresso {

	protected double valor;

	Ingresso (double valor){
		this.setValor(valor);
	}
	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public void exibirvalor () {
		System.out.println("Valor do ingresso: " + valor);
	}
	
}
