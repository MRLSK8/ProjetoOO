package main;

import controllers.NegocioPassageiro;
import models.ModelPassageiro;
import repositories.RepositorioPassageiros;

public class InterfaceGraficaPassageiros {
	static public void InterfaceGraficaPassageiro() {
		
		System.out.println("\n\n =*=*=*=*= Cadastro de passageiros =*=*=*=*= ");
		
		ModelPassageiro Passageiro1 = new ModelPassageiro("124.154.156-01", "Marcelo", "10-05-2000", "995845654", 1565);
		ModelPassageiro Passageiro2 = new ModelPassageiro("924.043.176-45", "Luiz", "10-05-2000", "8159445654", 1855);
		
		NegocioPassageiro NegocioPassag= new NegocioPassageiro(new RepositorioPassageiros());

		try {
			NegocioPassag.inserirPassageiro(Passageiro1);
			NegocioPassag.inserirPassageiro(Passageiro2);
			System.out.println("Inserido com sucesso!");
		}catch(Exception e) {
			System.out.println("Erro ao inserir!");
		}
		
		System.out.println("\n\n");
	}
}
