package lista_Herança2;

public class FerramentasManuais extends Ferramentas{

	private String tipo;

	public FerramentasManuais(String modelo, String fabricante, double pesoQuilos, double percentualDesgaste,
			String tipo) {
		super(modelo, fabricante, pesoQuilos, percentualDesgaste);
		this.tipo = tipo;
	}
	
	public FerramentasManuais() {
		super();
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}