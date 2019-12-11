package models;

import java.util.Calendar;

public class ModelCompraDePassagem {
	private String idPassagem;
	private ModelPassageiro passageiro;
	private ModelAeroporto aeroportoPartida;
    private ModelAeroporto aeroportoChegada;
    private int numeroDaPoltrona;
	private Calendar data;
	private float valor;
	
	public ModelCompraDePassagem(String idPassagem, int numeroDaPoltrona, ModelAeroporto aeroportoPartida, ModelAeroporto aeroportoChegada, ModelPassageiro passageiro, float valor){
	
		this.setIdPassagem(idPassagem);
		this.setAeroportoChegada(aeroportoChegada);
		this.setNumeroDaPoltrona(numeroDaPoltrona);
		this.setValor(valor);
		this.setPassageiro(passageiro);
		this.setAeroportoPartida(aeroportoPartida);
		this.setData(Calendar.getInstance()); 
		
	}
	
	public ModelCompraDePassagem(String idPassagem) {
		this.setIdPassagem(idPassagem.toUpperCase());
	}
	
	public ModelCompraDePassagem() {
	
	}
	
	public ModelCompraDePassagem(Calendar calendario) {
		this.setData(calendario);
	}
	
	public ModelCompraDePassagem(int Passaporte) {
		this.getPassageiros().setPassaporte(Passaporte);
	}
	
	public ModelCompraDePassagem(ModelPassageiro passageiro) {
		
		this.setPassageiro(passageiro);
	}
	
	public ModelPassageiro getPassageiros() {
		return this.passageiro;
	}
	
	public void setPassageiro(ModelPassageiro passageiro) {
		this.passageiro = passageiro;
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
	
	public void setData(Calendar calendario) {
		this.data = calendario;
	}
	
	public Calendar getData() {
		return this.data;
	}
	
	public double getValor() {
		return this.valor;
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

	public String getIdPassagem() {
		return idPassagem;
	}

	public void setIdPassagem(String idPassagem) {
		this.idPassagem = idPassagem.toUpperCase();
	}
	
	public boolean comparaDatas(Calendar data1, Calendar data2) {
		
		// 5 � dia, 2 � m�s, 1 � ano
		
		if(data1.get(5) == data2.get(5) && data1.get(2) == data2.get(2) && data1.get(1) == data2.get(1)) {
			return true;
		}else {
			return false;
		}
	}

	public boolean equals(Object object) {
		boolean valor = false;
		ModelCompraDePassagem passagem = (ModelCompraDePassagem)object;
		
		if(passagem.idPassagem == this.idPassagem || passagem.passageiro == this.passageiro 
		  || passagem.passageiro.getPassaporte() == this.passageiro.getPassaporte() || this.comparaDatas(passagem.getData(), this.getData())) {
			valor = true;
		}
	
		return valor;
	}
	
}
