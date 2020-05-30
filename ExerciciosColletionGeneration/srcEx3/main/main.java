package main;

import java.util.List; //Esta sublinhado de amarelo, pois não está usado;
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
			
			System.out.println(aulas);  //Impressão da lista de Array aulas;
			System.out.println(aulas.size()); //Impressão do tamanho da lista de Array aulas;

			// cuidado! <= faz sentido aqui? Não, pois não existe posição 3 no Arraylist aulas;
			for (int i = 0; i < aulas.size(); i++) {
				System.out.println("Aula: "+ aulas.get(i));//Impressão de cada dados dos arrays;
			}
		}
	}