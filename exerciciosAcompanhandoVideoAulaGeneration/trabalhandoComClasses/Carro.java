package trabalhandoComClasses;

public class Carro {

	// atributos;
	//lembrar do encapsulamento;
	private String cor;
	private String marca;
	// fim-atributos;

	// metodo construtor - tem sempre o mesmo nome da classe;
	public Carro(String cor, String marca) {
		this.cor = cor;
		this.marca = marca;
	}
	// fim-metodo-construtor;

	// GETTERS AND SETTERS;
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	// fim-GETTERS-AND-SETTERS;

	// criando outros metodos da classe Carro - criar quantos me forem necessarios;
	public void mostraMarca() {
		System.out.println("A marca do carro é " + getMarca());
	}

	public void mostraMarcaCor() {
		System.out.println("Meu carro é " + getCor() + " e a marca do carro é " + getMarca());
	}
	//fim-da-criação-de-outros-metodos;

}
