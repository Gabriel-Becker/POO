package lista_Herança1;

public class Geladeira extends Eletrodomesticos {

	private double capacidadeLitros;
	
	public Geladeira(String modelo, String fabricante, double kilowatt, double capacidadeLitros) {
		super(modelo, fabricante, kilowatt);
		this.capacidadeLitros = capacidadeLitros;
	}

	public Geladeira () {
		super();
	}

	public double getCapacidade() {
		return capacidadeLitros;
	}

	public void setCapacidade(double capacidade) {
		this.capacidadeLitros = capacidade;
	}
	
}