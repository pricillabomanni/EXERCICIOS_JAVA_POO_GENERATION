package POO_ex03;

import jdk.internal.org.jline.utils.OSUtils;

public class ContaCorrente {

	// atributos
	private int numAgencia;
	private int numConta;
	private int saldoAtual;
	private int deposito;
	private int saque;
	private int valor;

	// construtor
	public ContaCorrente(int numAgencia, int numConta, int saldoAtual, int deposito, int saque, int valor) {
		this.numAgencia = numAgencia;
		this.numConta = numConta;
		this.saldoAtual = saldoAtual;
		this.deposito = deposito;
		this.saque = saque;
		this.valor = valor;
	}

	// getters and setters
	public int getNumAgencia() {
		return numAgencia;
	}

	public void setNumAgencia(int numAgencia) {
		this.numAgencia = numAgencia;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public int getSaldoAtual() {
		return saldoAtual;
	}

	public void setSaldoAtual(int saldoAtual) {
		this.saldoAtual = saldoAtual;
	}

	public int getDeposito() {
		return deposito;
	}

	public void setDeposito(int deposito) {
		this.deposito = deposito;
	}

	public int getSaque() {
		return saque;
	}

	public void setSaque(int saque) {
		this.saque = saque;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	// outros metodos
	public void mostraDeposito() {
		System.out.print("Seu deposito foi de R$" + deposito + " foi efetuado com sucesso!");
	}

	public void mostraSaque() {
		saldoAtual = deposito;
		if (saque <= saldoAtual) {
			System.out.print("Seu deposito foi de R$" + saque + " foi realizado com sucesso!");
		}else {
			System.out.println("Saldo insuficiente, você tem: " + saldoAtual + "na conta!");
		}
	}
	public void mostraSaldoAtual() {
		saldoAtual = deposito - saque;
		System.out.print("Seu saldo atual é de R$" + saldoAtual);

	}


}
