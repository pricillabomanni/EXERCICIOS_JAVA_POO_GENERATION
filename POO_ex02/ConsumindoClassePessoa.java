package POO_ex02;

import java.util.Scanner;

public class ConsumindoClassePessoa {

	public static void main(String[] args) {
		
		String nome;
		int anoNascimento;		
		
		//Instanciar objeto
		Pessoa pessoaaleatoria = new Pessoa("", 0 );
		
		//Instanciar Scanner
		Scanner teclado = new Scanner (System.in);
		
		//recebendo dados usuarios
		System.out.print("Informe seu nome: ");
		nome = teclado.nextLine();
		pessoaaleatoria.setNome(nome);
		
		System.out.print("Informe sua ano de Nascimento: ");
		anoNascimento = teclado.nextInt();
		pessoaaleatoria.setAnoNascimento(anoNascimento);
		
		//mostrando resultados
		System.out.println();
		pessoaaleatoria.idadePessoa();
		pessoaaleatoria.idadePessoaDaqui50Anos();
	}

}
