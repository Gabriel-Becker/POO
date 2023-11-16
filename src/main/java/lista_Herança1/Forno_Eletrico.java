package lista_Herança1;

public class Forno_Eletrico extends Eletrodomesticos{

	private double capacidadeLitros;

	public Forno_Eletrico(String modelo, String fabricante, double kilowatt, double capacidadeLitros) {
		super(modelo, fabricante, kilowatt);
		this.capacidadeLitros = capacidadeLitros;
	}
	
	public Forno_Eletrico () {
		super();
	}

	public double getCapacidadeLitros() {
		return capacidadeLitros;
	}

	public void setCapacidadeLitros(double capacidadeLitros) {
		this.capacidadeLitros = capacidadeLitros;
	}

	@Override
	public double calcularConsumoDeEnergia() {
		// MANEIRA SEM USAR O MÉTODO DA SUPERCLASSE
		return (this.getKilowatt() * 31) + this.calcularDesperdicio();
	}

	@Override
	public double calcularConsumoDeEnergia(int dias) {
		// USANDO MÉTODO DA SUPERCLASSE
		return super.calcularConsumoDeEnergia(dias) + this.calcularDesperdicio(dias);
	}

	private double calcularDesperdicio () {
		// MANEIRA SEM USAR O MÉTODO DA SUPERCLASSE
		return (this.getKilowatt() * 31) * 0.25;
	}
	
	// OVERLOAD (SOBRECARGA)
	private double calcularDesperdicio (int dias) {
		// USANDO MÉTODO DA SUPERCLASSE
		return super.calcularConsumoDeEnergia(dias) * 0.25;
	}
	
}