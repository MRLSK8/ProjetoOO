package models;

import interfaces.InterfaceAeroporto;

public class ModelAeroporto implements InterfaceAeroporto{
	private String codigoAeroporto;
	private String nomeAeroporto;
    private String cidade;
    private String estado;
    
	public ModelAeroporto(String codigoAeroporto, String cidade, String estado, String nomeAeroporto) {
		this.setCidade(cidade);
		this.setCodigo_aeroporto(nomeAeroporto);
		this.setEstado(estado);
		this.setNome_aeroporto(nomeAeroporto);
	}
	
	public String getCodigo_aeroporto() {
		return codigoAeroporto;
	}
	
	public void setCodigo_aeroporto(String codigo_aeroporto) {
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
    
}
