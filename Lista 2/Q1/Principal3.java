import java.util.Scanner;
public class Principal3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o cpf do profissional administrativo");
		String cpf = sc.next();
		
		System.out.println("Digite o nome do profissional administrativo");
		String nome = sc.next();
		
		System.out.println("Digite o salário do profissional administrativo");
		double sal = sc.nextDouble();
		
		System.out.println("Digite o número de matricula do profissional administrativo");
		String NumMatricula = sc.next();
		
		System.out.println("Digite o turno do profissional administrativo");
		String escala = sc.next();
		
		Administrativo admin = new Administrativo (cpf, nome, sal, NumMatricula, escala);
		
		if (escala.contentEquals("noite")) {
			System.out.println("Digite o adicional do profissional administrativo que trabalha na noite");
			double adic = sc.nextDouble();
			admin.setAdic(adic);
		}
		
		System.out.println("Digite o cpf do profissional tecnico");
		String cpf2 = sc.next();
		
		System.out.println("Digite o nome do profissional tecnico");
		String nome2 = sc.next();
		
		System.out.println("Digite o salário do profissional tecnico");
		double sal2 = sc.nextDouble();
		
		System.out.println("Digite o número de matricula do profissional tecnico");
		String NumMatricula2 = sc.next();
		
		Tecnico tecn = new Tecnico (cpf2, nome2, sal2, NumMatricula2);
		
		System.out.println(admin.getNome() + " " + admin.getNumMatricula());
		System.out.println(tecn.getNome() + " " + tecn.getNumMatricula());	
	}

}
