package models;

import interfaces.InterfacePassageiro;

public class ModelPassageiro extends ModelPessoa implements InterfacePassageiro{
	private int Passaporte;
	     
    public ModelPassageiro(String CPF, String Nome, String DataNascimento, String Telefone, int Passaporte) {
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
