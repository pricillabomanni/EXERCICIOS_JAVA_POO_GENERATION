package POO_ex07;

import java.util.Scanner;

public class ConsumindoClasseJanela {

	public static void main(String[] args) {

		double largura, altura;
		int estaAberta;

		Janela janelanova = new Janela(0, 0, 0);

		Scanner teclado = new Scanner(System.in);

		System.out.print("Informe a largura da janela: ");
		largura = teclado.nextDouble();
		janelanova.setLargura(largura);

		System.out.print("Informe a altura da janela: ");
		altura = teclado.nextDouble();
		janelanova.setAltura(altura);

		System.out.print("Informe o que deseja 1)Abrir janela ou 2)Fechar" + " janela 0)cancelar");
		estaAberta = teclado.nextInt();
		janelanova.setEstaAberta(estaAberta);

		while (estaAberta >= 1) {

			if (estaAberta == 1) {
				janelanova.abrirJanela();
				janelanova.mostraSituacaoJanela();
			} else if (estaAberta == 2) {
				janelanova.fecharJAnela();
				janelanova.mostraSituacaoJanela();
			}
			System.out.println();
			System.out.println("Informe o que deseja 1)Abrir janela ou 2)Fechar" + " janela 0)cancelar");
			estaAberta = teclado.nextInt();
			janelanova.setEstaAberta(estaAberta);

		}

	}

}
