package main;

import model.Carro;
import model.Moto;

public class mainVeiculo {

	public static void main(String[] args) {

		Carro carro = new Carro();
		carro.setMarca("BMW");
		carro.setNome("X5");
		carro.setPortas(4);
		carro.setVidroEletrico(true);
		carro.setCombustivel("Gasolina");
		carro.setVelocidade(70);
		carro.setCurva(true);

		carro.fecharJanela();			
		carro.mostraVelocidade();
		carro.acelerar();
		carro.capotamento();
		

		System.out.println("--------------");

		Moto moto = new Moto();
		moto.setMarca("KAWASAKI NINJA");
		moto.setNome("ZX-25R");
		moto.setCombustivel("Gasolina");
		moto.setBagageiro(true);
		moto.setVelocidade(50);
		moto.setCurva(false);
		
		moto.abrirBagageiro();
		moto.fecharBagageiro();				
		moto.mostraVelocidade();
		moto.acelerar();
		moto.capotamento();
		

		System.out.println("----------------");

	}

}
