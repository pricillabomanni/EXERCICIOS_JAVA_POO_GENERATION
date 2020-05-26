package main;

import model.AeronaveDois;
import model.AeronaveUm;

public class mainAeronaves {

	public static void main(String[] args) {
		AeronaveUm aeronaveUm = new AeronaveUm();
		aeronaveUm.setModelo("R2D2");
		aeronaveUm.setCor("Azul Metalizado");
		aeronaveUm.setTamanho("Pequeno");
		aeronaveUm.setCombustivel("Gás");
		
		aeronaveUm.abastecer();
		aeronaveUm.ligar();
		aeronaveUm.desligar();
		
		System.out.println("------------------------------");
		
		AeronaveDois aeronaveDois = new AeronaveDois();
		aeronaveDois.setModelo("C3PO");
		aeronaveDois.setCor("Dourado");
		aeronaveDois.setTamanho("Grande");
		aeronaveDois.setCambio("Automatico");
		
		aeronaveDois.ligar();
		aeronaveDois.desligar();
		aeronaveDois.abrirPorta();

	}

}
