import java.util.Scanner;
public class Principal7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		Pergunta perg1 = new Pergunta ("Autor de Dom Casmurro", "Machado de Assis");
		Pergunta perg3 = new Pergunta ("O mesmo autor desse livro escreveu A revolu��o dos bichos", "1984");
		Pergunta perg2 = new Pergunta ("Autor de Senhor das Moscas ", "William Golding");
		Pergunta perg4 = new Pergunta ("Personagem principal de Admir�vel Mundo Novo", "Bernard Marx");
		PerguntaDificil pd1 = new PerguntaDificil ("Livro de fic��o cientifica mais vendido de todos os tempos", "Duna", "faz parte de uma s�rie liter�ria");
		PerguntaDificil pdf2 = new PerguntaDificil ("Livro mais vendido de todos os tempos", "A B�blia", "Mais de 5 bilh�es de c�pias vendidas");
		
		System.out.println("Voc� est� participando do jogo de adivinha��o sobre livros"
				          + "\nEscreva o nome do primeiro jogador");
		
		String nome1 = sc.next();
		Jogador jogad1 = new Jogador (nome1, 0);
		System.out.println("Digite o nome do segundo jogador");
		String nome2 = sc.next();
		Jogador jogad2 = new Jogador (nome2, 0);
		
		JogoAdivinha��o jogo = new JogoAdivinha��o (jogad1, jogad2, 0, 0);
		System.out.println("A vez de " + jogad1.getNome() +  " jogar");
		jogo.fazerpergunta(nome1, jogad1, perg1);
		jogo.fazerpergunta(nome1, jogad1, perg3);
		System.out.println("A vez de " + jogad2.getNome() +  " jogar");
		jogo.fazerpergunta(nome2, jogad2, perg2);
		jogo.fazerpergunta(nome2, jogad2, perg4);
		
		if (jogo.vencedor() != null) {
			System.out.println("Vencedor: " + jogo.vencedor());
		} else {
			System.out.println("N�o tivemos um vencedor. A seguir uma nova rodada."
					+ "\nA vez � de " + jogad1.getNome());
			jogo.fazerperguntad(jogad1, pd1);
			System.out.println("A vez agora � de " + jogad2.getNome());
			jogo.fazerperguntad(jogad2, pdf2);
			System.out.println("Vencedor: " + jogo.vencedor());
		}
	}

}
