package models;

import Interfaces.InterfaceContratante;

public class Contratante extends Pessoa implements InterfaceContratante{
	private int idContratante;
		
    public Contratante(String CPF, String Nome, String DataNascimento, String Telefone, int idContratante) {
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
