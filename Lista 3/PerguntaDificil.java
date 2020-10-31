public class PerguntaDificil extends Pergunta {
	
		private String dica2;
		
		PerguntaDificil (String dica, String resposta, String dica2){
			super(dica, resposta);
			this.setDica2(dica2);
		}
		
		PerguntaDificil () {
			
		}
		
		public String getDica2() {
			return dica2;
		}

		public void setDica2(String dica2) {
			this.dica2 = dica2;
		}
	}
