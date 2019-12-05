package interfaces;

import models.ModelCompraDePassagem;

public interface InterfaceRepositorioCompraDePassagem {
	public void inserir(ModelCompraDePassagem passagen) throws Exception;
	public void excluir(String idPassagem) throws Exception;
	public void atualizar(String idPassagem, double novoValor) throws Exception;
	public ModelCompraDePassagem procurar(String idPassagem) throws Exception;
}
