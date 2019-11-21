package models;

import Interfaces.InterfacePassagem;

public class Passagem implements InterfacePassagem{
    private Aeroporto aeroportoPartida;
    private Aeroporto aeroportoChegada;
    private int numeroDaPoltrona;
    private float valor;
    
	public Passagem(Aeroporto aeroportoPartida, Aeroporto aeroportoChegada, int numeroDaPoltrona, float valor) {
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
    
}
