
public class Pessoa {

	protected String nome;
	protected String DataDeNascimento;
	
	Pessoa (String nome, String DataDeNascimento){
		this.setNome(nome);
		this.setDataDeNascimento(DataDeNascimento);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataDeNascimento() {
		return DataDeNascimento;
	}

	public void setDataDeNascimento(String DataDeNascimento) {
		this.DataDeNascimento = DataDeNascimento;
	}
	public String toString() {
		return "Nome = " + nome + "\nDataDeNascimento = " + DataDeNascimento;
	}

}
