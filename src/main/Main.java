package main;

import controllers.NegocioAeroporto;
import controllers.NegocioPassageiro;
import models.ModelAeroporto;
import models.ModelPassageiro;
import repositories.RepositorioAeroportos;
import repositories.RepositorioPassageiros;

public class Main {

	public static void main(String[] args) {
		
		ModelAeroporto Aeroporto1 = new ModelAeroporto("REC", "Recife", "Pernambuco", "Guararape");
		ModelAeroporto Aeroporto2 = new ModelAeroporto("TEC", "Bonito", "São Paulo", "Guarulhos");
		ModelAeroporto Aeroporto3 = new ModelAeroporto("JOP", "Bezerros", "Bahia", "KKKK");
		
		NegocioAeroporto NegocioAero = new NegocioAeroporto(new RepositorioAeroportos());
		
		try {
			NegocioAero.inserirAerorporto(Aeroporto1);
			NegocioAero.inserirAerorporto(Aeroporto2);
			NegocioAero.inserirAerorporto(Aeroporto3);
			System.out.println("Inserido com sucessor!");
		}catch(Exception e) {
			System.out.println("Erro ao inserir!");
		}
		
		try {
			NegocioAero.atualizarAerorporto("Guararape", "Guararapes");
			System.out.println("Atualizado com sucessor!");
		}catch(Exception e) {
			System.out.println("Erro ao atualizar!");
		}
		
		try {
			NegocioAero.deletarAerorporto("Guararapes");
			System.out.println("Excluido com sucessor!");
		}catch(Exception e) {
			System.out.println("Erro ao Excluir!");
		}
		
		try {
			System.out.print("Nome do aeroporto buscado: ");
			System.out.println(NegocioAero.buscarAerorporto("Guararapes").getNome_aeroporto());
			
		}catch(Exception e) {
			System.out.println("Erro ao buscar!");
		}
		
		// ------------------------------------------------------------------------------------------------------------
		
		ModelPassageiro Passageiro1 = new ModelPassageiro("124.154.156-01", "Marcelo", "10-05-2000", "995845654", 1565);
		ModelPassageiro Passageiro2 = new ModelPassageiro("924.043.176-45", "Luiz", "10-05-2000", "8159445654", 1855);
		
		NegocioPassageiro NegocioPassag= new NegocioPassageiro(new RepositorioPassageiros());
	
		try {
			NegocioPassag.inserirPassageiro(Passageiro1);
			NegocioPassag.inserirPassageiro(Passageiro2);
			System.out.println("Inserido com sucessor!");
		}catch(Exception e) {
			System.out.println("Erro ao inserir!");
		}
	}
}
