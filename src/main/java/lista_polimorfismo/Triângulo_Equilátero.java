package lista_polimorfismo;

public class Triângulo_Equilátero extends Triângulo{

	private double lado;
	
	public Triângulo_Equilátero(String nome, double lado) {
		super(nome);
		this.lado = lado;
	}

	public Triângulo_Equilátero() {
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
		return ((this.lado * this.lado) * (Math.sqrt(3))) / 4;
	}

	@Override
	public double calcularPerimetro() {
		return this.lado * 3;
	}

	
}