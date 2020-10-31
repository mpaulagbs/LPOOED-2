
public class Assistente extends Funcionario {
	
	protected String NumMatricula;
	
	Assistente(String cpf, String nome, double salario, String NumMatricula) {
		super( salario, cpf, nome);
		this.setNumMatricula(NumMatricula);
	}
	
	@Override
	public void console () {
		System.out.println("Nome: " + nome + "\n Cpf: " + cpf + "\n Salario: " + salario + "\n Número de matricula: " + NumMatricula);
	}

	public String getNumMatricula() {
		return NumMatricula;
	}

	public void setNumMatricula(String numMatricula) {
		NumMatricula = numMatricula;
	}
	}
