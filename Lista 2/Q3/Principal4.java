import java.util.Scanner;
public class Principal4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o valor do ingresso");
		double valor = sc.nextDouble();
		
		Ingresso ing = new Ingresso (valor);
		double adcUm = 0;
		boolean cont = true;
		
		while (cont) {
			System.out.println("Digite 1 para comum e 2 para VIP. \n0 = Sair");
			
			int op = sc.nextInt();
			switch (op) {
			
			case 1:
				
				Normal nor = new Normal (valor);
				nor.exibir();
				break;
			case 2:
				
				System.out.println("Ingresso VIP");
				System.out.println("Digite 1 para camarote superior e 2 para camarote inferior.");
				int opVIP = sc.nextInt();
				if (opVIP == 1) {
					System.out.println("Digite o preço adicional do VIP");
					adcUm = sc.nextDouble();
					
					System.out.println("Digite o preço adicional do camarote superior");
					double adcDois = sc.nextDouble();
					
					CamaroteSuperior csuperior = new CamaroteSuperior (valor, adcUm, adcDois);
					System.out.println(csuperior.valorN());
				} else if (op == 2) {
					
					System.out.println("Digite o lugar do camarote inferior");
					String lugar = sc.next();
					CamaroteInferior cinferior = new CamaroteInferior (valor, adcUm, lugar);
					System.out.println(cinferior.newvalor());
				}
				break;
			case 0:
				
				cont = false; 
				break;
			}
		}
	}

}
