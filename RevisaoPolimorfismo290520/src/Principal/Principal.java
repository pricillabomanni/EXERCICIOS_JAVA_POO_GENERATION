package Principal;

import java.util.Scanner;
import Classes.Circulo;
import Classes.Quadrado;
import Interfaces.FormaGeometrica;

public class Principal {

	public static void main(String[] args) {
		
		double lado;
		double raio;
		
		//instanciando a class Scanner		
		Scanner in = new Scanner (System.in);
		
		System.out.print("Informe o comprimento do lado do quadrado: ");
		lado = in.nextDouble();
		
		System.out.print("Informe o raio do circulo: ");
		raio = in.nextDouble();
		
		//movimentar as variaveis raio e lado para as classes;
		FormaGeometrica quadrado = new Quadrado();
		FormaGeometrica circulo = new Circulo();
		
		quadrado.setLado(lado);
		circulo.setRaio(raio);
		
		quadrado.imprime();
		circulo.imprime();
		
		
		in.close();

	}

}
