package PrincipalAnimal;

import java.util.Scanner;

import Classes.Cachorro;
import Classes.Cavalo;
import Classes.Preguica;
import Classes.Veterinario;

public class PrincipalAnimal {

	public static void main(String[] args) {
		
		String nome;
		int idade;
							
		Veterinario veterinario = new Veterinario();
		Scanner in = new Scanner (System.in);
		
		Cachorro cachorro = new Cachorro();
		
		System.out.print("Informe o nome do cachorro: ");
		cachorro.setNome(nome = in.nextLine());
		System.out.print("Informe a idade do cachorro: ");
		cachorro.setIdade(idade = in.nextInt());
		
		cachorro.mostraNomeIdade();
		cachorro.emitirSom();
		cachorro.correr();
		veterinario.examinar(cachorro);
		System.out.println();
		
				
		Scanner inn = new Scanner (System.in);
		Cavalo cavalo = new Cavalo();
		
		System.out.print("Informe o nome do cavalo: ");
		cavalo.setNome(nome = inn.nextLine());
		System.out.print("Informe a idade do cavalo: ");
		cavalo.setIdade(idade = inn.nextInt());
		
		cavalo.mostraNomeIdade();
		cavalo.emitirSom();
		cavalo.correr();
		veterinario.examinar(cavalo);
		System.out.println();
		
		
		
		
		Scanner iin = new Scanner (System.in);
		Preguica preguica = new Preguica();
		
		System.out.print("Informe o nome da preguiça: ");
		preguica.setNome(nome = iin.nextLine());
		System.out.print("Informe a idade da preguiça: ");
		preguica.setIdade(idade = iin.nextInt());
		
		preguica.mostraNomeIdade();
		preguica.emitirSom();
		preguica.subirEmArvore();
		veterinario.examinar(preguica);
		
		
		
		
		
	}

}
