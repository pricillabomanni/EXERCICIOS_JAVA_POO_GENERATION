package model;

public class Veiculo {

	private String marca;
	private String nome;
	private int portas;
	private String combustivel;
	private int velocidade;
	private boolean curva;
		

	public boolean isCurva() {
		return curva;
	}

	public void setCurva(boolean curva) {
		this.curva = curva;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPortas() {
		return portas;
	}

	public void setPortas(int portas) {
		this.portas = portas;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void mostraVelocidade() {
		System.out.println("A velocidade do veiculo " + this.nome + " é " + this.velocidade +"km/h");
	}
	
	public void capotamento() {
		if(curva) {
			if(this.velocidade >= 70 && this.curva) {
				System.out.println("O veiculo " + this.nome + " capotou");
			}else if(this.velocidade < 70 || this.velocidade > 20){
				System.out.println("O veiculo " + this.nome + " está ficando rapido para a curva, desacelere!");
			}else if(this.velocidade >0 || this.velocidade < 20) {		
				System.out.println("O veiculo " + this.nome + " está parando!");
			}else {
				System.out.println("O veiculo " + this.nome + " está parado!");
			}
			
		}else {
			System.out.println("Você está em uma reta, mesmo assim cuidado!");
		}
	}

	public void acelerar() {
		System.out.println("O veiculo " + this.nome + " está acelerando");
	}
	
	public void desacelerar() {
		System.out.println("O veiculo " + this.nome + " está desacelerando");
	}

}
