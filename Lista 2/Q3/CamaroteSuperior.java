
public class CamaroteSuperior extends VIP {
	
		private double adiciLv;
		
		CamaroteSuperior( double adici, double valor, double adiciLv) {
			super( adici, valor);
			this.setAdiciLv(adiciLv);
		}
		
		public double valorN () {
			double valorN = this.getValor() + this.getAdici() + this.getAdiciLv();
			return valorN;
		}

		public double getAdiciLv() {
			return adiciLv;
		}

		public void setAdiciLv(double adiciLv) {
			this.adiciLv = adiciLv;
		}
}
