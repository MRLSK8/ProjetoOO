package models;

import Interfaces.InterfacePessoa;

public abstract class Pessoa implements InterfacePessoa{
	private String CPF;
    private String Nome;
    private String DataNascimento;
    private String Telefone;
      
    public Pessoa(String CPF,String Nome, String DataNascimento, String Telefone){
        this.setCPF(CPF);
        this.setDataNascimento(DataNascimento);
        this.setNome(Nome);
        this.setTelefone(Telefone);
    }

	protected String getCPF() {
		return CPF;
	}

	protected void setCPF(String cPF) {
		CPF = cPF;
	}

	protected String getNome() {
		return Nome;
	}

	protected void setNome(String nome) {
		Nome = nome;
	}

	protected String getDataNascimento() {
		return DataNascimento;
	}

	protected void setDataNascimento(String dataNascimento) {
		DataNascimento = dataNascimento;
	}

	protected String getTelefone() {
		return Telefone;
	}

	protected void setTelefone(String telefone) {
		Telefone = telefone;
	}
    
}
