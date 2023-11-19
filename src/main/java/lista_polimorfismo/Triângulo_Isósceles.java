package lista_polimorfismo;

public class Triângulo_Isósceles extends Triângulo{

	private double base;
	private double altura;
	
	public Triângulo_Isósceles(String nome, double base, double altura) {
		super(nome);
		this.base = base;
		this.altura = altura;
	}

	public Triângulo_Isósceles() {
		super();
	}
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return (this.base * this.altura) / 2;
	}

	@Override
	public double calcularPerimetro() {
		return this.base + this.altura;
	}


}