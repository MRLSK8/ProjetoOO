package interfaces;

import models.ModelAeroporto;

public interface InterfaceRepositorioAeroportos {
	
	public void inserir(ModelAeroporto aeroporto) throws Exception;
	
	public void excluir(String nomeAeroporto) throws Exception;
	
	public void excluir(int codigoAeroporto) throws Exception;
	
	public void atualizar(String nomeAeroporto, String novoNome) throws Exception;
	
	public void atualizar(int codigoAeroporto, String novoNome) throws Exception;
	
	public ModelAeroporto procurar(String nomeAeroporto) throws Exception;
	
	public ModelAeroporto procurar(int codigoAeroporto) throws Exception;

}
