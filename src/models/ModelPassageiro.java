package models;

public class ModelPassageiro extends ModelPessoa{
	private int Passaporte;
	     
    public ModelPassageiro(String CPF, String Nome, String DataNascimento, String Telefone, int Passaporte) {
        super(CPF, Nome, DataNascimento, Telefone);
        this.setPassaporte(Passaporte);
    }
   
    public ModelPassageiro(String CPF) {
    	super(CPF);
    } 
    
    public ModelPassageiro(int Passaporte) {
    	super();
    	this.setPassaporte(Passaporte);
    }

	public int getPassaporte() {
		return Passaporte;
	}

	public void setPassaporte(int passaporte) {
		Passaporte = passaporte;
	}
	
	public boolean equals(Object object) {
		boolean valor = false;
		ModelPassageiro pessoa = (ModelPassageiro)object;
		
		if(pessoa.getCPF().equals(this.getCPF()) || pessoa.getPassaporte() == this.getPassaporte()) {
			valor = true;
		}
	
		return valor;
	}
	
}
