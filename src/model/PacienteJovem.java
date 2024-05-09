package model;

public class PacienteJovem extends Paciente {

	public void categoriaIMC(double imc) {
		if (imc < 18.5) {
			System.out.println("Abaixo do peso");
		} else if ((imc >= 18.5) && (imc <= 24.9)) {
			System.out.println("Peso normal");
		} else if ((imc >= 25) && (imc <= 29.9)) {
			System.out.println("Excesso de peso");
		} else if ((imc >= 30) && (imc <= 34.9)) {
			System.out.println("Obesidade classe I");
		}
	}
}
