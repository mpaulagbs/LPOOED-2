
public class Imovel {

	protected double preco;
	protected String domicilio;
	
	Imovel(double preco, String domicilio){
		this.setDomicilio(domicilio);
		this.setPreco(preco);
	}
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
}
