import java.util.Scanner;
import java.util.ArrayList;
public class Principal2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		ArrayList <Animal> array = new ArrayList <Animal> ();
		boolean cont = true;
		Peixe px = null;
		Mamifero mf = null;
		
		while (cont) {
			System.out.println("1) Incluir dados relativo a um peixe;\r\n" + 
					"2) Incluir dados relativo a um mamífero;\r\n" + 
					"3) Listar todos os animais cadastrados;\r\n" + 
					"4) Lista todos os peixes cadastrados;\r\n" +
					"5) Sair");
			
			int op = sc.nextInt();
			switch (op) {
			case 1:
				System.out.println("Digite o nome do peixe");
				String nome = sc.next();
				System.out.println("Digite o comprimento do peixe");
				int comprimento = sc.nextInt();
				System.out.println("Digite a velocidade do peixe, em m/s");
				double velocidade = sc.nextDouble();
				px = new Peixe (nome,comprimento, velocidade);
				array.add(px);
				break;
				
			case 2:
				System.out.println("Digite o nome do mamifero");
				String nomeMamifero = sc.next();
				System.out.println("Digite o comprimento do mamifero");
				int compMamifero = sc.nextInt();
				System.out.println("Digite o número de patas do mamifero");
				int numPatasMamifero = sc.nextInt();
				System.out.println("Digite a cor do mamifero");
				String corMamifero = sc.next();
				System.out.println("Digite a velocidade do mamifero, em m/s");
				double veloMamifero = sc.nextDouble();
				System.out.println("Digite a comida favorita do mamifero");
				String fav = sc.next();
				mf = new Mamifero (nomeMamifero, compMamifero, numPatasMamifero, corMamifero, veloMamifero, fav);
				array.add(mf);
				break;
				
			case 3:
				if (px == null | mf == null) {
					System.out.println("Cadastre um animal");
				} else {
					for (int x=0; x<array.size(); x++) {
					System.out.println(array.get(x).getNome());
					}
				}
				break;
				
			case 4:
				if (px == null) {
					System.out.println("Cadastre um Peixe");
				} else {
					for (int x=0; x<array.size(); x++) {
						if (array.get(x) instanceof Peixe) {
							System.out.println(array.get(x).getNome());
						}
					}
				}
				break;
				
			case 5:
				cont = false;
				break;
			}
		}
	}
}
