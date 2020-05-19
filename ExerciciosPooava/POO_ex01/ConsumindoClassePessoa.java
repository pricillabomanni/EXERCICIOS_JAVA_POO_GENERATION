package POO_ex01;

import java.util.Scanner;

public class ConsumindoClassePessoa {

	public static void main(String[] args) {
		
		String nome, email,telefone;
				
		//instanciar a classe Pessoa;
		//criar o objeto pessoaaluno;
		Pessoa pessoaaluno = new Pessoa(" "," ","");
		
		//Instanciar Scanner - receber dados do usuario;
		Scanner teclado = new Scanner (System.in);
		
		//recebendo a digitação do usuario;
		System.out.print("Informe seu nome: ");
		nome = teclado.nextLine();
		pessoaaluno.setNome(nome);
		
		System.out.print("Informe seu e-mail: ");
		email = teclado.nextLine();
		pessoaaluno.setEmail(email);
		
		System.out.print("Informe seu telefone: ");
		telefone = teclado.nextLine();
		pessoaaluno.setTelefone(telefone);
		
		//mostrando os resultados do pessoaaluno;
		System.out.println();
		pessoaaluno.mostraCartaoDeVisita();
	}
}
