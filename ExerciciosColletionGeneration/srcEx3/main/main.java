package main;

import java.util.List; //Esta sublinhado de amarelo, pois n�o est� usado;
import java.util.ArrayList;

public class main {

		public static void main(String[] args) {

			//Implementando valores nas variaveis;
			String aula1 = "Modelando a classe Aula";
			String aula2 = "Conhecendo mais de listas";
			String aula3 = "Trabalhando com Cursos e Sets";

			// Instanciando Arraylist e atribuindo para variavel aulas;
			ArrayList<String> aulas = new ArrayList<>();
			
			//Adicionando valores no ArrayList aulas;
			aulas.add(aula1);
			aulas.add(aula2);
			aulas.add(aula3);
			
			System.out.println(aulas);  //Impress�o da lista de Array aulas;
			System.out.println(aulas.size()); //Impress�o do tamanho da lista de Array aulas;

			// cuidado! <= faz sentido aqui? N�o, pois n�o existe posi��o 3 no Arraylist aulas;
			for (int i = 0; i < aulas.size(); i++) {
				System.out.println("Aula: "+ aulas.get(i));//Impress�o de cada dados dos arrays;
			}
		}
	}