package models;

public class ModelPassageiro extends ModelPessoa{
	private int Passaporte;
	
	public ModelPassageiro(String nome) {
		this.setNome(nome);
	}
	
    public ModelPassageiro(String CPF, String Nome, String DataNascimento, String Telefone, int Passaporte) {
        super(CPF, Nome, DataNascimento, Telefone);
        this.setPassaporte(Passaporte);
    }
    
    //get
	public int getPassaporte() {
		return Passaporte;
	}
	
	//set
	public void setPassaporte(int passaporte) {
		Passaporte = passaporte;
	}
	
	//methods
	
}
