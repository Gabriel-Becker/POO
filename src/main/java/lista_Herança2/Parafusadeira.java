package lista_Herança2;

public class Parafusadeira extends FerramentasEletricas{

	public Parafusadeira(String modelo, String fabricante, double pesoQuilos, double percentualDesgaste,
			double rotacaoRPM, double potenciaWatts, double tensaoVolts) {
		super(modelo, fabricante, pesoQuilos, percentualDesgaste, rotacaoRPM, potenciaWatts, tensaoVolts);
	}

	public Parafusadeira() {
		super();
	}

	
}