package lista_Herança2;

public class Furadeira extends FerramentasEletricas{

	public Furadeira(String modelo, String fabricante, double pesoQuilos, double percentualDesgaste, double rotacaoRPM,
			double potenciaWatts, double tensaoVolts) {
		super(modelo, fabricante, pesoQuilos, percentualDesgaste, rotacaoRPM, potenciaWatts, tensaoVolts);
	}

	public Furadeira() {
		super();
	}
	
}