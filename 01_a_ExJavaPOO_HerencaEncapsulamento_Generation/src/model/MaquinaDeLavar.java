package model;

public class MaquinaDeLavar extends EletrodomesticoGeral{
	
	private String kg;

	public String getKg() {
		return kg;
	}

	public void setKg(String kg) {
		this.kg = kg;
	}
	
	public void abrir() {
		System.out.println("A maquina de lavar roupa " + super.getMarca() + " está aberta.");
	}
	
	public void fechar() {
		System.out.println("A maquina de lavar roupa " + super.getMarca() + " está fechada.");
	}

}
