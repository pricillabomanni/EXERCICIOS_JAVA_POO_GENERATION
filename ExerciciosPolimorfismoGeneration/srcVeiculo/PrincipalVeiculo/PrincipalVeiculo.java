package PrincipalVeiculo;

import Classes.Caminhao;
import Classes.CarroPasseio;
import Classes.Veiculo;

public class PrincipalVeiculo {

	public static void main(String[] args) {
		
		Veiculo veiculo = new Veiculo();
		
		veiculo.entradaDadoDoVeiculo();
		veiculo.mostrarDadosDoVeiculo();
		System.out.println();
		System.out.println();
		
		CarroPasseio carroPasseio = new CarroPasseio();
		
		carroPasseio.entradaDadosDoCarroPasseio();
		carroPasseio.mostrarDadosDoCarroPasseio();
		System.out.println();
		System.out.println();
		
		Caminhao caminhao = new Caminhao();
		
		caminhao.entradaDadosDoCaminhao();
		caminhao.mostrarDadosDoCaminhao();

	}

}
