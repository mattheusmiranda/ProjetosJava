package exsobreescrita;

public class ExemploHerancaJava {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Joao", "999.888.777-66", 1111);
		a1.imprime();
		
		Professor p1 = new Professor("Jose", "888.555,222-00", 3000f);
		p1.imprime();
		
		Pessoa pe1 = new Pessoa("Maria", "111.222.444-77");
		pe1.imprime();
		
	}
}
