package lista_polimorfismo;

import java.util.Random;

public class Programa_FormasGeometricas {

	public static void main(String[] args) {
		
		Random gerarNumeros = new Random();
		Forma_Geométrica[] arrayFormas = new Forma_Geométrica[7];
		
		for (int i = 0; i < arrayFormas.length; i++) {
			int formaSorteada = gerarNumeros.nextInt(7);
			
			switch (formaSorteada) {
			case 0:
				
				Quadrado quadrado = new Quadrado("Quadrado", (gerarNumeros.nextInt(9) + 1));
				arrayFormas[i] = quadrado;
				break;
				
			case 1:
				
				Círculo circulo = new Círculo("Círculo", (gerarNumeros.nextInt(9) + 1));
				arrayFormas[i] = circulo;
				break;
				
			case 2:
				
				Retângulo retangulo = new Retângulo("Rêtangulo", (gerarNumeros.nextInt(9) + 1), (gerarNumeros.nextInt(9) + 1));
				arrayFormas[i] = retangulo;
				break;
				
			case 3:
				
				Losango losango = new Losango("Losango", (gerarNumeros.nextInt(9) + 1), (gerarNumeros.nextInt(9) + 1), (gerarNumeros.nextInt(9) + 1), (gerarNumeros.nextInt(9) + 1));
				arrayFormas[i] = losango;
				break;
				
			case 4:
				
				Triângulo_Retângulo triangulo_retangulo = new Triângulo_Retângulo("Triângulo Retângulo", (gerarNumeros.nextInt(9) + 1), (gerarNumeros.nextInt(9) + 1));
				arrayFormas[i] = triangulo_retangulo;
				break;
				
			case 5:
				
				Triângulo_Equilátero triangulo_equilatero = new Triângulo_Equilátero("Triângulo Equilátero", (gerarNumeros.nextInt(9) + 1));
				arrayFormas[i] = triangulo_equilatero;
				break;
				
			case 6:
				
				Triângulo_Isósceles triangulo_isosceles = new Triângulo_Isósceles("Triângulo Isósceles", (gerarNumeros.nextInt(9) + 1), (gerarNumeros.nextInt(9) + 1));
				arrayFormas[i] = triangulo_isosceles;
				break;

			default:
				break;
			}
		}
		
		for (Forma_Geométrica forma_Geométrica : arrayFormas) {
			
			System.out.println(forma_Geométrica.getNome());
			System.out.println("Área: " + forma_Geométrica.calcularArea());
			System.out.println("Perímetro: " + forma_Geométrica.calcularPerimetro());
			System.out.println();
		}
	}
	
	
}