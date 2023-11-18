package lista_Datas;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class EX7 {

	public static void main(String[] args) {

		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		ZonedDateTime fusoSP = ZonedDateTime.now();
		fusoSP = fusoSP.withHour(19).withMinute(0).withSecond(0);
		fusoSP = fusoSP.plusHours(11).plusMinutes(20);
		
		ZonedDateTime fusoParis = fusoSP.withZoneSameInstant(ZoneId.of("Europe/Paris"));
		System.out.println("Hora São Paulo: " + fusoSP.format(formatador));
		System.out.println("Hora Paris: " + fusoParis.format(formatador));
	}

}