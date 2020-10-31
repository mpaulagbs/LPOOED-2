
public class Quadrado extends Retangulo {
		
		Quadrado (double lado){
			this.setLado(lado);
			this.setAltura(lado);
		}
		
		@Override
		public double CalcularArea() {
			double area = Math.pow(lado, 2);
			return area;
		}

		@Override
		public double CalcularPerimetro() {
			double perimetro = 4* lado;
			return perimetro;
		}
}
