package ex_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {

			
				//Instanciando a lista de Array;
				List<Integer> minhaLista = new ArrayList<Integer>();
				
				//Adição de valores a lista de arrays;
				minhaLista.add(1); // adicionar o valor 1 à minhaLista de array; 
				minhaLista.add(2); // adicionar o valor 2 à minhaLista de array;
				minhaLista.add(2); // adicionar o valor 2 à minhaLista de array, lembrando que o ArrayList permite repetição de valores e os organiza;
				
				//Impressão dos valores e busca com For it;
				for (Integer listaElementos : minhaLista) {
					System.out.println(listaElementos);
				}

				//Instanciando a lista de Array do Set;
				Set<Integer> meuSet = new HashSet<Integer>();
				meuSet.add(1); // adicionar o valor 1 à meuSet de array; 
				meuSet.add(2); // adicionar o valor 2 à meuSet de array; 
				meuSet.add(3); // adicionar o valor 3 à meuSet de array; 
				meuSet.add(1); //No HashSet os valores repetidos não são listados na impressão;

				//Instanciamento do Iterato que lista todos os dados de forma corrida ;
				Iterator<Integer> iMeuSet = meuSet.iterator();

				//Percorre a lista para mostrar o que foi encontrado;
				while(iMeuSet.hasNext()){
					System.out.println(iMeuSet.next()); //Printa resultado para usuario;
				}
			}
		}