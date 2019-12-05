package models;

import java.util.ArrayList;

public class ModelCompraPassagem{
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
	
	//get
	public ArrayList<ModelPassageiro> getPassageiros() {
		return passageiros;
	}
	
	public ModelContratante getContratante() {
		return contratante;
	}
	
	public String getDataDaCompra() {
		return dataDaCompra;
	}
	
	public ModelPassagem getPassagem() {
		return passagem;
	}
	
	public ModelVendedor getVendedor() {
		return vendedor;
	}
	
	//set
	public void setPassageiros(ArrayList<ModelPassageiro> passageiros) {
		this.passageiros = passageiros;
	}
	
	public void setContratante(ModelContratante contratante) {
		this.contratante = contratante;
	}
	
	public void setDataDaCompra(String dataDaCompra) {
		this.dataDaCompra = dataDaCompra;
	}
	
	public void setPassagem(ModelPassagem passagem) {
		this.passagem = passagem;
	}
	
	public void setVendedor(ModelVendedor vendedor) {
		this.vendedor = vendedor;
	}
	
	//methods
    
}
