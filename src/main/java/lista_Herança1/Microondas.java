package lista_Herança1;

public class Microondas extends Eletrodomesticos {

	private double capacidadeLitros;
	
	public Microondas(String modelo, String fabricante, double kilowatt, double capacidadeLitros) {
		super(modelo, fabricante, kilowatt);
		this.capacidadeLitros = capacidadeLitros;
	}

	public Microondas () {
		super();
	}

	public double getCapacidade() {
		return capacidadeLitros;
	}

	public void setCapacidade(double capacidade) {
		this.capacidadeLitros = capacidade;
	}
	
}