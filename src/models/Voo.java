package models;

import Interfaces.InterfaceVoo;

public class Voo implements InterfaceVoo{
	private Aeroporto aeroportoPartida;
    private Aeroporto aeroportoChegada;
    private String dataDoVoo;
    private String horaDoVoo;
    
	public Voo(Aeroporto aeroportoPartida, Aeroporto aeroportoChegada, String dataDoVoo, String horaDoVoo) {
		this.setAeroportoChegada(aeroportoChegada);
		this.setAeroportoPartida(aeroportoPartida);
		this.setDataDoVoo(dataDoVoo);
		this.setHoraDoVoo(horaDoVoo);
	}

	public Aeroporto getAeroportoPartida() {
		return aeroportoPartida;
	}
	
	public void setAeroportoPartida(Aeroporto aeroportoPartida) {
		this.aeroportoPartida = aeroportoPartida;
	}
	
	public Aeroporto getAeroportoChegada() {
		return aeroportoChegada;
	}
	
	public void setAeroportoChegada(Aeroporto aeroportoChegada) {
		this.aeroportoChegada = aeroportoChegada;
	}
	
	public String getDataDoVoo() {
		return dataDoVoo;
	}
	
	public void setDataDoVoo(String dataDoVoo) {
		this.dataDoVoo = dataDoVoo;
	}
	
	public String getHoraDoVoo() {
		return horaDoVoo;
	}
	
	public void setHoraDoVoo(String horaDoVoo) {
		this.horaDoVoo = horaDoVoo;
	}
    
}
