package lista_Herança2;

public class Serrote extends FerramentasManuais{

	private double tamanhoPolegadas;
	private int quantidadeDentes;
	
	public Serrote(String modelo, String fabricante, double pesoQuilos, double percentualDesgaste, String tipo,
			double tamanhoPolegadas, int quantidadeDentes) {
		super(modelo, fabricante, pesoQuilos, percentualDesgaste, tipo);
		this.tamanhoPolegadas = tamanhoPolegadas;
		this.quantidadeDentes = quantidadeDentes;
	}
	
	public Serrote() {
		super();
	}

	public double getTamanhoPolegadas() {
		return tamanhoPolegadas;
	}

	public void setTamanhoPolegadas(double tamanhoPolegadas) {
		this.tamanhoPolegadas = tamanhoPolegadas;
	}

	public int getQuantidadeDentes() {
		return quantidadeDentes;
	}

	public void setQuantidadeDentes(int quantidadeDentes) {
		this.quantidadeDentes = quantidadeDentes;
	}

	
}