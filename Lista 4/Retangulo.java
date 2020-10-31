
public class Retangulo extends Quadrilatero{
	
		protected double lado;
		protected double altura;
		
		Retangulo (double lado, double altura){
			this.setLado(lado);
			this.setAltura(altura);
		}
		
		Retangulo () {
			
		}
		
		@Override
		public double CalcularPerimetro() {
			double perimetro = (2*altura) + (2*lado);
			return perimetro;
		}
		
		@Override
		public double CalcularArea() {
			double area = altura * lado;
			return area;
		}
		public double getLado() {
			return lado;
		}

		public void setLado(double lado) {
			this.lado = lado;
		}

		public double getAltura() {
			return altura;
		}

		public void setAltura(double altura) {
			this.altura = altura;
		}

}
