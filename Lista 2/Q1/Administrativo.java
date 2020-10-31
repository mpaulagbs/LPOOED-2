
	public class Administrativo extends Assistente {
		
		private double adic;
		private String escalas;
		
		Administrativo(String cpf, String nome, double salario, String NumMatricula, String escalas) {
			super(cpf, nome, salario, NumMatricula);
			this.setEscalas(escalas);
		}
		
		public void NovoSal () {
			if (escalas.contentEquals("noite")) {
				this.setSalario(this.getSalario() + this.getAdic());
			}
		}
		public double getAdic() {
			return adic;
		}

		public void setAdic(double adic) {
			this.adic = adic;
		}
		public String getEscalas() {
			return escalas;
		}

		public void setEscalas(String escalas) {
			this.escalas = escalas;
		}
	}
