package trabalhandoComClasses;

import java.util.Scanner;

public class UtilizandoClasseComDigitacaodoUsuario {

	public static void main(String[] args) {
		
		String cor, marca;		
		
		//instanciar a classe Carro;
		//criar o objeto carroaluno;
		Carro carroaluno = new Carro(" ", " ");
		
		//instanciando a classe Scanner;
		Scanner teclado = new Scanner(System.in);
		
		//recebendo a digitação do usuario;
		System.out.print("Informe a cor: ");
		cor = teclado.nextLine();
		carroaluno.setCor(cor);
		
		System.out.print("Informe a marca: ");
		marca = teclado.nextLine();
		carroaluno.setMarca(marca);
		
		//mostrando os resultados do carroaluno;
		carroaluno.mostraMarcaCor();
		
		
	}
}
