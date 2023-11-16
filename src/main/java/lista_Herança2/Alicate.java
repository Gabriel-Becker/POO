package lista_Herança2;

public class Alicate extends FerramentasManuais{

	private double tamanhoPolegadas;

	public Alicate(String modelo, String fabricante, double pesoQuilos, double percentualDesgaste, String tipo,
			double tamanhoPolegadas) {
		super(modelo, fabricante, pesoQuilos, percentualDesgaste, tipo);
		this.tamanhoPolegadas = tamanhoPolegadas;
	}
	
	public Alicate() {
		super();
	}

	public double getTamanhoPolegadas() {
		return tamanhoPolegadas;
	}

	public void setTamanhoPolegadas(double tamanhoPolegadas) {
		this.tamanhoPolegadas = tamanhoPolegadas;
	}
	
	
}