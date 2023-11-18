package lista_Datas;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;
import java.util.Scanner;

public class EX9 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe uma data no formato 'dd/MM/yyyy': ");
		LocalDate data = LocalDate.parse(input.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy", new Locale("pt", "BR")));
		
		System.out.println("Data da última terça-feira: " + data.with(TemporalAdjusters.previous(DayOfWeek.TUESDAY)).format(DateTimeFormatter.ofPattern("dd/MM/yyyy - EEEE")));
		
		input.close();
	}

}