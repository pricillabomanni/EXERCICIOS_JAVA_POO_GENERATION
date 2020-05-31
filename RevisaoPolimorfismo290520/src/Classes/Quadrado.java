package Classes;

import Interfaces.FormaGeometrica;

public class Quadrado implements FormaGeometrica {

	private double lado;

	public double getLado() {
		return lado;
	}

	@Override // anota��o - metodo da interface que precisa ser implementada;
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
		System.out.println("�rea do quadrado: " + area());
		System.out.println("Comprimento do quadrado: " + comprimento());

	}

	@Override
	public void setLado(double lado) {
		this.lado = lado;

	}

	@Override
	public void setRaio(double raio) {
		// M�todo n�o � utilizado nesta classe;
		// N�o fa�o nada com ele - mas tenho que deix�-lo aqui;

	}

}
