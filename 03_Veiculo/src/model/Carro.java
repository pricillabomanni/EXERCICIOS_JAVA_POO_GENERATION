package model;

public class Carro extends Veiculo {
	
	private boolean vidroEletrico;

	public boolean isVidroEletrico() {
		return vidroEletrico;
	}

	public void setVidroEletrico(boolean vidroEletrico) {
		this.vidroEletrico = vidroEletrico;
	}
	
	public void abrirJanela(){
		System.out.println("A janela do carro " + super.getNome() + " está aberta.");
	}
	
	public void fecharJanela(){
		System.out.println("A janela do carro " + super.getNome() + " está fechada.");
	}
	

}
