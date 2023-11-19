package lista_polimorfismo;

public class Quadrado extends Forma_Geométrica {

	private double lado;
	
	public Quadrado(String nome, double lado) {
		super(nome);
		this.lado = lado;
	}

	public Quadrado() {
		super();
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return this.lado * this.lado;
	}

	@Override
	public double calcularPerimetro() {
		return this.lado * 4;
	}

	
}