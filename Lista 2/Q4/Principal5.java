import java.util.Scanner;
public class Principal5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o endereço do imovel");
		String end = sc.nextLine();
		
		System.out.println("Digite o preço do imovel");
		double precoIm = sc.nextDouble();
		
		Imovel imo = new Imovel (precoIm, end);
		boolean op = true;
		
		while (op) {
			
			System.out.println("Digite 1 para imovel que é novo e 2 para o imovel que é velho. \n0 = Sair");
			int opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				
				System.out.println("Digite o endereço do imovel");
				String endere = sc.next();
				System.out.println("Digite o preço do imovel");
				double precoI = sc.nextDouble();
				System.out.println("Digite o valor adicional do imovel");
				double adcio = sc.nextDouble();
				Novo n = new Novo (precoI, endere, adcio);
				n.novoP();
				break;
				
			case 2:
				System.out.println("Digite o endereço do imovel");
				String ender = sc.next();
				System.out.println("Digite o preço do imovel");
				double precoim = sc.nextDouble();
				System.out.println("Digite o valor do desconto do imovel");
				double des = sc.nextDouble();
				Velho v = new Velho (precoim, ender, des);
				v.precoN();
				break;
				
			case 0:
				op = false;
				break;
			}
		}
	}
}
