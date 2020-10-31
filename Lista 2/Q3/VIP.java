
public class VIP extends Ingresso{
	
	protected double adici;
	
	VIP ( double adici, double valor) {
		super(valor);
		this.setAdici(adici);
	}
	
	public double getAdici() {
		return adici;
	}

	public void setAdici(double adici) {
		this.adici = adici;
	}
	public double newvalor () {
		double newvalor = this.getValor() + this.getAdici();
		return newvalor;
	}
}
