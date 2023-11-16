package exemplos;

import java.util.Scanner;

public class ProgramaPessoa {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Aluno aluno1 = new Aluno();
		
		System.out.print("Informe o nome do aluno: ");
		aluno1.setNome(input.nextLine());
		
		System.out.print("Informe a matrícula do aluno: ");
		aluno1.setMatricula(input.nextInt());
		
		input.nextLine();
		
		Aluno aluno2 = new Aluno();
		
		System.out.print("Informe o nome do aluno: ");
		aluno2.setNome(input.nextLine());
		
		System.out.print("Informe a matrícula do aluno: ");
		aluno2.setMatricula(input.nextInt());
		
		input.nextLine();

		//MATRICULA MAIS ANTIGA = MENOR NÚMERO DA MATRICULA.
		
		if (aluno1.getMatricula() < aluno2.getMatricula()) {
			
			System.out.println("O aluno " + aluno1.getNome() + " é o aluno mais antigo");
			
		} else {
			
			System.out.println("O aluno " + aluno2.getNome() + " é o aluno mais antigo");
		}
		
		Professor professor1 = new Professor();
		
		System.out.print("Informe o nome do professor: ");
		professor1.setNome(input.nextLine());
		
		System.out.print("Informe a matrícula do professor: ");
		professor1.setMatricula(input.nextInt());
		
		System.out.print("Informe o salário do professor: ");
		professor1.setSalario(input.nextDouble());
		
		input.nextLine();
		
		Professor professor2 = new Professor();
		
		System.out.print("Informe o nome do professor: ");
		professor2.setNome(input.nextLine());
		
		System.out.print("Informe a matrícula do professor: ");
		professor2.setMatricula(input.nextInt());

		System.out.print("Informe o salário do professor: ");
		professor2.setSalario(input.nextDouble());
		
		if (professor1.getSalario() < professor2.getSalario()) {
			
			System.out.println("O maior salário é do professor " + professor2.getNome());
			
		} else {
			
			System.out.println("O maior salário é do professor " + professor1.getNome());
			
		}
		
		input.close();
	}

}