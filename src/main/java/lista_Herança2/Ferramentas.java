package lista_Herança2;

public class Ferramentas{

	private String modelo;
	private String fabricante;
	private double pesoQuilos;
	private double percentualDesgaste;
	
	public Ferramentas(String modelo, String fabricante, double pesoQuilos, double percentualDesgaste) {
		super();
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.pesoQuilos = pesoQuilos;
		this.percentualDesgaste = percentualDesgaste;
	}

	public Ferramentas () {
		super();
	}
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public double getPesoQuilos() {
		return pesoQuilos;
	}

	public void setPesoQuilos(double pesoQuilos) {
		this.pesoQuilos = pesoQuilos;
	}

	public double getPercentualDesgaste() {
		return percentualDesgaste;
	}

	public void setPercentualDesgaste(double percentualDesgaste) {
		this.percentualDesgaste = percentualDesgaste;
	}

	public double calcularVidaUtil () {
		
		return (100/this.getPercentualDesgaste());
	}
	
	// OVERLOAD (SOBRECARGA)
	public double calcularVidaUtil (String periodo) {
		
		double retorno = 0;
		
		if (periodo.equalsIgnoreCase("semana")) {
			
			retorno = this.calcularVidaUtil() / 24 / 7;
			
		} else {

			retorno = this.calcularVidaUtil() / 24;
		}
		return retorno;
	}
	
	
}