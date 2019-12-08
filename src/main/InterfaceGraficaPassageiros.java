package main;

import java.util.Scanner;

import controllers.NegocioPassageiro;
import models.ModelPassageiro;
import repositories.RepositorioPassageiros;

public class InterfaceGraficaPassageiros {
	private static Scanner ler;

	static public void InterfaceGraficaPassageiro(NegocioPassageiro NegocioPassag ) {
		
		ler = new Scanner(System.in);
		int opcao;
		
		System.out.println("\n\n =*=*=*=*= Opções de passageiros =*=*=*=*= ");
		System.out.println(" Escolha uma opção: \n");
		System.out.println(" 1- Cadastrar passageiros");
		System.out.println(" 2- Editar passageiros");
		System.out.println(" 3- Excluir passageiros");
		System.out.println(" 4- Buscar");
		System.out.println(" 5- Voltar");
		
		opcao = ler.nextInt();
		
		switch(opcao) {
			case 1:{
				String cpf, nome, dt_nasc, tel;
				int pass;
				System.out.println("Digite o CPF do passageiro: ");
				cpf = ler.nextLine();
				System.out.println("Digite o nome do Passageiro: ");
				nome = ler.nextLine();
				System.out.println("Digite a data de nascimento: ");
				dt_nasc = ler.nextLine();
				System.out.println("Digite o telefone: ");
				tel = ler.nextLine();
				System.out.println("Digite o numero do passaporte: ");
				pass = ler.nextInt();
				
				ModelPassageiro Passageiro = new ModelPassageiro(cpf, nome, dt_nasc, tel, pass);
				try {
					NegocioPassag.inserirPassageiro(Passageiro);
					System.out.println("Inserido com sucesso!");
				}catch(Exception e) {
					System.out.println("Erro ao inserir!");
				}
				break;
			}
			case 2:{
				String cpf,novoNome;
				System.out.println("Digite o cpf do passageiro que deseja atualizar: ");
				cpf = ler.nextLine();
				System.out.println("Digite o novo nome: ");
				novoNome = ler.nextLine();
				try {
					NegocioPassag.atualizarPassageiro(cpf, novoNome);
				}catch(Exception e) {
					System.out.println("Erro ao atualizar!");
				}
				
				break;
			}
			case 3:{
				String cpf;
				System.out.println("Digite o cpf do passageiro que deseja apagar: ");
				cpf = ler.nextLine();
				try{
					NegocioPassag.deletarPassageiro(cpf);
				}catch(Exception e) {
					System.out.println("Erro ao apagar!");
				}
				break;
			}
			case 4:{
				String cpf;
				System.out.println("Digite o cpf do passageiro que deseja buscar: ");
				cpf = ler.nextLine();
				try {
					NegocioPassag.buscarPassageiro(cpf);
				}catch(Exception e) {
					System.out.println("Erro ao buscar!");
				}
				break;
			}
			case 5:{
				break;
			}
		}
		
		System.out.println("\n\n");
	}
}
