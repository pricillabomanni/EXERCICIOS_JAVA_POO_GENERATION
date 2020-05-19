package POO_ex05;

public class Empregados {
	//PRECISO FAZER ESSE
	private int id;
	private String nome;
	private String sobrenome;
	private double salarioAtual;
	private double porcentagem;
	
	public Empregados(int id, String nome, String sobrenome, double salarioAtual, double porcentagem) {
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salarioAtual = salarioAtual;
		this.porcentagem = porcentagem;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public double getPorcentagem() {
		return porcentagem;
	}

	public void setPorcentagem(double porcentagem) {
		this.porcentagem = porcentagem;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public double getSalarioAtual() {
		return salarioAtual;
	}

	public void setSalarioAtual(double salarioAtual) {
		this.salarioAtual = salarioAtual;
	}
	
	
	
	public void nomeCompletoComSalario() {
		System.out.println(id+ " funcionario " + nome + " " + sobrenome + " recebe " + salarioAtual);
	}
	public void aumentoSalario() {
		double aumento = salarioAtual * 0.20;
		System.out.println("O salario atua é " + salarioAtual + " e com o aumento de 20% fica "+ aumento);
	}
	public void aumentarSalarioPorcentagemDoUsuario() {
		double aumentoSalario = salarioAtual * porcentagem;
		System.out.println("Porcentagem que você inseriu " + porcentagem + " seu salario atual" + salarioAtual + "aumento de salario fica "+ aumentoSalario );
	}

}
