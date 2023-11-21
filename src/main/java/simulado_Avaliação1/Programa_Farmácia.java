package simulado_Avaliação1;

import java.util.Scanner;

public class Programa_Farmácia {

	public static void main(String[] args) {

		Endereco enderecoLegrand = new Endereco("Rua dos Remédios", 100, "Centro", "Palhoça", "Santa Catarina");
		Laboratorio legrand = new Laboratorio("Legrand", "12.345.678/0001-11", enderecoLegrand);

		Endereco enderecoMedley = new Endereco("Rua da medicação", 200, "Estreito", "Florianópolis", "Santa Catarina");
		Laboratorio medley = new Laboratorio("Medley", "12.345.678/0001-22", enderecoMedley);

		Remedio rosuva = new Remedio("Rosuva", 55.00, legrand);
		Remedio glifage = new Remedio("Glifage", 35.00, legrand);
		Remedio aradois_H = new Remedio("Aradois_H", 50.00, legrand);
		Remedio trandilax = new Remedio("Trandilax", 10.00, legrand);

		Remedio rosuvastatina = new Remedio("Rosuvastatina", 50.00, medley);
		Remedio lexotan = new Remedio("Lexotan", 40.00, medley);
		Remedio losartana = new Remedio("Losartana", 45.00, medley);
		Remedio torsilax = new Remedio("Torsilax", 15.00, medley);

		Remedio[] remediosFarmaciaSenac = {rosuva, rosuva, rosuva, rosuva, glifage, glifage, glifage, aradois_H,
				aradois_H, trandilax, rosuvastatina, lexotan, lexotan, losartana, losartana, losartana, torsilax,
				torsilax, torsilax, torsilax};
		Estoque estoqueFarmaciaSenac = new Estoque("Luciano", remediosFarmaciaSenac);
		Endereco enderecoFarmaciaSenac = new Endereco("Rua Jardim Silva", 360, "Centro", "Florianópolis",
				"Santa Catarina");
		Farmacia farmaciaSenac = new Farmacia("Farmácia do Senac", "12.345.678/0001-33", enderecoFarmaciaSenac,
				estoqueFarmaciaSenac);

		// 3 - A
		System.out.println("Nome do responsável pelo estoque: " + farmaciaSenac.getEstoque().getResponsavel());

		// 3 - B
		double totalValorEstoqueFarmacia = calcularTotalEstoqueFarmacia(farmaciaSenac);
		System.out.println("Total do valor do estoque da farmácia: R$" + totalValorEstoqueFarmacia);

		// 3 - C
		double totalDoEstoqueDoLaboratorio = calcularEstoqueLaboratorio(farmaciaSenac);
		System.out.println("Total do estoque do laboratório: R$" + totalDoEstoqueDoLaboratorio);

		// 3 - D
		imprimirInformacoesLaboratorio(farmaciaSenac);

	}

	private static void imprimirInformacoesLaboratorio(Farmacia farmaciaSenac) {

		Scanner input = new Scanner(System.in);

		System.out.print("Informe o nome do laboratório que deseja buscar as informações: ");
		String nomeLaboratorio = input.nextLine();

		String resposta = "";

		Remedio remedios[] = farmaciaSenac.getEstoque().getRemedios();

		if (nomeLaboratorio.equalsIgnoreCase("legrand")) {

			do {

				System.out.print("Qual informação do laboratório deseja buscar: ");
				String informacaoLaboratorio = input.nextLine();

				for (int i = 0; i < remedios.length; i++) {

					if (remedios[i].getLaboratorio().getNome().equalsIgnoreCase("legrand")) {

						if (informacaoLaboratorio.equalsIgnoreCase("nome")) {

							System.out.println(remedios[i].getLaboratorio().getNome());
							break;
						}

						if (informacaoLaboratorio.equalsIgnoreCase("cnpj")) {

							System.out.println(remedios[i].getLaboratorio().getCnpj());
							break;
						}

						if (informacaoLaboratorio.equalsIgnoreCase("endereco")) {

							System.out.println(remedios[i].getLaboratorio().getEndereco().toString());
							break;
						}
					}
				}

				System.out.print("Deseja buscar outra informação do laboratório SIM ou NAO: ");
				resposta = input.nextLine();

			} while (resposta.equalsIgnoreCase("SIM"));
		}

		if (nomeLaboratorio.equalsIgnoreCase("medley")) {

			do {

				System.out.print("Qual informação do laboratório deseja buscar: ");
				String informacaoLaboratorio = input.nextLine();

				for (int i = 0; i < remedios.length; i++) {

					if (remedios[i].getLaboratorio().getNome().equalsIgnoreCase("medley")) {

						if (informacaoLaboratorio.equalsIgnoreCase("nome")) {

							System.out.println(remedios[i].getLaboratorio().getNome());
							break;
						}

						if (informacaoLaboratorio.equalsIgnoreCase("cnpj")) {

							System.out.println(remedios[i].getLaboratorio().getCnpj());
							break;
						}

						if (informacaoLaboratorio.equalsIgnoreCase("endereco")) {

							System.out.println(remedios[i].getLaboratorio().getEndereco().toString());
							break;
						}
					}
				}

				System.out.print("Deseja buscar outra informação do laboratório SIM ou NAO: ");
				resposta = input.nextLine();

			} while (resposta.equalsIgnoreCase("SIM"));
		}
	}

	private static double calcularEstoqueLaboratorio(Farmacia farmaciaSenac) {

		Scanner input = new Scanner(System.in);
		System.out.print("Informe o nome do laboratório que deseja calcular o estoque: ");
		String nomeLaboratorio = input.nextLine();

		double totalDoEstoqueDoLaboratorio = 0;

		Remedio remedios[] = farmaciaSenac.getEstoque().getRemedios();

		for (int i = 0; i < remedios.length; i++) {

			if (nomeLaboratorio.equalsIgnoreCase("legrand")) {

				if (remedios[i].getLaboratorio().getNome().equalsIgnoreCase("legrand")) {

					totalDoEstoqueDoLaboratorio += remedios[i].getPreco();
				}

			} else if (nomeLaboratorio.equalsIgnoreCase("medley")) {

				if (remedios[i].getLaboratorio().getNome().equalsIgnoreCase("medley")) {

					totalDoEstoqueDoLaboratorio += remedios[i].getPreco();
				}
			}
		}

		return totalDoEstoqueDoLaboratorio;
	}

	private static double calcularTotalEstoqueFarmacia(Farmacia farmaciaSenac) {

		double totalValorEstoque = 0;

		Remedio remedios[] = farmaciaSenac.getEstoque().getRemedios();

		for (int i = 0; i < remedios.length; i++) {

			totalValorEstoque += remedios[i].getPreco();
		}
		return totalValorEstoque;
	}

	
}