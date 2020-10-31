
public class Velho extends Imovel {
	
	private double desconto;
	
	Velho(double preco, String domicilio, double desconto) {
		super (preco, domicilio);
		this.setDesconto(desconto);
	}
	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	public void precoN () {
		this.setPreco(this.getPreco() - this.getDesconto());
		System.out.println(this.getPreco());
	}
	}
