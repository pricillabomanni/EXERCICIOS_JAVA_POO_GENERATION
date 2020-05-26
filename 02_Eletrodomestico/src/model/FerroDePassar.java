package model;

public class FerroDePassar extends EletrodomesticoGeral{
	
	private boolean vapor;

	public boolean isVapor() {
		return vapor;
	}

	public void setVapor(boolean vapor) {
		this.vapor = vapor;
	}
	
	public void soltarVapor() {
		System.out.println("O ferro " + super.getMarca() + " está soltando vapor");
	}
	
	

}
