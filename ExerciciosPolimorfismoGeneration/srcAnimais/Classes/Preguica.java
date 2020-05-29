package Classes;

import Interfaces.AcoesAnimais;

public class Preguica extends Animal implements AcoesAnimais {

	@Override
	public void emitirSom() {
		
		System.out.println("A preguiça emitiu som!");
	}

	@Override
	public void correr() {
		//não é usado aqui, mas precisa estar aqui!
	}

	@Override
	public void subirEmArvore() {
		System.out.println("A preguiça subiu na arvore!");
	}

	@Override
	public void mostraNomeIdade() {
		System.out.println("O nome da preguiça é: " + getNome() + " e a idade é: " + getIdade());
		
	}
	
	

}
