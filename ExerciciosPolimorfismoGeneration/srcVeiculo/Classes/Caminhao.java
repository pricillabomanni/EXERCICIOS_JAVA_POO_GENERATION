package Classes;

import java.util.Scanner;

public class Caminhao extends Veiculo {

	Scanner in = new Scanner(System.in);

	private double cargaMaxima;
	private double alturaMaxima;
	private double comprimento;

	public double getCargaMaxima() {
		return cargaMaxima;
	}

	public void setCargaMaxima(double cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}

	public double getAlturaMaxima() {
		return alturaMaxima;
	}

	public void setAlturaMaxima(double alturaMaxima) {
		this.alturaMaxima = alturaMaxima;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public void entradaDadosDoCaminhao() {
		System.out.print("Informe a carga maxima do caminhao: ");
		this.cargaMaxima = in.nextDouble();
		System.out.print("Informe a altura maxima do caminhao: ");
		this.alturaMaxima = in.nextDouble();
		System.out.print("Informe o comprimento do caminhao: ");
		this.comprimento = in.nextDouble();
	}

	public void mostrarDadosDoCaminhao() {
		System.out.printf("A carga maxima do caminhão é %.2f toneladas, sua altura maxima é de %.2f metros e seu comprimento é de %.2f metros", this.cargaMaxima, this.alturaMaxima, this.comprimento);

	}

}
