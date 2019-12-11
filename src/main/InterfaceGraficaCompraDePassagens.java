package main;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import models.ModelAeroporto;
import models.ModelCompraDePassagem;
import models.ModelPassageiro;
import controllers.NegocioAeroporto;
import controllers.NegocioCompraDePassagem;
import controllers.NegocioPassageiro;

public class InterfaceGraficaCompraDePassagens {
	private static Scanner ler;

	static public void InterfaceGraficaCompraDePassagem(NegocioCompraDePassagem NegocioCompra, NegocioAeroporto NegocioAero, NegocioPassageiro NegocioPassag) {
		 
		ModelAeroporto aeroportoOrigem = null, aeroportoDestino = null;
		String codigo, nomeOrigem, nomeDestino, cpf;
		ModelCompraDePassagem novaPassagem = null;
		ModelPassageiro passageiro = null; 
		ler = new Scanner(System.in);
		int poltrona, opcaoEscolhida;
		float  valor;
		boolean valido = true;
		System.out.println("\\n\\n =*=*=*=*= Op��es de passagens =*=*=*=*= ");
		System.out.println("1-Comprar passagem");
		System.out.println("2-Atualizar passagem");
		System.out.println("3-Deletar passagem");
		System.out.println("4-Buscar passagem");
		System.out.println("5-Voltar\n");
		
		opcaoEscolhida = ler.nextInt();
		
		switch(opcaoEscolhida) {
			case 1:{
				ler.nextLine();
				System.out.println("\n\n =*=*=*=*= Compra de passagens =*=*=*=*= ");
				System.out.println("Digite o codigo da passagem: ");
				codigo = ler.nextLine();
				System.out.println("Digite o numero da poltrona: ");
				poltrona = ler.nextInt();
				ler.nextLine();
				System.out.println("Digite o nome do aeroporto de origem: ");
				nomeOrigem = ler.nextLine();
				System.out.println("Digite o nome do aeroporto de destino: ");
				nomeDestino = ler.nextLine();
				System.out.println("Digite o cpf do passageiro: ");
				cpf = ler.nextLine();
				System.out.println("Digite o valor da passagem: ");
				valor = ler.nextFloat();
				ler.nextLine();
				
				try{
					aeroportoOrigem = NegocioAero.buscarAerorporto(nomeOrigem);
					aeroportoDestino = NegocioAero.buscarAerorporto(nomeDestino);
				}catch(Exception e) {
					System.out.println("\nAeroporto origem e/ou destino n�o encontrado! ");
					valido = false;
				}
				try {
					passageiro = NegocioPassag.buscarPassageiro(cpf);
				}catch(Exception e) {
					System.out.println("\nPassageiro n�o encontrado! ");
					valido = false;
				}
				if(valido) {
					novaPassagem = new ModelCompraDePassagem(codigo, poltrona, aeroportoOrigem, aeroportoDestino, passageiro, valor);
					try {
						NegocioCompra.inserirPassagem(novaPassagem);
						System.out.println("\n Compra realizada com sucesso!");
					}catch(Exception e) {
						System.out.println("\nN�o foi possivel realizar a compra...");
					}
				}
				break;
			}
			case 2:{
				float novoValor;
				System.out.println("\n\n =*=*=*=*= Atualizar de passagens =*=*=*=*= ");
				System.out.println("Digite o codigo da passagem: ");
				codigo = ler.nextLine();
				System.out.println("Digite o novo valor da passagem: ");
				novoValor = ler.nextFloat();
				ler.nextLine();
				try {
					NegocioCompra.atualizarPassagem(codigo, novoValor);
					System.out.println("Valor Atualizado com sucesso!\n");
				} catch (Exception e) {
					System.out.println("N�o foi possivel atualizar a passagem!\n");
				}
				break;
			}
			case 3:{
				System.out.println("\n\n =*=*=*=*= Deletar passagem =*=*=*=*= ");
				System.out.println("Digite o codigo da passagem: ");
				codigo = ler.nextLine();
				try {
					NegocioCompra.deletarPassagem(codigo);
					System.out.println("Passagem deletada com sucesso!\n");
				}catch(Exception e) {
					System.out.println("N�o foi possivel deletar a passagem!\n");
				}
				break;
			}
			case 4:{
				String data;
				ler.nextLine();
				System.out.println("\n\n =*=*=*=*= Buscar passagem =*=*=*=*= ");
				System.out.println("Digite a data passagem: ");
				data = ler.nextLine();
				try {
					SimpleDateFormat dataFormato = new SimpleDateFormat("dd/MM/yyyy");
					Calendar calendar = Calendar.getInstance();
					calendar.setTime(dataFormato.parse(data));
					NegocioCompra.buscarPassagem(calendar);
				}
				catch (Exception e) {
					System.out.println("N�o foi possivel buscar!\n");
				}
				break;
			}
			case 5:{
				break;
			}
		}
	}
	}