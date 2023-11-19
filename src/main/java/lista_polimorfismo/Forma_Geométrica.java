package lista_polimorfismo;

public abstract class Forma_Geométrica {

	private String nome;

	public Forma_Geométrica(String nome) {
		super();
		this.nome = nome;
	}
	
	public Forma_Geométrica() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public abstract double calcularArea();
	
	public abstract double calcularPerimetro();
	
	
}