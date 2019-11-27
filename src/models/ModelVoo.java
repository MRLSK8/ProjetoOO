package models;

import interfaces.InterfaceVoo;

public class ModelVoo implements InterfaceVoo{
	private ModelAeroporto aeroportoPartida;
    private ModelAeroporto aeroportoChegada;
    private String dataDoVoo;
    private String horaDoVoo;
    
	public ModelVoo(ModelAeroporto aeroportoPartida, ModelAeroporto aeroportoChegada, String dataDoVoo, String horaDoVoo) {
		this.setAeroportoChegada(aeroportoChegada);
		this.setAeroportoPartida(aeroportoPartida);
		this.setDataDoVoo(dataDoVoo);
		this.setHoraDoVoo(horaDoVoo);
	}

	public ModelAeroporto getAeroportoPartida() {
		return aeroportoPartida;
	}
	
	public void setAeroportoPartida(ModelAeroporto aeroportoPartida) {
		this.aeroportoPartida = aeroportoPartida;
	}
	
	public ModelAeroporto getAeroportoChegada() {
		return aeroportoChegada;
	}
	
	public void setAeroportoChegada(ModelAeroporto aeroportoChegada) {
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
