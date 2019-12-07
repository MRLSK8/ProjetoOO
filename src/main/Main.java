package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	private static Scanner scanner;

	public static void main(String[] args) {
		
		ArrayList<String> opcoes = new ArrayList<String>();
		scanner = new Scanner(System.in);
		String opcaoEscolhida = null;
		int tamanho = 0;
		
		opcoes.add(" Escolha uma opção: \n");
		opcoes.add(" 1- Cadastrar aeroportos");
		opcoes.add(" 2- Cadastrar passageiros");
		opcoes.add(" 3- Comprar passagens");
		opcoes.add(" 4- Sair");
		
		do {
			
			tamanho = opcoes.size();
	
			for(String opcao: opcoes){
				System.out.println(opcao);
			}
			
			opcaoEscolhida = scanner.nextLine();
			
			if(opcaoEscolhida.equals("1")) {
				InterfaceGraficaAeroportos.InterfaceGraficaAeroporto();			
			}else if(opcaoEscolhida.equals("2")){
				InterfaceGraficaPassageiros.InterfaceGraficaPassageiro();
			}else if(opcaoEscolhida.equals("3")){
				InterfaceGraficaCompraDePassagens.InterfaceGraficaCompraDePassagem();
			}else if(opcaoEscolhida.equals("4")){
				System.out.println("Finalizando...");
				break;
			}else {
				System.out.println("\n Opcão invalida! Digite um número inteiro entre 1 e " + (tamanho-1) + "! \n\n");				
			}
			
			
		}while(true);
		
	}
}
