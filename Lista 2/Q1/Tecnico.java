
public class Tecnico extends Assistente{
	
	private double extra;
	
	Tecnico(String cpf, String nome, double salario, String NumMatricula) {
		super(cpf, nome, salario, NumMatricula);
	}
	public void NovoSal () {
		this.setSalario(this.getSalario() + this.getExtra());
	}
	public double getExtra() {
		return extra;
	}
	public void setExtra(double bonus) {
		this.extra = bonus;
	}
}

