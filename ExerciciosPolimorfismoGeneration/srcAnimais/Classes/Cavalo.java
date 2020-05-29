package Classes;

import Interfaces.AcoesAnimais;

public class Cavalo extends Animal implements AcoesAnimais {

	@Override
	public void emitirSom() {
		System.out.println("O cavalo relinchou!");
		
	}

	@Override
	public void correr() {
		System.out.println("O cavalo está correndo");
		
	}

	@Override
	public void subirEmArvore() {
		//não é usado aqui, mas precisa estar aqui!
		
	}

	@Override
	public void mostraNomeIdade() {
		System.out.println("O nome do cavalo é: " + getNome() + " e a idade é: " + getIdade());
		
	}

}
