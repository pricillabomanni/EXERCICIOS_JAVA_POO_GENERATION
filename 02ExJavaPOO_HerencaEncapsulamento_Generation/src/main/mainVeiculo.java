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
		carro.setVelocidade(50);
		carro.setCurva(false);

		carro.fecharJanela();
		carro.mostraEstrada();	
		carro.mostraVelocidade();
		carro.acelerar();
		

		System.out.println("--------------");

		Moto moto = new Moto();
		moto.setMarca("KAWASAKI NINJA");
		moto.setNome("ZX-25R");
		moto.setCombustivel("Gasolina");
		moto.setBagageiro(true);
		moto.setVelocidade(90);
		moto.setCurva(false);
		
		moto.abrirBagageiro();
		moto.fecharBagageiro();
		moto.mostraEstrada();		
		moto.mostraVelocidade();
		moto.acelerar();
		

		System.out.println("----------------");

	}

}
