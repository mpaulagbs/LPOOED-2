public class Jogador {
	
		private String nome;
		private int quantidadePontos;
		
		Jogador(String nome, int quantidadePontos){
			this.setNome(nome);
			this.setQuantidadePontos(quantidadePontos);
		}
		
		Jogador () {
			
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getQuantidadePontos() {
			return quantidadePontos;
		}

		public void setQuantidadePontos(int pontos) {
			this.quantidadePontos = pontos;
		}
	}
