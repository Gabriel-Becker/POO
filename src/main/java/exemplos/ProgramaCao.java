package exemplos;

import java.util.Scanner;

public class ProgramaCao {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		Cao listaCaes[] = new Cao[4];
		
		// PRRENCHIMENTO DAS INFORMAÇÕES SOBRE A CLASSE CÃO.
		for (int i = 0; i < listaCaes.length; i++) {
			
			Cao cao = new Cao();
			
			System.out.print("Informe o nome do cão: ");
			cao.setNome(input.nextLine());
			
			System.out.print("Informe a raça do cão: ");
			cao.setRaca(input.nextLine());
			
			System.out.print("Informe o peso do cão: ");
			cao.setPeso(input.nextDouble()); 
			
			listaCaes[i] = cao;
			
			input.nextLine();
		}
		
		for (int i = 0; i < listaCaes.length; i++) {
			
			if (listaCaes[i].getPeso() > 15) {
				
				System.out.println("Nome: " + listaCaes[i].getNome());
				listaCaes[i].falar();
			}
		}
		
		input.close();
	}

}