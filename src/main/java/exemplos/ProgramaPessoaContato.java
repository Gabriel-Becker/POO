package exemplos;

public class ProgramaPessoaContato {

	public static void main(String[] args) {
		
		Contato c1 = new Contato("98844-8844", "adriano@prof.senac.br");
		Professor p1 = new Professor("Adriano", 123, c1, 5000.00);
		
		Contato c2 = new Contato("98833-8833", "melo@prof.senac.br");
		Professor p2 = new Professor("Melo", 321, c2, 8000.00);
		
		Contato c3 = new Contato("98822-8822", "flavio@prof.senac.br");
		Professor p3 = new Professor("Flávio", 213, c3, 4000.00);
		
		Contato c4 = new Contato("98811-8811", "andre@prof.senac.br");
		Professor p4 = new Professor("André", 312, c4, 10000.00);
		
		Professor[] listaProfessores = {p1, p2, p3, p4};
		
		for (Professor professor : listaProfessores) {
			
			professor.informarDadosContato();
			
		}
		
	}

}