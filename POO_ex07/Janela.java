package POO_ex07;

public class Janela {

	private double largura;
	private double altura;
	private int estaAberta;

	public Janela(double largura, double altura, int estaAberta) {
		this.largura = largura;
		this.altura = altura;
		this.estaAberta = estaAberta;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int isEstaAberta() {
		return estaAberta;
	}

	public void setEstaAberta(int estaAberta) {
		this.estaAberta = estaAberta;
	}

	public void abrirJanela() {

		System.out.println("A janela está aberta!");

	}

	public void fecharJAnela() {

		System.out.println("A janela está fechada!");

	}

	public void mostraSituacaoJanela() {
		System.out.println("A jenela tem " + largura + " de largura por " + altura + " de altura.");
	}

}
