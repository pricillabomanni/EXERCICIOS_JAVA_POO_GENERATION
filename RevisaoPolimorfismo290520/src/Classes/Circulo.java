package Classes;

import Interfaces.FormaGeometrica;

public class Circulo implements FormaGeometrica {

	private double raio;
	// como declarar constante caso precise;
	// private static final double PI = 3.14;

	public double getRaio() {
		return raio;
	}

	@Override // anota��o - metodo da interface que precisa ser implementada;
	public double area() {
		return (Math.PI * Math.pow(getRaio(), 2));

	}

	@Override
	public double comprimento() {
		// 2 x pi x raio;
		return (2 * Math.PI * getRaio());
	}

	@Override
	public void imprime() {
		System.out.println();
		System.out.println("�rea do circulo: " + area());
		System.out.println("Comprimento do circulo: " + comprimento());
	}

	@Override
	public void setLado(double lado) {
		// M�todo n�o � utilizado nesta classe;
		// N�o fa�o nada com ele - mas tenho que deix�-lo aqui;
		
	}

	@Override
	public void setRaio(double raio) {
		this.raio = raio;
		
	}

}
