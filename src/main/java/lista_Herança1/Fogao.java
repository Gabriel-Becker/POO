package lista_Herança1;

public class Fogao extends Eletrodomesticos {

	private int bocas;
	
	public Fogao(String modelo, String fabricante, double kilowatt, int bocas) {
		super(modelo, fabricante, kilowatt);
		this.bocas = bocas;
	}

	public Fogao () {
		super();	
	}

	public int getBocas() {
		return bocas;
	}

	public void setBocas(int bocas) {
		this.bocas = bocas;
	}
	
}