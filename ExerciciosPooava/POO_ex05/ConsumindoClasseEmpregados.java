package POO_ex05;

import java.util.Scanner;

public class ConsumindoClasseEmpregados {

	public static void main(String[] args) {
		//PRECISO FAZER ESSE
		int id;
		String nome, sobrenome;
		double salarioAtual, porcentagem;

		Empregados funcionarios = new Empregados(0, "", "", 0, 0);

	
		Scanner teclado = new Scanner(System.in);
		

		System.out.print("Iforme seu id ");
		id = teclado.nextInt();
		funcionarios.setId(id);

		System.out.print("Informe seu nome ");
		nome = teclado.nextLine();
		funcionarios.setNome(nome);

	
		System.out.print("Informe seu sobrenonome ");
		sobrenome = teclado.nextLine();
		funcionarios.setSobrenome(sobrenome);		

		System.out.print("Informe seu salario atual ");
		salarioAtual = teclado.nextDouble();
		funcionarios.setSalarioAtual(salarioAtual);

		System.out.print("Informe a porcentagem de aumento (exemplo 0.15) ");
		porcentagem = teclado.nextDouble();
		funcionarios.setPorcentagem(porcentagem);

		if (salarioAtual > 0) {
			System.out.println("Seus resultados são: ");
			funcionarios.nomeCompletoComSalario();
			funcionarios.aumentoSalario();
			funcionarios.aumentarSalarioPorcentagemDoUsuario();
		}

	}

}
