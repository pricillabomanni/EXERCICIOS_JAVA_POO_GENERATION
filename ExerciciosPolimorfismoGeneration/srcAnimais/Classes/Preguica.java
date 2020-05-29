package Classes;

import Interfaces.AcoesAnimais;

public class Preguica extends Animal implements AcoesAnimais {

	@Override
	public void emitirSom() {
		
		System.out.println("A pregui�a emitiu som!");
	}

	@Override
	public void correr() {
		//n�o � usado aqui, mas precisa estar aqui!
	}

	@Override
	public void subirEmArvore() {
		System.out.println("A pregui�a subiu na arvore!");
	}

	@Override
	public void mostraNomeIdade() {
		System.out.println("O nome da pregui�a �: " + getNome() + " e a idade �: " + getIdade());
		
	}
	
	

}
