package lista_Datas;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class EX2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe uma quantidade de dias: ");
		int dia = input.nextInt();
		
		LocalDate data = LocalDate.now();
		
		LocalDate dataFutura = data.plusDays(dia);
		
		System.out.println("Daqui a " + dia + " dia(s), será dia: " + dataFutura.getDayOfMonth() + "/" + dataFutura.getMonthValue() + "/" + dataFutura.getYear() + " (" + dataFutura.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("pt", "BR")) + ")");
		
		input.close();
	}

}