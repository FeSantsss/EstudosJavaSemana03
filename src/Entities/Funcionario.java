package Entities;

public class Funcionario {
	private int id;
	private String nome;
	private double salario;
	
	public Funcionario(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
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

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}
	
	public void AcrescimentoSalario(double porcetagem) {
		salario += salario *  porcetagem / 100.00;
	}
	
	public String toString() {
		return id + ": " + nome + ", " + String.format("%.2f", salario);
	}
	
}
