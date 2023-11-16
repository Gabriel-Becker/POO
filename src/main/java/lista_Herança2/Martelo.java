package lista_Herança2;

public class Martelo extends FerramentasManuais{

	private double tamanhoMilimetro;

	public Martelo(String modelo, String fabricante, double pesoQuilos, double percentualDesgaste, String tipo,
			double tamanhoMilimetro) {
		super(modelo, fabricante, pesoQuilos, percentualDesgaste, tipo);
		this.tamanhoMilimetro = tamanhoMilimetro;
	}
	
	public Martelo() {
		super();
	}

	public double getTamanhoMilimetro() {
		return tamanhoMilimetro;
	}

	public void setTamanhoMilimetro(double tamanhoMilimetro) {
		this.tamanhoMilimetro = tamanhoMilimetro;
	}
	
	
}