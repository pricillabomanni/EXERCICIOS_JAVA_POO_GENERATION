package Classes;

import Interfaces.AcoesAnimais;

public class Cachorro extends Animal implements AcoesAnimais {

	@Override
	public void emitirSom() {
		System.out.println("O cachorro est� latindo!");
		
	}

	@Override
	public void correr() {
		System.out.println("O cachorro est� correndo!");
		
	}

	@Override
	public void subirEmArvore() {
		//n�o � usado aqui, mas precisa estar aqui!
		
	}

	@Override
	public void mostraNomeIdade() {
		System.out.println("O nome do cachorro �: " + getNome() + " e a idade �: " + getIdade());
		
	}
	
	 

}
