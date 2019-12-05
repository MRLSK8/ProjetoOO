package models;

import java.util.ArrayList;
import java.util.Calendar;

public class ModelCompraDePassagem {
	private String idPassagem;
	private ArrayList<ModelPassageiro> passageiros;
	private ModelAeroporto aeroportoPartida;
    private ModelAeroporto aeroportoChegada;
    private int numeroDaPoltrona;
	private Calendar data;
	private double valor;
	
	public ModelCompraDePassagem(String idPassagem, int numeroDaPoltrona, ModelAeroporto aeroportoPartida, ModelAeroporto aeroportoChegada, ArrayList<ModelPassageiro> passageiros, double valor) {
		this.setIdPassagem(idPassagem);
		this.setAeroportoChegada(aeroportoChegada);
		this.setData(Calendar.getInstance()); 
		this.setNumeroDaPoltrona(numeroDaPoltrona);
		this.setValor(valor);
		this.setPassageiros(passageiros);
		this.setAeroportoPartida(aeroportoPartida);
	}
	
	public ModelCompraDePassagem(String idPassagem) {
		this.setIdPassagem(idPassagem);
	}
	
	public ModelCompraDePassagem() {
	
	}
	
	public ArrayList<ModelPassageiro> getPassageiros() {
		return this.passageiros;
	}
	
	public void setPassageiros(ArrayList<ModelPassageiro> passageiros) {
		this.passageiros = passageiros;
	}
	
	public ModelAeroporto getAeroportoPartida() {
		return this.aeroportoPartida;
	}
	
	public void setAeroportoPartida(ModelAeroporto aeroportoPartida) {
		this.aeroportoPartida = aeroportoPartida;
	}
	
	public ModelAeroporto getAeroportoChegada() {
		return this.aeroportoChegada;
	}
	
	public void setAeroportoChegada(ModelAeroporto aeroportoChegada) {
		this.aeroportoChegada = aeroportoChegada;
	}
	
	public Calendar getData() {
		return this.data;
	}
	
	public void setData(Calendar data) {
		this.data = data;
	}
	
	public double getValor() {
		return this.valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getNumeroDaPoltrona() {
		return numeroDaPoltrona;
	}

	public void setNumeroDaPoltrona(int numeroDaPoltrona) {
		this.numeroDaPoltrona = numeroDaPoltrona;
	}

	public String getIdPassagem() {
		return idPassagem;
	}

	public void setIdPassagem(String idPassagem) {
		this.idPassagem = idPassagem;
	}
	
}
