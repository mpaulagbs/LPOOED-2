import java.util.Scanner;
import java.util.ArrayList;
public class Principal8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		ArrayList <Quadrilatero> array = new ArrayList <Quadrilatero> ();
		Retangulo ret = null;
		Circulo cir = null;
		Quadrado qua = null;
		boolean opcao = true;
		
		while (opcao) {
			System.out.println("1. Cadastrar Retângulo\r\n" + 
					"2. Cadastrar Circulo\r\n" + 
					"3. Cadastrar Quadrado\r\n" + 
					"4. Mostrar o valor de todas as área\r\n" + 
					"5. Mostrar o valor de todas os perímetros");
			
			int op = sc.nextInt();
			switch (op) {
			case 1:
				System.out.println("Digite a altura do retangulo.");
				double alturaret = sc.nextDouble();
				System.out.println("Digite o lado do retangulo");
				double ladoret = sc.nextDouble();
				ret = new Retangulo (alturaret, ladoret);
				array.add(ret);
				break;
			case 2:
				System.out.println("Digite o raio do circulo.");
				double raio = sc.nextDouble();
				cir = new Circulo (raio);
				array.add(cir);
				break;
			case 3:
				System.out.println("Digite o lado do quadrado.");
				double ladoqua = sc.nextDouble();
				qua = new Quadrado (ladoqua);
				array.add(qua);
				break;
			case 4:
				if (ret == null | cir == null | qua == null) {
					System.out.println("Cadastre uma forma geometrica");
				} else {
					for (int x=0; x<array.size(); x++) {
						System.out.println(array.get(x).CalcularArea());
					}
				}
				break;
			case 5:
				if (ret == null | cir == null | qua == null) {
					System.out.println("Cadastre uma forma geometrica");
				} else {
					for (int x=0; x<array.size(); x++) {
						System.out.println(array.get(x).CalcularPerimetro());
					}
				}
				break;
			case 0:
				opcao = false; 
				break;
			}
		}
		
	}

}
