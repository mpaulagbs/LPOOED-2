
public abstract class PessoaIMC extends Pessoa{
	
	protected double peso;
	protected double altura;
	
	PessoaIMC(String nome, String data, double peso, double altura) {
		super(nome, data);
		this.setPeso(peso);
		this.setAltura(altura);
	}
	
	public double CalculoIMC () {
		double IMC = peso/(altura * altura);
		return IMC;
	}
	
	public abstract String ResultadoIMC ();

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public String toString() {
		return "Nome = " + nome + "\nDatanascimento = " + DataDeNascimento + "\nPeso = " + peso + "\nAltura = " + altura;
	}


	
}
