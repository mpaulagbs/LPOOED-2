
public class Peixe extends Animal {

	private String caract;
	Peixe(String nome,String cor, String ambiente, int comprimento, int numPatas, double veloz) {
		super(nome, cor, ambiente, comprimento, numPatas, veloz);
	}
	
	Peixe(String nome, int comprimento, double veloz) {
		this.setNome(nome);
		this.setComprimento(comprimento);
		this.setNumPatas(0);
		this.setCor("Cinza");
		this.setAmbiente("Marinho");
		this.setVeloz(veloz);
		this.setCaract("barbatanas e caudas");
	}

	public String getCaract() {
		return caract;
	}

	public void setCaract(String caract) {
		this.caract = caract;
	}
}
