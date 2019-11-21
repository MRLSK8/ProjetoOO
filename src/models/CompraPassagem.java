package models;

import Interfaces.InterfaceCompraPassagem;
import java.util.ArrayList;

public class CompraPassagem implements InterfaceCompraPassagem{
	private ArrayList<Passageiro> passageiros;
	private Contratante contratante;
	private String dataDaCompra;
	private Passagem passagem;
	private Vendedor vendedor;
    
	public CompraPassagem(Vendedor vendedor, Contratante contratante, ArrayList<Passageiro> passageiros, Passagem passagem, String dataDaCompra) {
		this.setVendedor(vendedor);
		this.setDataDaCompra(dataDaCompra);
		this.setPassageiros(passageiros);
		this.setPassagem(passagem);
		this.setContratante(contratante);
	}

	public Vendedor getVendedor() {
		return vendedor;
	}
	
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	
	public Contratante getContratante() {
		return contratante;
	}
	
	public void setContratante(Contratante contratante) {
		this.contratante = contratante;
	}
	
	public ArrayList<Passageiro> getPassageiros() {
		return passageiros;
	}
	
	public void setPassageiros(ArrayList<Passageiro> passageiros) {
		this.passageiros = passageiros;
	}
	
	public Passagem getPassagem() {
		return passagem;
	}
	
	public void setPassagem(Passagem passagem) {
		this.passagem = passagem;
	}
	
	public String getDataDaCompra() {
		return dataDaCompra;
	}
	
	public void setDataDaCompra(String dataDaCompra) {
		this.dataDaCompra = dataDaCompra;
	}
    
}
