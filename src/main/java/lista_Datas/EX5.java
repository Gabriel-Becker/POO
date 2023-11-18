package lista_Datas;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class EX5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		System.out.print("Informe sua data de nascimento no padrão 'dd/MM/yyyy' e sua hora de nascimento no padrão 'HH:mm:ss': ");
		LocalDateTime dataEHoraNascimento = LocalDateTime.parse(input.nextLine(), formatador);
		
		LocalDateTime dataAgora = LocalDateTime.now();
		
		Duration tempoDeVida = Duration.between(dataEHoraNascimento, dataAgora);
		
		System.out.println("O tempo de vida do usuário é: " + tempoDeVida.toHours() + " HORAS " + tempoDeVida.toMinutesPart() + " MINUTOS " + tempoDeVida.toSecondsPart() + " SEGUNDOS");
		
		input.close();
	}

}