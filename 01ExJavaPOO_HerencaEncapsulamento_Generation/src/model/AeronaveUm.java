package model;

public class AeronaveUm extends AeronaveMae{
	
	private String combustivel;

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	
	
	public void abastecer() {
		System.out.println("A aeronaveUm "+ super.getModelo() +" está abastecida com " + this.combustivel);
	}

}
