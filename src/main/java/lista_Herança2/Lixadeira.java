package lista_Herança2;

public class Lixadeira extends FerramentasEletricas{

	public Lixadeira(String modelo, String fabricante, double pesoQuilos, double percentualDesgaste, double rotacaoRPM,
			double potenciaWatts, double tensaoVolts) {
		super(modelo, fabricante, pesoQuilos, percentualDesgaste, rotacaoRPM, potenciaWatts, tensaoVolts);
	}

	public Lixadeira() {
		super();
	}
	
	
}