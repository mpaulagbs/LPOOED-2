public class Gerente extends Funcionario {
	
		private String depart;
		
		Gerente(String cpf, String nome, double salario, String depart) {
			super(salario, cpf, nome);
			this.setDepart(depart);
		}
		public String getDepart() {
			return depart;
		}
		public void setDepart(String depart) {
			this.depart = depart;
		}
	}

