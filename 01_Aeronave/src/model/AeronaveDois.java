package model;

public class AeronaveDois extends AeronaveMae {
	
	private String Cambio;

	public String getCambio() {
		return Cambio;
	}

	public void setCambio(String cambio) {
		Cambio = cambio;
	}
	
	public void abrirPorta() {
		System.out.println("A porta da aeronaveDois "+ super.getModelo() +" está aberta.");
	}
	
	public void fecharPorta() {
		System.out.println("A porta da aeronaveDois "+ super.getModelo() +" está fechada.");
	}

}
