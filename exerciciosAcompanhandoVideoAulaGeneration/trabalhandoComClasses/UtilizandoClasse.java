package trabalhandoComClasses;

public class UtilizandoClasse {

	public static void main(String[] args) {
		
		//variaveis que ser�o parametros do metodo construtor;
		String cor = "n�o sei";
		String marca = "N�o sei tamb�m";
		
		//instanciando a classe Carro;
		//ou seja, criando o objeto meucaro;
		Carro meucarro = new Carro(cor, marca);
		
		//executando o m�todo;
		meucarro.mostraMarcaCor();
		
		//trocando a cor do carro;
		meucarro.setCor("Azul");
		//trocando a marca do carro;
		meucarro.setMarca("BMW ");
		
		//executando o m�todo, para mostrar as modifica��es;
		meucarro.mostraMarcaCor();
		
	}
}
