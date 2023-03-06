package rodar;


public class main {
	public static void main(String[] args) {
		Pessoa pes = new Pessoa("Jose",12,5);
		
		System.out.println(pes.passos(1));
		
		Pessoa func = new Funcionario(5, "Tomas", 12, 300.00);
		
		System.out.println(func.passos(1));
		
		Pessoa aluno = new Aluno(5, "Joao", 12, 12345);
		
		System.out.println(aluno.passos(1));
		
		Pessoa professor = new Professor(5,"Rosa",12,300.00);
		
		System.out.println(professor.passos(1));
		
	}
}
