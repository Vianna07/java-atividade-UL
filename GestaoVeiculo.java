package concessionaria;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
public class GestaoVeiculo {

	private ArrayList<Veiculo> veiculos;
	private Scanner scanner;
	
	public GestaoVeiculo() {
		veiculos = new ArrayList<>();
		scanner = new Scanner(System.in);
	}
	public void iniciar() {
		
		int opcao;
	
		 do {System.out.println("\nMenu");
		 System.out.println("1- Adicionar carro");
		 System.out.println("2- Adicionar motocicleta");
		 System.out.println("3- Vizualisar detalher dos carros");
		 System.out.println("4- Vizualisar detalher das motos");
		 System.out.println("5- Vizualisar detalher dos veiculos");
		 System.out.println("6- Sair");
		 System.out.println("Escolha uma opção:");
		 opcao = scanner.nextInt();
				 
		 switch(opcao) {
		 case 1:
			 adicionarCarro();
			 System.out.println("Carro adicionado");
		 
		 break;
		 case 2:
			 adicionarMoto();
			 System.out.println("Motocicleta adicionada");
			 break;
		 case 3:
		 case 4:
			 visualizarDetalhesVeiculos((opcao == 3) ? "Carro" : "Moto");
			 System.out.println("Visualisando detalhes do(a)" + ((opcao == 3) ? "Carro" : "Moto"));
			 break;
		 case 5:
			 visualizarDetalhesTodosVeiculos();
			 System.out.println("Visualisando detalhes do veículo");
			 break;
		 case 6:
			 System.out.println("Muito obrigado por usar o sistema");
			 break;
		 default:
			 System.out.println("Opção invalida! tente novamente");
		 }
		 }while(opcao !=4);
	}
	private void adicionarCarro() {
		System.out.println("Digite o ano do carro:");
		int ano = scanner.nextInt();
		System.out.println("Digite o modelo do carro:");
		String nome = scanner.next();
		System.out.println("Digite a marca do carro:");
		String marca = scanner.next();
		System.out.println("Digite a cor do carro:");
		String cor = scanner.next();
		System.out.println("Digite a quilometragem do carro:");
		int km = scanner.nextInt();
		System.out.println("Digite a capacidade de passageiros:");
		int passageiro = scanner.nextInt();
		Carro novoCarro = new Carro(ano,nome,marca,cor,km,passageiro);
		veiculos.add(novoCarro);
	}
	private void adicionarMoto() {
		System.out.println("Digite o ano da moto:");
		int ano = scanner.nextInt();
		System.out.println("Digite o modelo da moto:");
		String nome = scanner.next();
		System.out.println("Digite a marca da moto:");
		String marca = scanner.next();
		System.out.println("Digite a cor da moto:");
		String cor = scanner.next();
		System.out.println("Digite a quilometragem da moto:");
		int km = scanner.nextInt();
		System.out.println("Digite a cilindrada da moto:");
		int cilindrada = scanner.nextInt();
		
		Moto novaMoto = new Moto(ano,nome,marca,cor,km,cilindrada);
		veiculos.add(novaMoto);
	}
	private void visualizarDetalhesVeiculos(String type) {
		if(veiculos.isEmpty()) {
			System.out.println("Nenhum veiculo disponivel!");
			return;
		}

		for(Veiculo veiculo: veiculos) {
			System.out.println("-----------------------------------");
			if(veiculo.getClass().getSimpleName().equals(type)) {
				veiculo.exibirdetalhes();
			}
			System.out.println("-----------------------------------");
		}
	}
	
	private void visualizarDetalhesTodosVeiculos() {
		if(veiculos.isEmpty()) {
			System.out.println("Nenhum veiculo disponivel!");
			return;
		}
		for(Veiculo veiculo: veiculos) {
			System.out.println("-----------------------------------");
			veiculo.exibirdetalhes();
			System.out.println("-----------------------------------");
		}
	}
}
