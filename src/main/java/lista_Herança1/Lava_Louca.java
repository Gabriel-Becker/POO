package lista_Herança1;

public class Lava_Louca extends Eletrodomesticos {

	private double capacidadeLitros;
	
	public Lava_Louca(String modelo, String fabricante, double kilowatt, double capacidadeLitros) {
		super(modelo, fabricante, kilowatt);
		this.capacidadeLitros = capacidadeLitros;
	}

	public Lava_Louca () {
		super();
	}

	public double getCapacidade() {
		return capacidadeLitros;
	}

	public void setCapacidade(double capacidade) {
		this.capacidadeLitros = capacidade;
	}

}