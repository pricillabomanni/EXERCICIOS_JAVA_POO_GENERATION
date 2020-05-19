package POO_ex04;

public class Voo {
	//PRECISO FAZER ESSE
	// atributos
	private int numVoo;
	private String data;
	private String horario;
	private int numPassageiros;

	// construtor
	public Voo(int numVoo, String data, String horario, int numPassageiros) {
		this.numVoo = numVoo;
		this.data = data;
		this.horario = horario;
		this.horario = horario;
	}

	// generate getters and setters
	public int getNumVoo() {
		return numVoo;
	}

	public void setNumVoo(int numVoo) {
		this.numVoo = numVoo;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public int getNumPassageiros() {
		return numPassageiros;
	}

	public void setNumPassageiros(int numPassageiros) {
		this.numPassageiros = numPassageiros;
	}

	// criando método
	public void controleVooA() {

		if (numPassageiros == 0) {
			System.out.println("Tente outro voo, este está completo");

		} else {
			System.out.println("Este voo só comporta apenas mais 1 passageiro, tente outro voo!");
		}

	}

	public void controleVooB() {

		if (numPassageiros < 50 && numPassageiros > 0) {
			System.out.println("Seu voo está confirmado!");
			System.out.println("VooB está com " + numPassageiros);
		} else {
			System.out.println("Este voo só comporta apenas mais 1 passageiro, tente outro voo!");
		}
	}

}
