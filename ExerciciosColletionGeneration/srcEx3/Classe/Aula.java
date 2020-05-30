package Classe;

public class Aula {
	
	//Declarando atributos encapsulados;
	private String titulo;
	private int tempo;
	
	//Construtor com parametros especificos;
	public Aula(String titulo, int tempo) {
	this.titulo = titulo;
	this.tempo = tempo;
	}
	
	//Generate Getters and Setters
	public String getTitulo() {
	return titulo;
	}
	public int getTempo() {
	return tempo;

	}
	
}

