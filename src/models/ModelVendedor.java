package models;

public class ModelVendedor extends ModelPessoa{
	private int NumeroCracha;
	
	public ModelVendedor(String CPF,String Nome, String DataNascimento, String Telefone, int NumeroCracha) {
		super(CPF, Nome, DataNascimento, Telefone);
		this.setNumeroCracha(NumeroCracha);
	}
	
	//get
	public int getNumeroCracha() {
		return NumeroCracha;
	}
	
	//set
	public void setNumeroCracha(int numeroCracha) {
		NumeroCracha = numeroCracha;
	}
	
	//methods
	
}
