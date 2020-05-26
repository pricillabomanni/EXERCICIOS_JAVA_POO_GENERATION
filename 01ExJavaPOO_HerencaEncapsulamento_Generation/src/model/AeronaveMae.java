package model;

public class AeronaveMae {
	private String modelo;
	private String tamanho;
	private String cor;
	
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
	public void ligar() {
		System.out.println("A aeronave " + this.modelo + " está ligada");
	}
	
	public void desligar() {
		System.out.println("A aeronave " + this.modelo + " está desligada");
	}
	
	

}
