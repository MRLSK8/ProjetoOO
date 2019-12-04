package interfaces;

import models.ModelAeroporto;

public interface InterfaceRepositorioAeroportos {
	
	public void inserir(ModelAeroporto aeroporto);
	
	public void excluir(ModelAeroporto aeroporto);
	
	public void atualizar(String nomeAeroporto, String novoNome);
	
	public ModelAeroporto procurar(String nomeAeroporto);
	
}
