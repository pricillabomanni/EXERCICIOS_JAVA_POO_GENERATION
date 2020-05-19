package POO_ex03;

import java.util.Scanner;

public class ConsumindoClasseContaCorrente {

	public static void main(String[] args) {
		
		int numAgencia, numConta, saldoAtual, deposito, saque, valor;
		
		//instanciar objeto;
		ContaCorrente contapessoa = new ContaCorrente(0,0,0,0,0,0);
		
		//instanciar Scanner;
		Scanner teclado = new Scanner (System.in);
		
		//interação do usuario;
		System.out.print("Informe o numero da sua agência: ");
		numAgencia = teclado.nextInt();
		contapessoa.setNumAgencia(numAgencia);
		
		System.out.print("Informe o numero da sua conta: ");
		numConta = teclado.nextInt();
		contapessoa.setNumConta(numConta);
				
		int opcao;
		System.out.println("Digite 1)despositar 2)sacar 3)Ver saldo");
		opcao = teclado.nextInt();	
		
		while(opcao == 1) {
			System.out.println("Informe o valor para deposito ");
			deposito = teclado.nextInt();
			contapessoa.setDeposito(deposito);
			contapessoa.mostraDeposito();
			System.out.println();
			System.out.println("Digite 1)despositar 2)sacar 3)Ver saldo");
			opcao = teclado.nextInt();
		}
		while(opcao == 2) {
			System.out.println("Informe o valor para saque");
			saque = teclado.nextInt();
			contapessoa.setSaque(saque);
			contapessoa.mostraSaque();
			System.out.println();
			System.out.println();
			System.out.println("Digite 1)despositar 2)sacar 3)Ver saldo");
			opcao = teclado.nextInt();
		}
		while(opcao == 3) {
			System.out.println();
			contapessoa.mostraSaldoAtual();
			System.out.println();
			System.out.println("Digite 1)despositar 2)sacar 3)Ver saldo");
			opcao = teclado.nextInt();
			
		}
		

	}

}
