package model;

public class Telefone {
	
	private String numeroTel;
	private int tipoTelefone;
	
	public Telefone (String numeroTel, int tipoTelefone) {
		this.numeroTel = numeroTel;
		this.tipoTelefone = tipoTelefone;
	}
	
	public String getNumeroTel() {
		return numeroTel;
	}
	public void setNumeroTel(String numeroTel) {
		this.numeroTel = numeroTel;
	}
	public int getTipoTelefone() {
		return tipoTelefone;
	}
	public void setTipoTelefone(int tipoTelfone) {
		this.tipoTelefone = tipoTelfone;
				
	}
	
	public void mostraTipoTel() {
		switch (this.tipoTelefone) {
		case 1: {
			System.out.println("Telefone é do tipo comercial!");
			break;
		}
		case 2: {
			System.out.println("Telefone é do tipo residencail!");
			break;
		}
		case 3: {
			System.out.println("Telefone é do tipo celular!");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + this.tipoTelefone);
		}
	}

	
	

}
