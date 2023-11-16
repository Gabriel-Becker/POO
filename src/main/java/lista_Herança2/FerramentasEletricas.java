package lista_Herança2;

public class FerramentasEletricas extends Ferramentas{

	private double rotacaoRPM;
	private double potenciaWatts;
	private double tensaoVolts;
	
	public FerramentasEletricas(String modelo, String fabricante, double pesoQuilos, double percentualDesgaste,
			double rotacaoRPM, double potenciaWatts, double tensaoVolts) {
		super(modelo, fabricante, pesoQuilos, percentualDesgaste);
		this.rotacaoRPM = rotacaoRPM;
		this.potenciaWatts = potenciaWatts;
		this.tensaoVolts = tensaoVolts;
	}
	
	public FerramentasEletricas() {
		super();
	}

	public double getRotacaoRPM() {
		return rotacaoRPM;
	}

	public void setRotacaoRPM(double rotacaoRPM) {
		this.rotacaoRPM = rotacaoRPM;
	}

	public double getPotenciaWatts() {
		return potenciaWatts;
	}

	public void setPotenciaWatts(double potenciaWatts) {
		this.potenciaWatts = potenciaWatts;
	}

	public double getTensaoVolts() {
		return tensaoVolts;
	}

	public void setTensaoVolts(double tensaoVolts) {
		this.tensaoVolts = tensaoVolts;
	}
	
	
}