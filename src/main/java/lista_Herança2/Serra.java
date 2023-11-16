package lista_Herança2;

public class Serra extends FerramentasEletricas{

	public Serra(String modelo, String fabricante, double pesoQuilos, double percentualDesgaste, double rotacaoRPM,
			double potenciaWatts, double tensaoVolts) {
		super(modelo, fabricante, pesoQuilos, percentualDesgaste, rotacaoRPM, potenciaWatts, tensaoVolts);
	}

	public Serra() {
		super();
	}
	
	
}