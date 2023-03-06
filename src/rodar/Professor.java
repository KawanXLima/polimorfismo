package rodar;

public class Professor extends Pessoa {
	
	protected Double salario;
	
	public Professor() {
	}

	public Professor(Integer andar, String nome, Integer idade, Double salario) {
		super(nome, idade, andar);
		this.salario = salario;
	}
	
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public Double getSalario() {
		return salario;
	}
	
	public Integer passos(int passos) {
		this.andar = passos+5;
		return andar;
	}
	

	
}
