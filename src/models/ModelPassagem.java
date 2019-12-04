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

	public float getValor() {
		return valor;
	}
	
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public int getNumeroDaPoltrona() {
		return numeroDaPoltrona;
	}
	
	public void setNumeroDaPoltrona(int numeroDaPoltrona) {
		this.numeroDaPoltrona = numeroDaPoltrona;
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
    
}
