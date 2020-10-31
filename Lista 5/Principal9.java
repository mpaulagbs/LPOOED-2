import java.util.Scanner;
import java.util.ArrayList;
public class Principal9 {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner (System.in);
			ArrayList <PessoaIMC> array = new ArrayList <PessoaIMC> ();
			Homem hom = null;
			Mulher mul = null;
			boolean op = true;
			
			while (op) {
				System.out.println("1. Cadastra Homem\r\n" + 
						"2. Cadastrar Mulher\r\n" + 
						"3. Consultar IMC (Busca pelo nome)\r\n" + 
						"4. Listar Homens\r\n" + 
						"5. Listar Mulheres\r\n" + 
						"6. Listar todos os IMCs dos Homens\r\n" + 
						"7. Listas todos os IMCs\r\n" + 
						"0. Sair");
				
				int opcao = sc.nextInt();
				switch (opcao) {
				case 1:
					System.out.println("Digite o seu nome");
					String nome = sc.next();
					System.out.println("Digite sua data de nascimento");
					String dataNas = sc.next();
					System.out.println("Digite sua altura, em metros");
					double alt = sc.nextDouble();
					System.out.println("Digite o seu peso, em kilos");
					double peso = sc.nextDouble();
					hom = new Homem (nome, dataNas, alt, peso);
					array.add(hom);
					break;
				case 2:
					System.out.println("Digite o seu nome");
					String nomeMul = sc.next();
					System.out.println("Digite sua data de nascimento");
					String dataNasMul = sc.next();
					System.out.println("Digite sua altura, em m");
					double altMul = sc.nextDouble();
					System.out.println("Digite o seu peso, em kg");
					double pesoMul = sc.nextDouble();
					mul = new Mulher (nomeMul, dataNasMul, altMul, pesoMul);
					array.add(mul);
					break;
				case 3:
					if (hom == null | mul == null) {
						System.out.println("Cadastre uma pessoa");
					} else {
						System.out.println("Digite o nome da pessoa que deseja fazer o imc");
						String nomeIMC = sc.next();
						for (int x=0; x<array.size(); x++) {
							if (array.get(x).getNome().contentEquals(nomeIMC)) {
								array.get(x).CalculoIMC();
								if (array.get(x) instanceof Homem) {
									System.out.println(hom.ResultadoIMC());
								} else if (array.get(x) instanceof Mulher) {
									System.out.println(mul.ResultadoIMC());
								}
							}
						}
					}
					break;
				case 4:
					if (hom == null | mul == null) {
						System.out.println("Cadastre uma pessoa");
					} else { 
						for (int x=0; x<array.size(); x++) {
							if (array.get(x) instanceof Homem) {
								System.out.println(array.get(x).toString());
							}
						}
					}
					break;
				case 5:
					if (hom == null | mul == null) {
						System.out.println("Cadastre uma pessoa");
					} else { 
						for (int x=0; x<array.size(); x++) {
							if (array.get(x) instanceof Mulher) {
								System.out.println(array.get(x).toString());
							}
						}
					}
					break;
				case 6:
					if (hom == null | mul == null) {
						System.out.println("Cadastre uma pessoa");
					} else { 
						for (int x=0; x<array.size(); x++) {
							if (array.get(x) instanceof Homem) {
								System.out.println("IMC de " + array.get(x).getNome() + " = " + array.get(x).CalculoIMC());
							}
						}
					}
					break;
				case 7:
					if (hom == null | mul == null) {
						System.out.println("Cadastre uma pessoa");
					} else { 
						for (int x=0; x<array.size(); x++) {
							System.out.println("IMC de " + array.get(x).getNome() + " = " + array.get(x).CalculoIMC());
						}
					}
					break;
					
				case 0:
					op = false;
					break;
				}
			}
		}

}
