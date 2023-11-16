package exemplos;

public class ProgramaVeiculo {

	public static void main(String[] args) {
		
		Carro c1 = new Carro("Focus", "Ford", 2020, 45000.00, 170);
		System.out.println("Modelo: " + c1.getModelo());
		
		Carro c2 = new Carro("Golf", "Volks", 2000, 15000.00, 120);
		Carro c3 = new Carro("Fusca", "Volks", 1980, 35000.00, 190);
		
		Moto m1 = new Moto("CG-15", "Honda", 2022, 8000.00, 300);
		Moto m2 = new Moto("Ninja", "Kawalsaki", 2011, 18000.00, 1000);
		Moto m3 = new Moto("Halley", "Halley", 1995, 50000.00, 1200);
		
		Carro[] listaCarros = {c1, c2, c3};
		Moto[] listaMotos = {m1, m2, m3};
		
		//1 CALCULAR O VALOR TOTAL DOS CARROS.
		double valorTotalCarros = calcularValorTotalCarros(listaCarros);
		System.out.println("O valor total dos carros é: R$" + valorTotalCarros);
		
		//2 INFORMAR O MODELO DO CARRO COM MAIOR POTÊNCIA
		informarModeloCarroMaiorPotencia(listaCarros);
		
		//3 INFORMAR O VALOR TOTAL DAS MOTOS
		double valorTotalMotos = calcularValorTotalMotos(listaMotos);
		System.out.println("O valor total das motos é: R$" + valorTotalMotos);
		
		//4 INFORMAR O MODELO E O FABRICANTE DA MOTO MAIS ANTIGA
		informarModeloEFabricanteMaisAntigo(listaMotos);
		
		//5 CONTABILIZAR O VALOR DE TODOS OS VEÍCULOS
		contabilizarValorTotalVeiculos(valorTotalCarros, valorTotalMotos);
		
		System.out.println("Valor antes da depreciação: " + c1.getValor());
		c1.calcularDepreciacao();
		System.out.println("Valor depois da depreciação: " + c1.getValor());
		
		System.out.println("------------------------------");
		
		System.out.println("Valor antes da depreciação: " + m1.getValor());
		m1.calcularDepreciacao();
		System.out.println("Valor depois da depreciação: " + m1.getValor());
		
	}

	private static void contabilizarValorTotalVeiculos(double valorTotalCarros, double valorTotalMotos) {
		
		double valorTotalVeiculos = valorTotalCarros + valorTotalMotos;
		System.out.println("O valor total dos veículos é: R$" + valorTotalVeiculos);
		
	}

	private static void informarModeloEFabricanteMaisAntigo(Moto[] listaMotos) {
		
		Moto motoMaisAntiga = listaMotos[0];
		for (int i = 0; i < listaMotos.length; i++) {
			
			if (listaMotos[i].getAno() < motoMaisAntiga.getAno()) {
				
				motoMaisAntiga = listaMotos[i];
			
			}
			
		}
		
		System.out.println("A moto mais antiga é a " + motoMaisAntiga.getModelo() + " sua fabricante é a " + motoMaisAntiga.getFabricante());
		
	}

	private static double calcularValorTotalMotos(Moto[] listaMotos) {
		
		double valorTotalMotos = 0;
		for (int i = 0; i < listaMotos.length; i++) {
			
			valorTotalMotos += listaMotos[i].getValor();
			
		}
		
		return valorTotalMotos;
		
	}

	private static void informarModeloCarroMaiorPotencia(Carro[] listaCarros) {
		
		Carro carroMaiorPotencia = listaCarros[0];
		for (int i = 0; i < listaCarros.length; i++) {
			
			if (listaCarros[i].getPotenciaHP() > carroMaiorPotencia.getPotenciaHP()) {
				
				carroMaiorPotencia = listaCarros[i];				
			}
			
		}
		
		System.out.println("O carro com maior potência é o " + carroMaiorPotencia.getModelo());
		
	}

	private static double calcularValorTotalCarros(Carro[] listaCarros) {
		
		double valorTotalCarros = 0;
		for (int i = 0; i < listaCarros.length; i++) {
			valorTotalCarros += listaCarros[i].getValor();
			
		}
		
		return valorTotalCarros;
		
	}
	
}