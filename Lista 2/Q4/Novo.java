
public class Novo extends Imovel {
	
	private double adic;
	
	Novo(double preco, String domicilio, double adic) {
		super(preco, domicilio);
		this.setAdic(adic);
	}
	
	public double getAdic() {
		return adic;
	}

	public void setAdic(double adic) {
		this.adic = adic;
	} 
	
	public void novoP () {
		this.setPreco(this.getPreco() + this.getAdic());
		System.out.println("Pre�o do imovel com o pre�o adicional: " + this.getPreco());
	}
}
