package Classes;

import Interfaces.FormaGeometrica;

public class Quadrado implements FormaGeometrica {

	private double lado;

	public double getLado() {
		return lado;
	}

	@Override // anotação - metodo da interface que precisa ser implementada;
	public double area() {

		return (Math.pow(getLado(), 2));
	}

	@Override
	public double comprimento() {

		return (getLado() * 4);
	}

	@Override
	public void imprime() {
		System.out.println();
		System.out.println("Área do quadrado: " + area());
		System.out.println("Comprimento do quadrado: " + comprimento());

	}

	@Override
	public void setLado(double lado) {
		this.lado = lado;

	}

	@Override
	public void setRaio(double raio) {
		// Método não é utilizado nesta classe;
		// Não faço nada com ele - mas tenho que deixá-lo aqui;

	}

}
