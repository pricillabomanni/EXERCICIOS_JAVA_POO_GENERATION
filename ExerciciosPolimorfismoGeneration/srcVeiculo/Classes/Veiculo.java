package Classes;

import java.util.Scanner;

public class Veiculo {
	
	Scanner in = new Scanner (System.in);
	
	private double peso;
	private double velocidadeMax;
	private double preco;
	
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getVelocidadeMax() {
		return velocidadeMax;
	}
	public void setVelocidadeMax(double velocidadeMax) {
		this.velocidadeMax = velocidadeMax;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void entradaDadoDoVeiculo() { 
		System.out.print("Informe o peso do veiculo: ");
		this.peso = in.nextDouble();
		System.out.print("Informe a velocidade max. do veiculo: ");
		this.velocidadeMax = in.nextDouble();
		System.out.print("Informe o peso do veiculo: ");
		this.preco = in.nextDouble();
	}
	
	public void mostrarDadosDoVeiculo() {
		System.out.printf("O veiculo pesa %.2f kg, sua velocidade maxima é de %.0f km/h e seu preço é R$ %.3f ", this.peso, this.velocidadeMax, this.preco  );
	}

}
