package models;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.text.ParseException;

public class ModelCompraDePassagem {
	private String idPassagem;
	private ModelPassageiro passageiro;
	private ModelAeroporto aeroportoPartida;
    private ModelAeroporto aeroportoChegada;
    private int numeroDaPoltrona;
	private Calendar data;
	private double valor;
	
	public ModelCompraDePassagem(String idPassagem, String data ,int numeroDaPoltrona, ModelAeroporto aeroportoPartida, ModelAeroporto aeroportoChegada, ModelPassageiro passageiro, double valor) throws Exception {
		try {
			this.setIdPassagem(idPassagem);
			this.setAeroportoChegada(aeroportoChegada);
			this.setData(data); 
			this.setNumeroDaPoltrona(numeroDaPoltrona);
			this.setValor(valor);
			this.setPassageiro(passageiro);
			this.setAeroportoPartida(aeroportoPartida);
		}
		catch(Exception e) {
			throw new Exception();
		}
	}
	
	public ModelCompraDePassagem(String idPassagem) {
		this.setIdPassagem(idPassagem);
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
	
	public void setData(String data) throws Exception {
		
		try {
			SimpleDateFormat dataFormato = new SimpleDateFormat("dd/MM/yyyy");
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(dataFormato.parse(data));
			
			this.data = calendar;
		}
		catch (ParseException e) {
			throw new Exception();
		}
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
	
	public boolean comparaDatas(Calendar data1, Calendar data2) {
		
		// 5 é dia, 2 é mês, 1 é ano
		
		if(data1.get(5) == data2.get(5) || data1.get(2) == data2.get(2) || data1.get(1) == data2.get(1)) {
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
