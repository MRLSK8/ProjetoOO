package main;

import controllers.NegocioAeroporto;
import models.ModelAeroporto;
import repositories.RepositorioAeroportos;

public class Main {

	public static void main(String[] args) {
		
		ModelAeroporto Aeroporto1 = new ModelAeroporto("REC", "Recife", "Pernambuco", "Guararape");
		
		NegocioAeroporto Negocio = new NegocioAeroporto(new RepositorioAeroportos());
		
		System.out.println(Negocio.inserirAerorporto(Aeroporto1));
	
		System.out.println(Negocio.atualizarAerorporto("Guararape", "Guararapes"));
		
		System.out.println(Negocio.deletarAerorporto("Guararapes"));
		
		System.out.println(Negocio.buscarAerorporto("Guararapes").getNome_aeroporto());
	}
}
