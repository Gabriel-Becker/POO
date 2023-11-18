package lista_Datas;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class EX3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("HH:mm:ss");
		
		System.out.print("Informe a hora de inicio no padrão 'HH:mm:ss': ");
		String horaInicial = input.nextLine();

		System.out.print("Informe a hora do fim no padrão 'HH:mm:ss': ");
		String horaFinal = input.nextLine();
		
		LocalTime horaInicio = LocalTime.parse(horaInicial, formatador);
		LocalTime horaFim = LocalTime.parse(horaFinal, formatador);
		
		Duration tempoPartida = Duration.between(horaInicio, horaFim);
		
		if (horaInicio.getHour() < horaFim.getHour()) {
			
			System.out.println("A partida durou: " + tempoPartida.toHoursPart() + " horas " + tempoPartida.toMinutesPart() + " minutos " + tempoPartida.toSecondsPart() + " segundos");
		} else {
			
			System.out.println("A partida durou: " + (tempoPartida.toHoursPart() + 24) + " horas " + tempoPartida.toMinutesPart() + " minutos " + tempoPartida.toSecondsPart() + " segundos");
		}

		input.close();
	}

}