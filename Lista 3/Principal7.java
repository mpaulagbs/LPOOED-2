import java.util.Scanner;
public class Principal7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		Pergunta perg1 = new Pergunta ("Autor de Dom Casmurro", "Machado de Assis");
		Pergunta perg3 = new Pergunta ("O mesmo autor desse livro escreveu A revolução dos bichos", "1984");
		Pergunta perg2 = new Pergunta ("Autor de Senhor das Moscas ", "William Golding");
		Pergunta perg4 = new Pergunta ("Personagem principal de Admirável Mundo Novo", "Bernard Marx");
		PerguntaDificil pd1 = new PerguntaDificil ("Livro de ficção cientifica mais vendido de todos os tempos", "Duna", "faz parte de uma série literária");
		PerguntaDificil pdf2 = new PerguntaDificil ("Livro mais vendido de todos os tempos", "A Bíblia", "Mais de 5 bilhões de cópias vendidas");
		
		System.out.println("Você está participando do jogo de adivinhação sobre livros"
				          + "\nEscreva o nome do primeiro jogador");
		
		String nome1 = sc.next();
		Jogador jogad1 = new Jogador (nome1, 0);
		System.out.println("Digite o nome do segundo jogador");
		String nome2 = sc.next();
		Jogador jogad2 = new Jogador (nome2, 0);
		
		JogoAdivinhação jogo = new JogoAdivinhação (jogad1, jogad2, 0, 0);
		System.out.println("A vez de " + jogad1.getNome() +  " jogar");
		jogo.fazerpergunta(nome1, jogad1, perg1);
		jogo.fazerpergunta(nome1, jogad1, perg3);
		System.out.println("A vez de " + jogad2.getNome() +  " jogar");
		jogo.fazerpergunta(nome2, jogad2, perg2);
		jogo.fazerpergunta(nome2, jogad2, perg4);
		
		if (jogo.vencedor() != null) {
			System.out.println("Vencedor: " + jogo.vencedor());
		} else {
			System.out.println("Não tivemos um vencedor. A seguir uma nova rodada."
					+ "\nA vez é de " + jogad1.getNome());
			jogo.fazerperguntad(jogad1, pd1);
			System.out.println("A vez agora é de " + jogad2.getNome());
			jogo.fazerperguntad(jogad2, pdf2);
			System.out.println("Vencedor: " + jogo.vencedor());
		}
	}

}
