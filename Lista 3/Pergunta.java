public class Pergunta {
	
		protected String dica;
		protected String resp;
		
		Pergunta(String dica, String resp){
			this.setDica(dica);
			this.setResp(resp);
		}
		
		Pergunta () {
			
		}
		
		public String getDica() {
			return dica;
		}
		public void setDica(String dica) {
			this.dica = dica;
		}
		public String getResp() {
			return resp;
		}
		public void setResp(String resp) {
			this.resp = resp;
		}
	}
