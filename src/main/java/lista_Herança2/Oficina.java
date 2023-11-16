package lista_Herança2;

import java.text.DecimalFormat;

public class Oficina {

	public static void main(String[] args) {
		
		
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		Furadeira furadeira = new Furadeira("furadeira", "deira", 8.5, 0.5, 700, 4.5, 220);
		Lixadeira lixadeira = new Lixadeira("lixadeira", "eira", 5.5, 0.8, 400, 5.5, 220);
		Serra serra = new Serra ("serra", "erra", 3.3, 0.2, 550, 6.6, 220);
		Alicate alicate1 = new Alicate("alicate", "cate", 3.5, 0.1, "bico", 2);
		Alicate alicate2 = new Alicate("alicati", "cati", 3.8, 0.2, "corte", 2.3);
		Martelo martelo1 = new Martelo("martelo", "elo", 4.5, 0.3, "bola", 1000);
		Martelo martelo2 = new Martelo("martelu", "elu", 4.8, 0.4, "pena", 980);
		Serrote serrote = new Serrote("serrote", "ote", 6, 0.8, "universal", 9, 45);
		
		double consumoMes = (furadeira.getPotenciaWatts() * 3) + (lixadeira.getPotenciaWatts() * 2) + (serra.getPotenciaWatts() * 4) * 30;
		System.out.println("Consumo mês: " + formatador.format(consumoMes));
		
		double consumoSemana = (furadeira.getPotenciaWatts() * 3) + (lixadeira.getPotenciaWatts() * 2) + (serra.getPotenciaWatts() * 4) * 7;
		System.out.println("Consumo semana: " + formatador.format(consumoSemana));
		
		// DESCOBRIR MAIOR VIDA UTIL ENTRE AS FERRAMENTAS MANUAIS
		Ferramentas[] ferramentas = {alicate1, alicate2, martelo1, martelo2, serrote};
		Ferramentas ferramentaMaiorVidaUitl = ferramentas[0];
		
		for (Ferramentas ferramenta : ferramentas) {
			
			if (ferramenta.calcularVidaUtil() > ferramentaMaiorVidaUitl.calcularVidaUtil()) {
				
				ferramentaMaiorVidaUitl = ferramenta;
			}
		}
		
		System.out.println("Maior vida útil: " + ferramentaMaiorVidaUitl.getModelo());
		System.out.println("Vida útil em horas: " + formatador.format( ferramentaMaiorVidaUitl.calcularVidaUtil()));
		System.out.println("Vida útil em dias: " + formatador.format( ferramentaMaiorVidaUitl.calcularVidaUtil("dias")));
		System.out.println("Vida útil em semanas: " + formatador.format(ferramentaMaiorVidaUitl.calcularVidaUtil("semana")));
		
	}

}