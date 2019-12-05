package models;

public class ModelVoo{
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
	
	//get
	public ModelAeroporto getAeroportoPartida() {
		return aeroportoPartida;
	}
	
	public ModelAeroporto getAeroportoChegada() {
		return aeroportoChegada;
	}
	
	public String getDataDoVoo() {
		return dataDoVoo;
	}
	
	public String getHoraDoVoo() {
		return horaDoVoo;
	}
	
	//set
	public void setAeroportoPartida(ModelAeroporto aeroportoPartida) {
		this.aeroportoPartida = aeroportoPartida;
	}
	
	public void setAeroportoChegada(ModelAeroporto aeroportoChegada) {
		this.aeroportoChegada = aeroportoChegada;
	}
	
	public void setDataDoVoo(String dataDoVoo) {
		this.dataDoVoo = dataDoVoo;
	}
	
	public void setHoraDoVoo(String horaDoVoo) {
		this.horaDoVoo = horaDoVoo;
	}
    
	//methods
	
}
