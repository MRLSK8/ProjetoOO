package models;

public class ModelPassagem{
    private ModelAeroporto aeroportoPartida;
    private ModelAeroporto aeroportoChegada;
    private int numeroDaPoltrona;
    private float valor;
    
	public ModelPassagem(ModelAeroporto aeroportoPartida, ModelAeroporto aeroportoChegada, int numeroDaPoltrona, float valor) {
		this.setAeroportoChegada(aeroportoChegada);
		this.setAeroportoPartida(aeroportoPartida);
		this.setNumeroDaPoltrona(numeroDaPoltrona);
		this.setValor(valor);
	}
	
	//get
	public ModelAeroporto getAeroportoPartida() {
		return aeroportoPartida;
	}
	
	public ModelAeroporto getAeroportoChegada() {
		return aeroportoChegada;
	}
	
	public int getNumeroDaPoltrona() {
		return numeroDaPoltrona;
	}
	
	public float getValor() {
		return valor;
	}
	
	//set
	public void setAeroportoPartida(ModelAeroporto aeroportoPartida) {
		this.aeroportoPartida = aeroportoPartida;
	}
	
	public void setAeroportoChegada(ModelAeroporto aeroportoChegada) {
		this.aeroportoChegada = aeroportoChegada;
	}
	
	public void setNumeroDaPoltrona(int numeroDaPoltrona) {
		this.numeroDaPoltrona = numeroDaPoltrona;
	}
	
	public void setValor(float valor) {
		this.valor = valor;
	}
    
	//methods
	
}
