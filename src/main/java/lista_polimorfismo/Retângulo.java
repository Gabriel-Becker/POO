package lista_polimorfismo;

public class Retângulo extends Forma_Geométrica {

	private double ladoA;
	private double ladoB;
	
	public Retângulo(String nome, double ladoA, double ladoB) {
		super(nome);
		this.ladoA = ladoA;
		this.ladoB = ladoB;
	}

	public Retângulo() {
		super();
	}
	
	public double getLadoA() {
		return ladoA;
	}

	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}

	public double getLadoB() {
		return ladoB;
	}

	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}

	@Override
	public double calcularArea() {
		return this.ladoA * this.ladoB;
	}

	@Override
	public double calcularPerimetro() {
		return 2 * (this.ladoA + this.ladoB);
	}


}