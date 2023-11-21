package simulado_Avaliação1;

public class Farmacia extends Empresa{

	private Estoque estoque;
	
	public Farmacia(String nome, String cnpj, Endereco endereco, Estoque estoque) {
		super(nome, cnpj, endereco);
		this.estoque = estoque;
	}

	public Farmacia() {
		super();
	}

	public Estoque getEstoque() {
		return estoque;
	}

	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}
	
	
}