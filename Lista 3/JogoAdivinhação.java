import java.util.Scanner;

	public class JogoAdivinhação {
		
		Scanner sc = new Scanner (System.in);
		
		private Jogador jogador1;
		private Jogador jogador2;
		private int pontjogador1;
		private int pontjogador2;
		
		JogoAdivinhação (Jogador jogador1, Jogador jogador2, int pontjogador1, int pontjogador2){
			this.setJogador1(jogador1);
			this.setJogador2(jogador2);
			this.setPontjogador1(pontjogador1);
			this.setPontjogador2(pontjogador2);
		}
		
		JogoAdivinhação () {
			
		}
		
		public String vencedor () {
			if (jogador1.getQuantidadePontos() == jogador2.getQuantidadePontos()){
				return null;
			} if (jogador1.getQuantidadePontos() > jogador2.getQuantidadePontos()) {
				return jogador1.getNome();
			} if (jogador2.getQuantidadePontos() > jogador1.getQuantidadePontos()) {
				return jogador2.getNome();
			} else {
				return null;
			}
		}
		
		public void fazerpergunta (String nomejogador, Jogador jogador, Pergunta pergunta) {
			System.out.println("Dica para que você responda a pergunta: " + pergunta.getDica());
			String resp = sc.nextLine();
			if (resp.contentEquals(pergunta.getResp())) {
				jogador.setQuantidadePontos(jogador.getQuantidadePontos() + 10);
			} else {
				System.out.println("Resposta errada");
			}
		}
		
		public void fazerperguntad (Jogador jogador, PerguntaDificil perguntad) {
			System.out.println("Dica para que você responda a pergunta: " + perguntad.getDica());
			String resp = sc.nextLine();
			if (resp.equals(perguntad.getResp())) {
				jogador.setQuantidadePontos(jogador.getQuantidadePontos() + 20);
			} else {
				System.out.println("Resposta errada. Tente outra vez com a seguinte dica: " + perguntad.getDica2());
				String resp2 = sc.nextLine();
				if (resp2.equals(perguntad.getResp())) {
					jogador.setQuantidadePontos(jogador.getQuantidadePontos() + 10);
				} else {
					System.out.println("Resposta errada");
				}
			}
		}
		
		public Jogador getJogador1() {
			return jogador1;
		}
		public void setJogador1(Jogador jogador1) {
			this.jogador1 = jogador1;
		}
		public Jogador getJogador2() {
			return jogador2;
		}
		public void setJogador2(Jogador jogador2) {
			this.jogador2 = jogador2;
		}
		public int getPontjogador1() {
			return pontjogador1;
		}
		public void setPontjogador1(int pontjogador1) {
			this.pontjogador1 = pontjogador1;
		}
		public int getPontjogador2() {
			return pontjogador2;
		}
		public void setPontjogador2(int pontjogador2) {
			this.pontjogador2 = pontjogador2;
		}
	}
