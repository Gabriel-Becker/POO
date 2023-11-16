package lista_Herança1;

public class Lavadora_roupas extends Eletrodomesticos {

	private double capacidadeQuilos;
	
	public Lavadora_roupas(String modelo, String fabricante, double kilowatt, double capacidadeQuilos) {
		super(modelo, fabricante, kilowatt);
		this.capacidadeQuilos = capacidadeQuilos;
	}

	public Lavadora_roupas () {
		super();
	}

	public double getCapacidade() {
		return capacidadeQuilos;
	}

	public void setCapacidade(double capacidade) {
		this.capacidadeQuilos = capacidade;
	}
	
}