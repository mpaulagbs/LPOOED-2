
public class Circulo extends Quadrilatero {
	
		private double raio;
		
		Circulo(double raio){
			this.setRaio(raio);
		}
		
		@Override
		public double CalcularPerimetro() {
			double perimetro = Math.PI * 2 * raio;
			return perimetro;
		}
		
		@Override
		public double CalcularArea() {
			double area = Math.PI * Math.pow(raio, 2);
			return area;
		}

		public double getRaio() {
			return raio;
		}
		public void setRaio(double raio) {
			this.raio = raio;
		}
}
