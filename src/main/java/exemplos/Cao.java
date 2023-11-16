package exemplos;

public class Cao {

	// ATRIBUTOS
	private String nome;
	private double peso;
	private String raca;
	
	// GETS E SETS
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public double getPeso() {
			return peso;
		}

		public void setPeso(double peso) {
			
			if (peso > 0) {
				
				this.peso = peso;
				
			} else {
					
				System.out.println("Informe um peso válido!!");
	
			}
			
		}

		public String getRaca() {
			return raca;
		}

		public void setRaca(String raca) {
			this.raca = raca;
		}
	
	// MÉTODOS
	public void falar () {
		
		if (peso > 60) {
			
			System.out.println("Woof, woof, woof");
			
		} else if (peso < 15) {
			
			System.out.println("Yip, Yip, Yip");
			
		} else {
			
			System.out.println("Ruff, Ruff, Ruff");
			
		}
		
	}

}