package rodar;

public class Aluno extends Pessoa{
	protected Integer RA;

	public Aluno(Integer andar, String nome, Integer idade,Integer RA) {
		super(nome, idade, andar);
		this.RA = RA;
	}
	
	public void setRA(Integer rA) {
		RA = rA;
	}
	
	public Integer getRA() {
		return RA;
	}
	
	public Integer passos(int passos) {
		this.andar = passos+3;
		return andar;
	}
	
	@Override
	public String toString() {
		return super.toString() + "" + RA;
	}
}
