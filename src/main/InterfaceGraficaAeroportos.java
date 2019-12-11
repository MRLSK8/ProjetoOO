package main;

import java.util.ArrayList;
import java.util.Scanner;

import controllers.NegocioAeroporto;
import models.ModelAeroporto;

public class InterfaceGraficaAeroportos {
	private static Scanner ler;

	static public void InterfaceGraficaAeroporto(NegocioAeroporto NegocioAero) {
		ler = new Scanner(System.in);
		int opcaoEscolhida, tamanho = 0;
		ArrayList<String> opcoes = new ArrayList<String>();
		
		opcoes.add("\n\n =*=*=*=*= Opções de aeroportos =*=*=*=*= ");
		opcoes.add("\n Escolha uma opção: \n");
		opcoes.add(" 1- Cadastrar aeroporto");
		opcoes.add(" 2- Editar aeroporto");
		opcoes.add(" 3- Excluir aeroporto");
		opcoes.add(" 4- Buscar aeroporto");
		opcoes.add(" 5- Voltar para o menu principal");
		
		tamanho = opcoes.size();
		
		for(String opcao: opcoes){
			System.out.println(opcao);
		}
		
		opcaoEscolhida = ler.nextInt();
		
		switch(opcaoEscolhida) {
		
			case 1:{
				String cidade, estado, nome; 
				int codigoAeroporto;
				
				System.out.println("\n =*=*=*=*= Cadastro de aeroportos =*=*=*=*= ");
				System.out.println("Digite a cod do aeroporto: ");
				codigoAeroporto = ler.nextInt();
				
				ler.nextLine(); // Pega o caracter "enter"
				
				System.out.println("Digite a cidade do aeroporto: ");
				cidade = ler.nextLine();
				System.out.println("Digite o UF do aeroporto: ");
				estado = ler.nextLine();
				System.out.println("Digite o Nome do aeroporto: ");
				nome = ler.nextLine();
				
				ModelAeroporto aeroportoAuxiliar = new ModelAeroporto(codigoAeroporto, cidade, estado, nome);
					
				try {
					NegocioAero.inserirAerorporto(aeroportoAuxiliar);
					System.out.println("\nInserido com sucesso!");
				}catch(Exception e) {
					System.out.println("\nErro ao inserir!");
				}
				break;
			}
			
			case 2:{
				int codigoAnterior;
				String codigoAtual;
				
				ler.nextLine(); // Pega o caracter "enter"
				System.out.println("Digite o codigo anterior: ");
				codigoAnterior = ler.nextInt();
				ler.nextLine(); // Pega o caracter "enter"
				System.out.println("Digite o novo nome do aeroporto: ");
				codigoAtual = ler.nextLine();
				
				try {
					NegocioAero.atualizarAerorporto(codigoAnterior, codigoAtual);
					System.out.println("\nAtualizado com sucesso!");
				}catch(Exception e) {
					System.out.println("\nErro ao atualizar!");
				}
				
				break;
			}
			
			case 3:{
				String nomeAeroporto;
				
				ler.nextLine(); // Pega o caracter "enter"
				System.out.println("Digite nome do aeroporto: ");
				nomeAeroporto = ler.nextLine();
				
				try {
					NegocioAero.deletarAerorporto(nomeAeroporto);
					System.out.println("\nExcluido com sucesso!");
				}catch(Exception e) {
					System.out.println("\nErro ao Excluir!");
				}
				break;
			}
			
			case 4:{
				String nomeAeroporto;
				
				ler.nextLine(); // Pega o caracter "enter"
				System.out.println("Digite o nome do aeroporto: ");
				nomeAeroporto = ler.nextLine();
				
				try {
					System.out.print("Codigo do aeroporto buscado: ");
					System.out.println(NegocioAero.buscarAerorporto(nomeAeroporto).getCodigo_aeroporto());
				}catch(Exception e) {
					System.out.println(" Erro ao buscar!");
				}
				
				break;
			}
					
			case 5:{
				System.out.println("\nVoltando...");
				break;
			}
			
			default:{
				System.out.println("\n Opcão invalida! Digite um número inteiro entre 1 e " + (tamanho - 2)+ "! \n\n");
				break;
			}
		}
		
	}
}
