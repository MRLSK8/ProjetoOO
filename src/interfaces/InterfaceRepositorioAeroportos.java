package interfaces;

import models.ModelAeroporto;

public interface InterfaceRepositorioAeroportos {
	
	public String inserir(ModelAeroporto aeroporto);
	
	public String excluir(String nomeAeroporto);
	
	public String atualizar(String nomeAeroporto, String novoNome);
	
	public ModelAeroporto procurar(String nomeAeroporto);
	
}
