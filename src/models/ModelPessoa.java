package models;

public abstract class ModelPessoa{
	private String CPF;
    private String Nome;
    private String DataNascimento;
    private String Telefone;
    
    public ModelPessoa() {
    	
    }
    
    public ModelPessoa(String nome) {
    	this.setNome(nome);
    }
    
    public ModelPessoa(String CPF,String Nome, String DataNascimento, String Telefone){
        this.setCPF(CPF);
        this.setDataNascimento(DataNascimento);
        this.setNome(Nome);
        this.setTelefone(Telefone);
    }
    
    //get
	public String getCPF() {
		return CPF;
	}
	
	public String getNome() {
		return Nome;
	}
	
	public String getDataNascimento() {
		return DataNascimento;
	}
	
	public String getTelefone() {
		return Telefone;
	}
	
	//set
	public void setCPF(String CPF) {
		this.CPF = CPF;
	}

	public void setNome(String nome) {
		this.Nome = nome;
	}

	public void setDataNascimento(String dataNascimento) {
		this.DataNascimento = dataNascimento;
	}

	public void setTelefone(String telefone) {
		this.Telefone = telefone;
	}
    
	//methods
}
