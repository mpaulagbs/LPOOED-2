
public class Mulher extends PessoaIMC{

			Mulher(String nome, String data, double peso, double altura) {
				super(nome, data, peso, altura);
			}

			@Override
			public String ResultadoIMC() {
				if (CalculoIMC() < 19) {
					return "Abaixo do peso ideal";
					
				} else if (CalculoIMC() > 19 && CalculoIMC() < 25.8) {
					return "Peso ideal";
					
				} else if (CalculoIMC() > 25.8) {
					return "Acima do peso ideal";
					
				} else {
					return null;
				}
			}
}
