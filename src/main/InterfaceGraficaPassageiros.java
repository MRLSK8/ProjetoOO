package main;

import java.util.ArrayList;
import java.util.Scanner;
import controllers.NegocioPassageiro;
import models.ModelPassageiro;

public class InterfaceGraficaPassageiros {
	private static Scanner ler;

	static public void InterfaceGraficaPassageiro(NegocioPassageiro NegocioPassag ) {
		
		ler = new Scanner(System.in);
		int opcaoEscolhida, tamanho;
		ArrayList<String> opcoes = new ArrayList<String>();
		
		opcoes.add("\n =*=*=*=*= Opções de passageiros =*=*=*=*= ");
		opcoes.add("\n Escolha uma opção: \n");
		opcoes.add(" 1- Cadastrar passageiro");
		opcoes.add(" 2- Editar passageiro");
		opcoes.add(" 3- Excluir passageiro");
		opcoes.add(" 4- Buscar passageiro");
		opcoes.add(" 5- Voltar para o menu principal");
		
		tamanho = opcoes.size();
		
		for(String opcao: opcoes){
			System.out.println(opcao);
		}
		
		opcaoEscolhida = ler.nextInt();
		
		switch(opcaoEscolhida) {
		
			case 1:{
				String cpf, nome, data_nasc, telefone;
				int passaporte;
				
				ler.nextLine(); // Pega o caracter "enter"
				
				System.out.println("Digite o CPF do passageiro: ");
				cpf = ler.nextLine();
				System.out.println("Digite o nome do Passageiro: ");
				nome = ler.nextLine();
				System.out.println("Digite a data de nascimento: ");
				data_nasc = ler.nextLine();
				System.out.println("Digite o telefone: ");
				telefone = ler.nextLine();
				System.out.println("Digite o numero do passaporte: ");
				passaporte = ler.nextInt();
				
				ModelPassageiro NovoPassageiro = new ModelPassageiro(cpf, nome, data_nasc, telefone, passaporte);
				
				try {
					NegocioPassag.inserirPassageiro(NovoPassageiro);
					System.out.println("\nInserido com sucesso!");
				}catch(Exception e) {
					System.out.println("\nErro ao inserir!");
				}
				break;
			}
			
			case 2:{
				String cpf, novoNome;
				
				ler.nextLine(); // Pega o caracter "enter"
				
				System.out.println("Digite o cpf do passageiro que deseja atualizar: ");
				cpf = ler.nextLine();
				System.out.println("Digite o novo nome: ");
				novoNome = ler.nextLine();
				
				try {
					NegocioPassag.atualizarPassageiro(cpf, novoNome);
					System.out.println("\nAtualizado com sucesso");
				}catch(Exception e) {
					System.out.println("\nErro ao atualizar!");
				}
				
				break;
			}
			
			case 3:{
				String cpf;
				
				ler.nextLine(); // Pega o caracter "enter"
				
				System.out.println("Digite o cpf do passageiro que deseja apagar: ");
				cpf = ler.nextLine();
				
				try{
					NegocioPassag.deletarPassageiro(cpf);
					System.out.println("\nDeletado com sucesso");
				}catch(Exception e) {
					System.out.println("\nErro ao apagar!");
				}
				break;
			}
			
			case 4:{
				String cpf;
				
				ler.nextLine(); // Pega o caracter "enter"
				
				System.out.println("Digite o cpf do passageiro que deseja buscar: ");
				cpf = ler.nextLine();
				
				try {
					System.out.print("\nNome da pessoa procurada: ");
					System.out.println(NegocioPassag.buscarPassageiro(cpf).getNome());
				}catch(Exception e) {
					System.out.println("\nErro ao buscar!");
				}
				break;
			}
			
			case 5:{
				System.out.println("\nVoltando...");
				break;
			}
			
			default:{
				System.out.println("\n Opcão invalida! Digite um número inteiro entre 1 e "+ (tamanho - 2) + "! \n\n");
				break;
			}
		}
		
	}
}
