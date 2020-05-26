package model;

public class Moto extends Veiculo {
	
	private boolean bagageiro;

	public boolean isBagageiro() {
		return bagageiro;
	}

	public void setBagageiro(boolean bagageiro) {
		this.bagageiro = bagageiro;
	}
	
	public void abrirBagageiro() {
		System.out.println("O bagageiro da moto "+ super.getNome() +" está aberto");
	}
	
	public void fecharBagageiro() {
		System.out.println("O bagageiro da moto "+ super.getNome() +" está fechado");
	}

}
