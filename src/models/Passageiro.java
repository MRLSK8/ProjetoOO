package models;

import Interfaces.InterfacePassageiro;

public class Passageiro extends Pessoa implements InterfacePassageiro{
	private int Passaporte;
	     
    public Passageiro(String CPF, String Nome, String DataNascimento, String Telefone, int Passaporte) {
        super(CPF, Nome, DataNascimento, Telefone);
        this.setPassaporte(Passaporte);
    }

	public int getPassaporte() {
		return Passaporte;
	}

	public void setPassaporte(int passaporte) {
		Passaporte = passaporte;
	}
}
