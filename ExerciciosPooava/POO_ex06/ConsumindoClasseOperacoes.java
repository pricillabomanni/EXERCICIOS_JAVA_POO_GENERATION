package POO_ex06;

import java.util.Scanner;

public class ConsumindoClasseOperacoes {

	public static void main(String[] args) {

		double num1, num2;
		int opcao;

		Operacoes operacoesMatematicos = new Operacoes(0, 0);

		Scanner teclado = new Scanner(System.in);

		System.out.print("Informe o 1º numero: ");
		num1 = teclado.nextDouble();
		operacoesMatematicos.setNum1(num1);
		
		System.out.print("Informe o 2º numero: ");
		num2 = teclado.nextDouble();
		operacoesMatematicos.setNum2(num2);
		
		System.out.println("O que deseja fazer: ");
		System.out.println("1)Somar");
		System.out.println("2)Subtrairr");
		System.out.println("3)Dividir");
		System.out.println("4)Multiplicar");
		System.out.println("5)Elevar");
		System.out.println("0)Sair");
		opcao = teclado.nextInt();

		while (opcao != 0) {

			if (opcao == 1) {
				operacoesMatematicos.somar();
			} else if (opcao == 2) {
				operacoesMatematicos.subtrair();
			} else if (opcao == 3) {
				operacoesMatematicos.dividir();
			} else if (opcao == 4) {
				operacoesMatematicos.multiplicar();
			} else if (opcao == 5) {
				operacoesMatematicos.elevado();
			} else {
				break;
			}
			System.out.print("Informe o 1º numero: ");
			num1 = teclado.nextDouble();
			operacoesMatematicos.setNum1(num1);

			System.out.print("Informe o 2º numero: ");
			num2 = teclado.nextDouble();
			operacoesMatematicos.setNum2(num2);
			
			System.out.println("O que deseja fazer: ");
			System.out.println("1)Somar");
			System.out.println("2)Subtrairr");
			System.out.println("3)Dividir");
			System.out.println("4)Multiplicar");
			System.out.println("5)Elevar");
			System.out.println("0)Sair");
			opcao = teclado.nextInt();
		}

	}

}
