package Classes;

import Interfaces.AcoesAnimais;

public class Cachorro extends Animal implements AcoesAnimais {

	@Override
	public void emitirSom() {
		System.out.println("O cachorro está latindo!");
		
	}

	@Override
	public void correr() {
		System.out.println("O cachorro está correndo!");
		
	}

	@Override
	public void subirEmArvore() {
		//não é usado aqui, mas precisa estar aqui!
		
	}

	@Override
	public void mostraNomeIdade() {
		System.out.println("O nome do cachorro é: " + getNome() + " e a idade é: " + getIdade());
		
	}
	
	 

}
