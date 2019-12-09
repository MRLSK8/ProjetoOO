package models;

public class ModelAeroporto{
	private int codigoAeroporto;
	private String nomeAeroporto;
    private String cidade;
    private String estado;
    
	public ModelAeroporto(int codigoAeroporto, String cidade, String estado, String nomeAeroporto) {
		this.setCidade(cidade);
		this.setCodigo_aeroporto(codigoAeroporto);
		this.setEstado(estado);
		this.setNome_aeroporto(nomeAeroporto);
	}
	
	public ModelAeroporto(String nomeAeroporto) {
		this.setNome_aeroporto(nomeAeroporto);
	}
	
	public ModelAeroporto(int codigoAeroporto) {
		this.setCodigo_aeroporto(codigoAeroporto);
	}
	
	public int getCodigo_aeroporto() {
		return codigoAeroporto;
	}
	
	public void setCodigo_aeroporto(int codigo_aeroporto) {
		this.codigoAeroporto = codigo_aeroporto;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public String getNome_aeroporto() {
		return nomeAeroporto;
	}
	
	public void setNome_aeroporto(String nome_aeroporto) {
		this.nomeAeroporto = nome_aeroporto;
	}
	
	public boolean equals(Object object) {
		boolean valor = false;
		ModelAeroporto aeroporto = (ModelAeroporto)object;
		
		if(aeroporto.getNome_aeroporto().equals(this.getNome_aeroporto()) || aeroporto.getCodigo_aeroporto() == this.getCodigo_aeroporto()) {
			valor = true;
		}
	
		return valor;
	}
    
}
