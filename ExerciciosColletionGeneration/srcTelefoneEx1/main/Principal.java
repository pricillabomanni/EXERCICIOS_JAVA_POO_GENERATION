package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import model.Telefone;

public class Principal {

	public static void main(String[] args) {
		
		List<Telefone> listaTelefone = new ArrayList<Telefone>();
		
		Telefone telefoneA = new Telefone ("98978-8989",3);
		Telefone telefoneB = new Telefone ("3245-3249",1);
		Telefone telefoneC = new Telefone ("98978-8989",3);
		Telefone telefoneD = new Telefone ("4556-8888",2);
			
		listaTelefone.add(telefoneA);
		listaTelefone.add(telefoneB);
		listaTelefone.add(telefoneC);
		listaTelefone.add(telefoneD);
		
		System.out.print("Tipos de telefone: 1-comercial 2-residencial  3-celular :");
		System.out.println();
		System.out.println();
		Telefone telefone;
		Iterator<Telefone> listaOrganizada = listaTelefone.iterator();
		while(listaOrganizada.hasNext()) {
			telefone = listaOrganizada.next();
			System.out.println("O numero do telefone é "+ telefone.getNumeroTel()+ ", e o tipo de telefone é " + telefone.getTipoTelefone());
		}
		

	}

}
