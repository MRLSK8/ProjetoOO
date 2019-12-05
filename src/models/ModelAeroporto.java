package models;

public class ModelAeroporto{
	private String codigoAeroporto;
	private String nomeAeroporto;
    private String cidade;
    private String estado;
    
    
	public ModelAeroporto(String nomeAeroporto) {
		this.setNome_aeroporto(nomeAeroporto);
	}
	
	public ModelAeroporto(String codigoAeroporto, String cidade, String estado, String nomeAeroporto) {
		this.setCidade(cidade);
		this.setCodigo_aeroporto(codigoAeroporto);
		this.setEstado(estado);
		this.setNome_aeroporto(nomeAeroporto);
	}
	
	//get
	public String getCodigo_aeroporto() {
		return codigoAeroporto;
	}
	
	public String getNome_aeroporto() {
		return nomeAeroporto;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public String getEstado() {
		return estado;
	}
	
	//set
	public void setCodigo_aeroporto(String codigo_aeroporto) {
		this.codigoAeroporto = codigo_aeroporto;
	}
	
	public void setNome_aeroporto(String nome_aeroporto) {
		this.nomeAeroporto = nome_aeroporto;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	//methods
	public boolean equals(Object object) {
		boolean valor = false;
		ModelAeroporto aeroporto = (ModelAeroporto)object;
		
		if(aeroporto.getNome_aeroporto() == this.nomeAeroporto) {
			valor = true;
		}
		
		return valor;
	}
    
}
