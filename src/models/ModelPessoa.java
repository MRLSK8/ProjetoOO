package models;

public abstract class ModelPessoa{
	private String CPF;
    private String Nome;
    private String DataNascimento;
    private String Telefone;
      
    public ModelPessoa(String CPF,String Nome, String DataNascimento, String Telefone){
        this.setCPF(CPF);
        this.setDataNascimento(DataNascimento);
        this.setNome(Nome);
        this.setTelefone(Telefone);
    }
    
	public  ModelPessoa() {
		   
	}
	
    public ModelPessoa(String CPF) {
    	this.setCPF(CPF);
    }
 
	public String getCPF() {
		return CPF;
	}

	public void setCPF(String CPF) {
		this.CPF = CPF;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		this.Nome = nome.toUpperCase();
	}

	public String getDataNascimento() {
		return DataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.DataNascimento = dataNascimento;
	}

	public String getTelefone() {
		return Telefone;
	}

	public void setTelefone(String telefone) {
		this.Telefone = telefone;
	}
    
}
