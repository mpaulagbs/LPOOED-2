import java.util.Scanner;
import java.util.ArrayList;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		boolean contador = true;
		
		ArrayList <Contapoupanca> array = new ArrayList <Contapoupanca>();
		ArrayList <Contaespecial> array2 = new ArrayList <Contaespecial>();
		ArrayList <Conta> array3 = new ArrayList <Conta>();
		
		int QuantCon = 0;
		boolean verif = true;
		Contapoupanca contapou = null;
		Contaespecial contaesp = null;
		
		while (contador) {
			System.out.println("1) Incluir dados relativos a conta de um cliente;\r\n" + 
					"2) Sacar um determinado valor de uma conta;\r\n" + 
					"3) Depositar um determinado valor na sua conta;\r\n" + 
					"4) Mostrar o novo saldo do cliente, a partir da taxa de rendimento, daqueles que\r\n" + 
					"possuem conta poupança;\r\n" + 
					"5) Mostrar os dados de todas as contas cadastradas.");
			
			int op = sc.nextInt();
			switch (op) {
			case 1:
				System.out.println("Digite o nome do cliente");
				String nome = sc.next();
				for (int x=0; x<array3.size(); x++) {
					if (array3.get(x).getNome().contentEquals(nome)) {
						if (QuantCon >= 5) {
							System.out.println("Este cliente já possui o limite de contas");
							verif = false;
						} 
					}
				}
				if (verif == true) {
					System.out.println("Qual conta você quer criar, conta poupança ou conta especial?"
							+ " ConPou = conta poupança ou ConEsp = conta especial");
					String op2 = sc.next();
					if (op2.contentEquals("ConPou")) {
						System.out.println("Digite o número da conta");
						String numconta = sc.next();
						System.out.println("Digite o saldo da sua conta");
						double saldo = sc.nextDouble();
						System.out.println("Digite o dia de rendimento");
						int diarend = sc.nextInt();
						contapou = new Contapoupanca (nome, numconta, saldo, diarend);
						array.add(contapou);
						array3.add(contapou);
						QuantCon += 1;
					} else if (op2.contentEquals("ConEsp")) {
						System.out.println("Digite o número da conta");
						String numconta = sc.next();
						System.out.println("Digite o saldo da sua conta");
						double saldo = sc.nextDouble();
						System.out.println("Digite o limite do saque, informe um número maior que 0");
						int lt = sc.nextInt();
						contaesp = new Contaespecial (nome, numconta, saldo, lt);
						array2.add(contaesp);
						array3.add(contaesp);
						QuantCon += 1;
					}
				} 
				
				break;
			case 2:
				if (contapou == null | contaesp == null) {
					System.out.println("Cadastre uma conta");
				} else {
					System.out.println("Digite o número da sua conta");
					String numCon = sc.next();
					for (int x=0; x<array.size(); x++){
						if (array.get(x).getNumConta().contentEquals(numCon)) {
							System.out.println("Digite o valor que deseja sacar.");
							double valor = sc.nextDouble();
							if (valor <= array.get(x).getSaldo()) {
								array.get(x).sacar(valor);
								System.out.println("Saque feito. Saldo atual: " + array.get(x).getSaldo());
							} else {
								System.out.println("Saldo insuficiente");
							}
						}
					}
					for (int y=0; y<array2.size(); y++) {
						if (array2.get(y).getNumConta().contentEquals(numCon)) {
							System.out.println("Digite o valor que deseja sacar.");
							double valor = sc.nextDouble();
							if (valor <= array2.get(y).getExtremo() + array2.get(y).getSaldo()) {
								array2.get(y).sacar(valor);
								System.out.println("Saque feito. Saldo atual: " + array2.get(y).getSaldo());
							} else {
								System.out.println("Saldo insuficiente");
							}
						}
					}
				}
				
				break;
			case 3:
				if (contapou == null | contaesp == null ) {
					System.out.println("Cadastre uma conta");
				} else {
					System.out.println("Digite o número da conta");
					String numcon = sc.next();
					for (int x=0; x<array3.size(); x++) {
						if (array3.get(x).getNumConta().contentEquals(numcon)) {
							System.out.println("Digite o valor do deposito");
							double valor = sc.nextDouble();
							array3.get(x).deposito(valor);
							System.out.println("Deposito feito. Saldo atual: " + array3.get(x).getSaldo());
						}
					}
				}
				
				break;
			case 4:
				if (contapou == null) {
					System.out.println("Cadastre uma conta poupança");
				} else {
					System.out.println("Digite o número da conta");
					String numcon = sc.next();
					for (int x=0; x<array.size(); x++) {
						if (array.get(x).getNumConta().contentEquals(numcon)) {
							System.out.println("Digite a taxa de rendimento.");
							double taxa = sc.nextDouble();
							System.out.println(array.get(x).NovoSaldo(taxa));
						} else {
							System.out.println("Esta não é uma conta poupança.");
						}
					}
				}
				
				break;
			case 5:
				if (contapou == null | contaesp == null) {
					System.out.println("Cadastre uma conta");
				} else {
					for (int x=0; x<array3.size(); x++) {
						System.out.println("Nome: " + array3.get(x).getNome() + " Número da conta: " + array3.get(x).getNumConta()
								           + " Saldo: " + array3.get(x).getSaldo());
					}
				}
				
				break;
			case 0:
				contador = false;
				break;
			}	
		}
	}

}
