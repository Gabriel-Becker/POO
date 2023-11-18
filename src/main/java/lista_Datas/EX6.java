package lista_Datas;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class EX6 {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.of("America/Sao_Paulo"));
		
		System.out.print("Informe uma data no padrão 'dd/MM/yyyy' e uma hora no padrão 'HH:mm:ss': ");
		ZonedDateTime dataEHoraBrasil = ZonedDateTime.parse(input.nextLine(), formatador);
		
		Locale[] localidades = {new Locale("pt", "BR"), Locale.US, Locale.FRANCE, Locale.JAPAN};
		String[] fusos = {"America/Sao_Paulo", "America/New_York", "Europe/Paris", "Asia/Tokyo"};
		
		DateTimeFormatter formatador2 = DateTimeFormatter.ofPattern("EEEE, dd/MM/yyyy HH:mm:ss ZZZZ");
		
		for (int i = 0; i < localidades.length; i++) {
			
			System.out.println("País: " + localidades[i].getDisplayCountry());
			System.out.println("Dia da semana, Data e Hora: " + dataEHoraBrasil.format(formatador2.withLocale(localidades[i]).withZone(ZoneId.of(fusos[i]))));
			System.out.println("---------------------------");
		}
		input.close();
	}

}