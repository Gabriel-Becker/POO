package lista_polimorfismo;

public class Círculo extends Forma_Geométrica {

	private double raio;
	
	public Círculo(String nome, double raio) {
		super(nome);
		this.raio = raio;
	}

	public Círculo() {
		super();
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		return Math.PI * (this.raio * this.raio);
	}

	@Override
	public double calcularPerimetro() {
		return 2 * Math.PI * this.raio;
	}
	
	
}