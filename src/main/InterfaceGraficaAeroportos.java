package main;

import java.util.Scanner;

import controllers.NegocioAeroporto;
import models.ModelAeroporto;

public class InterfaceGraficaAeroportos {
	private static Scanner ler;

	static public void InterfaceGraficaAeroporto(NegocioAeroporto NegocioAero) {
		ler = new Scanner(System.in);
		int opcaoEscolhida;
		
		System.out.println(" Escolha uma opção: \n");
		System.out.println(" 1- Cadastrar aeroportos");
		System.out.println(" 2- Editar aeroportos");
		System.out.println(" 3- Excluir aeroportos");
		System.out.println(" 4- Buscar");
		System.out.println(" 5- Voltar");
		
		opcaoEscolhida = ler.nextInt();
		
		switch(opcaoEscolhida) {
		
			case 1:{
				//cadastro
				String cid, uf, nome; 
				int num;
				System.out.println("\n\n =*=*=*=*= Cadastro de aeroportos =*=*=*=*= ");
				System.out.println("Digite a cod do aeroporto: ");
				num = ler.nextInt();
				System.out.println("Digite a cidade do aeroporto: ");
				cid = ler.nextLine();
				System.out.println("Digite o UF do aeroporto: ");
				uf = ler.nextLine();
				System.out.println("Digite o Nome do aeroporto: ");
				nome = ler.nextLine();
				
				//precisa modificar	
				ModelAeroporto Aux = new ModelAeroporto(num, cid, uf, nome);
					
				try {
					NegocioAero.inserirAerorporto(Aux);
					System.out.println("Inserido com sucesso!");
				}catch(Exception e) {
					System.out.println("Erro ao inserir!");
				}
				break;
			}
			case 2:{
				//atualizar
				String anterior, atual;
				System.out.println("Digite o nome do cod anterior: ");
				anterior = ler.nextLine();
				System.out.println("Digite o nome do  novo cod: ");
				atual = ler.nextLine();
				try {
					NegocioAero.atualizarAerorporto(anterior, atual);
					System.out.println("Atualizado com sucesso!");
				}catch(Exception e) {
					System.out.println("Erro ao atualizar!");
				}
				break;
			}
			case 3:{
				String nome;
				System.out.println("Digite nome do aeroporto: ");
				nome = ler.nextLine();
				try {
					NegocioAero.deletarAerorporto(nome);
					System.out.println("Excluido com sucesso!");
				}catch(Exception e) {
					System.out.println("Erro ao Excluir!");
				}
				break;
			}
			case 4:{
				String nome;
				System.out.println("Digite nome do aeroporto: ");
				nome = ler.nextLine();
				try {
					System.out.print("Nome do aeroporto buscado: ");
					System.out.println(NegocioAero.buscarAerorporto(nome).getNome_aeroporto());
				}catch(Exception e) {
					System.out.println("Erro ao buscar!");
				}
				break;
			}
			case 5:{
				System.out.println("Voltando...");
				break;
			}
		}
		System.out.println("\n\n");
	}
}
