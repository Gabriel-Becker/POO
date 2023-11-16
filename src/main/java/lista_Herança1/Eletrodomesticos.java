package lista_Herança1;

public class Eletrodomesticos {

	private String modelo;
	private String fabricante;
	private double kilowatt;
	
	public Eletrodomesticos(String modelo, String fabricante, double kilowatt) {
		super();
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.kilowatt = kilowatt;
	}

	public Eletrodomesticos () {
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

	public double getKilowatt() {
		return kilowatt;
	}

	public void setKilowatt(double kilowatt) {
		this.kilowatt = kilowatt;
	}

	public double calcularConsumoDeEnergia () {
		
		return this.getKilowatt() * 31;
	}
	
	// OVERLOAD (SOBRECARGA)
	public double calcularConsumoDeEnergia (int dias) {
		
		return this.getKilowatt() * dias;
	}
}