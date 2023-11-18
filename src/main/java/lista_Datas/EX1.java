package lista_Datas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class EX1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.print("Informe uma data no padrão 'dd/MM/yyyy': ");
		String data = input.nextLine();
		
		LocalDate dataInformada = LocalDate.parse(data, formatador);
		
		System.out.println(dataInformada.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("pt", "BR")));
		
		input.close();
	}

}