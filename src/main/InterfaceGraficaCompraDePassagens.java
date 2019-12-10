package main;

import java.util.Scanner;
import models.ModelAeroporto;
import models.ModelCompraDePassagem;
import models.ModelPassageiro;
import controllers.NegocioAeroporto;
import controllers.NegocioCompraDePassagem;
import controllers.NegocioPassageiro;;

public class InterfaceGraficaCompraDePassagens {
	private static Scanner ler;

	static public void InterfaceGraficaCompraDePassagem(NegocioCompraDePassagem NegocioCompra, NegocioAeroporto NegocioAero, NegocioPassageiro NegocioPassag) {
		 
		ModelAeroporto aeroportoOrigem = null, aeroportoDestino = null;
		String codigo, nomeOrigem, nomeDestino, cpf;
		ModelCompraDePassagem novaPassagem = null;
		ModelPassageiro passageiro = null; 
		ler = new Scanner(System.in);
		int poltrona;
		float  valor;
		boolean valido = true;
		
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
			System.out.println("\nAeroporto origem e/ou destino não encontrado! ");
			valido = false;
		}
		
		try {
			passageiro = NegocioPassag.buscarPassageiro(cpf);
		}catch(Exception e) {
			System.out.println("\nPassageiro não encontrado! ");
			valido = false;
		}
		
		if(valido) {
			novaPassagem = new ModelCompraDePassagem(codigo, poltrona, aeroportoOrigem, aeroportoDestino, passageiro, valor);
			try {
				NegocioCompra.inserirPassagem(novaPassagem);
				System.out.println("\n Compra realizada com sucesso!");
			}catch(Exception e) {
				System.out.println("\nNão foi possivel realizar a compra...");
			}
		}
		
		
 
		
		
		
		
		
		
		
		
		
		
		/*// month 2   year 1    day 5 
		Calendar c = Calendar.getInstance();

		c.set(Calendar.DAY_OF_MONTH, 30);
		c.set(Calendar.MONTH, 2);
		c.set(Calendar.YEAR, 2011);
		
		System.out.println(c.get(5));
		System.out.println(c.get(2));
		System.out.println(c.get(1));	
		/////////////////*/
		
		//Transforma de String Para Calendar
		/*
			String data = "16/07/2008";
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Calendar cal = Calendar.getInstance();
			cal.setTime(sdf.parse(data));
			System.out.println(cal.getTime());
		*/
		
	}
}
