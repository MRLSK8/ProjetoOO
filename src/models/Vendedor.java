package models;

import Interfaces.InterfaceVendedor;

public class Vendedor extends Pessoa implements InterfaceVendedor{
	private int NumeroCracha;
	
	public Vendedor(String CPF,String Nome, String DataNascimento, String Telefone, int NumeroCracha) {
		super(CPF, Nome, DataNascimento, Telefone);
		this.setNumeroCracha(NumeroCracha);
	}

	public int getNumeroCracha() {
		return NumeroCracha;
	}

	public void setNumeroCracha(int numeroCracha) {
		NumeroCracha = numeroCracha;
	}
}
