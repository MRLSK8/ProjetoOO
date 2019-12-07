package main;

import controllers.NegocioAeroporto;
import models.ModelAeroporto;
import repositories.RepositorioAeroportos;

public class InterfaceGraficaAeroportos {
	static public void InterfaceGraficaAeroporto() {
		
		System.out.println("\n\n =*=*=*=*= Cadastro de aeroportos =*=*=*=*= ");
		
		ModelAeroporto Aeroporto1 = new ModelAeroporto(1, "Recife", "Pernambuco", "RE");
		ModelAeroporto Aeroporto2 = new ModelAeroporto(2, "Bonito", "São Paulo", "GRO");
		ModelAeroporto Aeroporto3 = new ModelAeroporto(3, "Bezerros", "Bahia", "KKK");
		
		NegocioAeroporto NegocioAero = new NegocioAeroporto(new RepositorioAeroportos());
		
		try {
			NegocioAero.inserirAerorporto(Aeroporto1);
			NegocioAero.inserirAerorporto(Aeroporto2);
			NegocioAero.inserirAerorporto(Aeroporto3);
			System.out.println("Inserido com sucesso!");
		}catch(Exception e) {
			System.out.println("Erro ao inserir!");
		}
		
		try {
			NegocioAero.atualizarAerorporto("RE", "REC");
			System.out.println("Atualizado com sucesso!");
		}catch(Exception e) {
			System.out.println("Erro ao atualizar!");
		}
		
		try {
			NegocioAero.deletarAerorporto("REC");
			System.out.println("Excluido com sucesso!");
		}catch(Exception e) {
			System.out.println("Erro ao Excluir!");
		}
		
		try {
			System.out.print("Nome do aeroporto buscado: ");
			System.out.println(NegocioAero.buscarAerorporto("REC").getNome_aeroporto());
		}catch(Exception e) {
			System.out.println("Erro ao buscar!");
		}
		
		
		System.out.println("\n\n");
	
	}
}
