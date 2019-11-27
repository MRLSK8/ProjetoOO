package models;

import java.util.ArrayList;

import interfaces.InterfaceCompraPassagem;

public class ModelCompraPassagem implements InterfaceCompraPassagem{
	private ArrayList<ModelPassageiro> passageiros;
	private ModelContratante contratante;
	private String dataDaCompra;
	private ModelPassagem passagem;
	private ModelVendedor vendedor;
    
	public ModelCompraPassagem(ModelVendedor vendedor, ModelContratante contratante, ArrayList<ModelPassageiro> passageiros, ModelPassagem passagem, String dataDaCompra) {
		this.setVendedor(vendedor);
		this.setDataDaCompra(dataDaCompra);
		this.setPassageiros(passageiros);
		this.setPassagem(passagem);
		this.setContratante(contratante);
	}

	public ModelVendedor getVendedor() {
		return vendedor;
	}
	
	public void setVendedor(ModelVendedor vendedor) {
		this.vendedor = vendedor;
	}
	
	public ModelContratante getContratante() {
		return contratante;
	}
	
	public void setContratante(ModelContratante contratante) {
		this.contratante = contratante;
	}
	
	public ArrayList<ModelPassageiro> getPassageiros() {
		return passageiros;
	}
	
	public void setPassageiros(ArrayList<ModelPassageiro> passageiros) {
		this.passageiros = passageiros;
	}
	
	public ModelPassagem getPassagem() {
		return passagem;
	}
	
	public void setPassagem(ModelPassagem passagem) {
		this.passagem = passagem;
	}
	
	public String getDataDaCompra() {
		return dataDaCompra;
	}
	
	public void setDataDaCompra(String dataDaCompra) {
		this.dataDaCompra = dataDaCompra;
	}
    
}
