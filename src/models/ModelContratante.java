package models;

import interfaces.InterfaceContratante;

public class ModelContratante extends ModelPessoa implements InterfaceContratante{
	private int idContratante;
		
    public ModelContratante(String CPF, String Nome, String DataNascimento, String Telefone, int idContratante) {
        super(CPF, Nome, DataNascimento, Telefone);
        this.setIdContratante(idContratante);
    }

	public int getIdContratante() {
		return idContratante;
	}

	public void setIdContratante(int idContratante) {
		this.idContratante = idContratante;
	}

}
