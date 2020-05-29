package Classes;

import Interfaces.AcoesAnimais;

public class Cavalo extends Animal implements AcoesAnimais {

	@Override
	public void emitirSom() {
		System.out.println("O cavalo relinchou!");
		
	}

	@Override
	public void correr() {
		System.out.println("O cavalo est� correndo");
		
	}

	@Override
	public void subirEmArvore() {
		//n�o � usado aqui, mas precisa estar aqui!
		
	}

	@Override
	public void mostraNomeIdade() {
		System.out.println("O nome do cavalo �: " + getNome() + " e a idade �: " + getIdade());
		
	}

}
