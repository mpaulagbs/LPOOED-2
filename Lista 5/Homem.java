
public class Homem extends PessoaIMC {
		
		Homem (String nome, String data, double peso, double altura) {
			super(nome, data, peso, altura);
		}

		@Override
		public String ResultadoIMC() {
			if (CalculoIMC() < 20.7) {
				return "Abaixo do peso ideal";
				
			} else if (CalculoIMC() > 20.7 && CalculoIMC() < 26.4) {
				return "Peso ideal";
				
			} else if (CalculoIMC() > 26.4) {
				return "Acima do peso ideal";
				
			} else {
				return null;
			}
		}
}
