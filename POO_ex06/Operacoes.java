package POO_ex06;

public class Operacoes {
	
	private double num1;
	private double num2;
	
	public Operacoes(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
		
	}

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}
	
	
	
	public void somar() {
		double soma = num1 + num2;
		System.out.println("O total da soma �: " + soma);
	}
	
	public void subtrair() {
		double subtrair = num1 - num2;
		System.out.println("O total da subtra��o �: " + subtrair);
	}
	public void dividir(){
		if(num1 != 0 && num2 !=0) {
			double dividir = num1/num2;
			System.out.println("O total da divis�o �: " + dividir);
		}else {
			System.out.println("Numero n�o divisivel!");
		}
	}
	public void multiplicar() {
		double multiplicar = num1 * num2;
		System.out.println("O total da multiplica��o �: " + multiplicar);
	}
	public void elevado() {
		double elevado = Math.pow(num1,num2);
		System.out.println("O total da eleva��o �: " + elevado);
	}

}
