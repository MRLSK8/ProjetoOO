package models;

public class ModelPassageiro extends ModelPessoa{
	private int Passaporte;
	     
    public ModelPassageiro(String CPF, String Nome, String DataNascimento, String Telefone, int Passaporte) {
        super(CPF, Nome, DataNascimento, Telefone);
        this.setPassaporte(Passaporte);
    }
    
    public ModelPassageiro(String nome) {
    	this.setNome(nome);
    }

	public int getPassaporte() {
		return Passaporte;
	}

	public void setPassaporte(int passaporte) {
		Passaporte = passaporte;
	}
}
