package model;

public class Paciente {
	private int codigo, idade;
	private String nome, dataNascimento;
	private double peso, altura;

	public Paciente() {
		super();
	}

	public Paciente(int codigo, int idade, String nome, String dataNascimento, double peso, double altura) {
		super();
		this.codigo = codigo;
		this.idade = idade;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.peso = peso;
		this.altura = altura;

	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double calcularIMC(double peso, double altura) {
		double imc = peso / (altura * altura);
		return imc;
	}

}
