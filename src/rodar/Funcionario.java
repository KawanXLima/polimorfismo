package rodar;

public class Funcionario extends Pessoa{
	
	protected Double salario;

	public Funcionario() {
		
	}

	public Funcionario(Integer andar, String nome, Integer idade, Double salario) {
		super(nome, idade, andar);
		this.salario = salario;
	}

	public Double getSalario() {
		return salario;
	}


	public Integer passos(int passos) {
		this.andar = passos+2;
		return andar;
	}
	
	@Override
	public String toString() {
		return super.toString() + salario;
	}
	
}
