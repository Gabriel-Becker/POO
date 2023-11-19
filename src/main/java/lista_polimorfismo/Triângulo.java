package lista_polimorfismo;

public abstract class Triângulo extends Forma_Geométrica{
	
	public Triângulo(String nome) {
		super(nome);
	}

	public Triângulo() {
		super();
	}
	
	@Override
	public abstract double calcularArea();

	@Override
	public abstract double calcularPerimetro();


}