package interfaces;

import models.ModelAeroporto;

public interface InterfaceRepositorioAeroportos {
	
	public void inserir(ModelAeroporto aeroporto) throws Exception;
	
	public void excluir(String nomeAeroporto) throws Exception;
	
	public void atualizar(String nomeAeroporto, String novoNome) throws Exception;
	
	public ModelAeroporto procurar(String nomeAeroporto) throws Exception;
	
}
