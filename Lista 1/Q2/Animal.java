
public class Animal {

	protected String nome;
	protected String cor;
	protected String ambiente;
	protected int comprimento;
	protected int numPatas;
	protected double veloz;
	
	Animal (String nome, String cor, String ambiente,  int comprimento, int numPatas, double veloz){
		this.setNome(nome);
		this.setCor(cor);
		this.setAmbiente(ambiente);
		this.setComprimento(comprimento);
		this.setNumPatas(numPatas);
		this.setVeloz(veloz);
	}
	
	Animal (){	
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public int getComprimento() {
		return comprimento;
	}
	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}
	public int getNumPatas() {
		return numPatas;
	}
	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}
	public double getVeloz() {
		return veloz;
	}
	public void setVeloz(double veloz) {
		this.veloz = veloz;
	}
	
}
