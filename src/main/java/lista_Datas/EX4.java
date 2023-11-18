package lista_Datas;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class EX4 {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.print("Informe sua data de nascimento no padrão 'dd/MM/yyyy': ");
		String data = input.nextLine();
		
		LocalDate dataNascimento = LocalDate.parse(data, formatador);
		
		LocalDate dataAgora = LocalDate.now();
		
		Period tempoDeVida = Period.between(dataNascimento, dataAgora);
		
		System.out.println("O usuário possui: " + tempoDeVida.getYears() + " ano(s) " + tempoDeVida.getMonths() + " mes(es) " + tempoDeVida.getDays() + " dia(s)");
		
		input.close();
	}

}