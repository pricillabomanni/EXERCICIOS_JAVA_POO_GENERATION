package model;

public class EletrodomesticoGeral {
	
	private String marca;
	private String Potencia;
	private String cor;
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getPotencia() {
		return Potencia;
	}
	public void setPotencia(String potencia) {
		Potencia = potencia;
	}	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void ligar() {
		System.out.println("O eletrodoméstico " + this.marca + " está ligado.");
	}
	
	public void desligar() {
		System.out.println("O eletrodoméstico " + this.marca + " está desligado.");
	}

}
