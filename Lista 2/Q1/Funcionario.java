
public class Funcionario {

	protected double salario;
	protected String cpf;
	protected String nome;
	
	Funcionario(double salario, String cpf, String nome){
		this.setSalario(salario);
		this.setCpf(cpf);
		this.setNome(nome);
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void console () {
		System.out.println("Nome: " + nome + "\n Cpf: " + cpf + "\n Salario: " + salario);
	}
}
