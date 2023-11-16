package lista_Herança1;

public class Cozinha {

	public static void main(String[] args) {
		
		Geladeira geladeira = new Geladeira ("TF39S", "Electrolux", 40.5, 310);
		Fogao fogao = new Fogao ("BFS5NCR", "Brastemp", 60.2, 4);
		Lava_Louca lava_louca = new Lava_Louca("LE08S", "Elextrolux", 30.3, 8);
		Microondas microondas = new Microondas("MI41S", "Electrolux", 15.5, 31);
		Forno_Eletrico forno = new Forno_Eletrico("PFE48IP", "Philco", 50, 46);
		
		double consumoMensal = geladeira.calcularConsumoDeEnergia() + fogao.calcularConsumoDeEnergia() + lava_louca.calcularConsumoDeEnergia() + microondas.calcularConsumoDeEnergia() + forno.calcularConsumoDeEnergia();
		System.out.println(consumoMensal);
		
		double consumoDias = geladeira.calcularConsumoDeEnergia(10) + fogao.calcularConsumoDeEnergia(10) + lava_louca.calcularConsumoDeEnergia(10) + microondas.calcularConsumoDeEnergia(10) + forno.calcularConsumoDeEnergia(10);
		System.out.println(consumoDias);
		
	}

}