package main;

import model.FerroDePassar;
import model.MaquinaDeLavar;

public class mainEletrodomestico {

	public static void main(String[] args) {
		
		MaquinaDeLavar maquinaDeLavar = new MaquinaDeLavar();
		maquinaDeLavar.setMarca("Consul");
		maquinaDeLavar.setCor("Branca");
		maquinaDeLavar.setPotencia("1400 Watts");
		maquinaDeLavar.setKg("15kg");
		
		maquinaDeLavar.abrir();
		maquinaDeLavar.fechar();
		maquinaDeLavar.ligar();
		
		
		System.out.println("-----------------");
		
		FerroDePassar ferroDePassar = new FerroDePassar();
		ferroDePassar.setMarca("Samsung");
		ferroDePassar.setCor("Preto");
		ferroDePassar.setPotencia("100 watts");
		ferroDePassar.setVapor(true);
		
		ferroDePassar.ligar();
		ferroDePassar.soltarVapor();

	}

}
