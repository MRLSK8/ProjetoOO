package main;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import controllers.NegocioAeroporto;
import controllers.NegocioPassageiro;
import models.ModelAeroporto;
import models.ModelCompraDePassagem;
import models.ModelPassageiro;
import repositories.RepositorioAeroportos;
import repositories.RepositorioPassageiros;

public class Main {

	public static void main(String[] args) {
		
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
			System.out.println(NegocioAero.buscarAerorporto(1).getNome_aeroporto());
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
			System.out.println("Inserido com sucesso!");
		}catch(Exception e) {
			System.out.println("Erro ao inserir!");
		}
		
		// -------------------------------------------------------------------------------------------------------------
		
		ModelCompraDePassagem p = new ModelCompraDePassagem("FKF", 10, Aeroporto1, Aeroporto2, (new ArrayList<ModelPassageiro>(Arrays.asList(Passageiro1,Passageiro2))), 275.80f);
	
		Calendar data = p.getData();
	
		SimpleDateFormat FormatadoDeData = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat FormatadoDeHora = new SimpleDateFormat("HH:mm:ss");
		
		String horaFormatada = FormatadoDeHora.format(data.getTime());
		String dataFormatada = FormatadoDeData.format(data.getTime());
		
		System.out.print(dataFormatada + " " + horaFormatada);
		
			
	}
}
