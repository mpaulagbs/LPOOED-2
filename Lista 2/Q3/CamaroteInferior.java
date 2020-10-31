
public class CamaroteInferior extends VIP {
	
	private String lugar;
	
	CamaroteInferior( double adici, double valor, String lugar) {
		super(adici, valor);
		this.setLugar(lugar);
	}
	
	public void exibir () {
		System.out.println(lugar);
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}}
