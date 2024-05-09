package model;

public class PacienteIdoso extends Paciente{

	public void categoriaIMC(double imc) {
		if (imc < 21.9) {
			System.out.println("Abaixo do peso");
		} else if ((imc >= 22) && (imc <= 27)) {
			System.out.println("Peso normal");
		} else if ((imc >= 27.1) && (imc <= 30)) {
			System.out.println("Excesso de peso");
		} else if ((imc >= 30.1) && (imc <= 35)) {
			System.out.println("Obesidade classe I");
		}
	}
}
