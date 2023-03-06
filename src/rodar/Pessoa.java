package rodar;

public class Pessoa {
	protected String nome;
	protected Integer idade;
	protected Integer andar;
	
	public Pessoa() {
		
	}
	
	Pessoa(String nome, Integer idade, Integer andar){
		this.nome = nome;
		this.idade = idade;
		this.andar = andar;
	}
	
	public Integer getIdade() {
		return idade;
	}
	
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Integer passos(int passos) {
		this.andar = passos+1;
		return andar;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nome + " " + idade + "" + andar;
	}
}
