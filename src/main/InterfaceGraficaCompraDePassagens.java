package main;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import models.ModelAeroporto;
import models.ModelCompraDePassagem;
import models.ModelPassageiro;


public class InterfaceGraficaCompraDePassagens {
	static public void InterfaceGraficaCompraDePassagem() {
		
		System.out.println("\n\n =*=*=*=*= Compra de passagens =*=*=*=*= ");
		
		ModelAeroporto Aeroporto1 = new ModelAeroporto(1, "Recife", "Pernambuco", "RE");
		ModelAeroporto Aeroporto2 = new ModelAeroporto(2, "Bonito", "São Paulo", "GRO");
		ModelPassageiro Passageiro1 = new ModelPassageiro("124.154.156-01", "Marcelo", "10-05-2000", "995845654", 1565);
		
		ModelCompraDePassagem p = new ModelCompraDePassagem("FKF", 10, Aeroporto1, Aeroporto2, Passageiro1, 275.80f);
		
		Calendar data = p.getData();
	
		SimpleDateFormat FormatadoDeData = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat FormatadoDeHora = new SimpleDateFormat("HH:mm:ss");
		
		String horaFormatada = FormatadoDeHora.format(data.getTime());
		String dataFormatada = FormatadoDeData.format(data.getTime());
		
		System.out.print(dataFormatada + " " + horaFormatada);
		
		System.out.println("\n\n");
	}
}
