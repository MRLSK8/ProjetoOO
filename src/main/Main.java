package main;

import controllers.NegocioAeroporto;
import models.ModelAeroporto;
import repositories.RepositorioAeroportos;

public class Main {

	public static void main(String[] args) {
		
		ModelAeroporto Aeroporto1 = new ModelAeroporto("REC", "Recife", "Pernambuco", "Guararapes");
		
		NegocioAeroporto Negocio = new NegocioAeroporto(new RepositorioAeroportos());
		
		Negocio.inserirAerorporto(Aeroporto1);
		Negocio.buscarAerorporto("Guararapes");
		Negocio.atualizarAerorporto("Guararapes", "Sei lá");
		Negocio.buscarAerorporto("Sei lá");
	}
}
