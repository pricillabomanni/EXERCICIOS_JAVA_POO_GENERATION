package trabalhandoComClasses;

public class UtilizandoClasse {

	public static void main(String[] args) {
		
		//variaveis que serão parametros do metodo construtor;
		String cor = "não sei";
		String marca = "Não sei também";
		
		//instanciando a classe Carro;
		//ou seja, criando o objeto meucaro;
		Carro meucarro = new Carro(cor, marca);
		
		//executando o método;
		meucarro.mostraMarcaCor();
		
		//trocando a cor do carro;
		meucarro.setCor("Azul");
		//trocando a marca do carro;
		meucarro.setMarca("BMW ");
		
		//executando o método, para mostrar as modificações;
		meucarro.mostraMarcaCor();
		
	}
}
