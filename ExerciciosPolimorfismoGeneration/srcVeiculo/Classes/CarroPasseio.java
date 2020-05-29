package Classes;

import java.util.Scanner;

public class CarroPasseio extends Veiculo{
	Scanner in = new Scanner (System.in);
	
	private String cor;
	private String modelo;
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void entradaDadosDoCarroPasseio() {
		System.out.print("Informe a cor do carro: ");
		this.cor = in.nextLine();
		System.out.print("Informe o modelo do carro: ");
		this.modelo = in.nextLine();
		
	}
	
	public void mostrarDadosDoCarroPasseio() {
		System.out.print("A cor do carro é " + this.cor + " e o modelo é " + this.modelo);
	}

}
