package interfaces;

import models.ModelCompraDePassagem;
import models.ModelPassageiro;
import java.util.Calendar;

public interface InterfaceRepositorioCompraDePassagem {
	
	public void inserir(ModelCompraDePassagem passagen) throws Exception;
	
	public void excluir(String idPassagem) throws Exception;
	
	public void atualizar(String idPassagem, float novoValor) throws Exception;
	
	public ModelCompraDePassagem procurar(String idPassagem) throws Exception;
	
	public ModelCompraDePassagem procurar(ModelPassageiro passageiro) throws Exception;
	
	public ModelCompraDePassagem procurar(int Passaporte) throws Exception;
	
	public ModelCompraDePassagem procurar(Calendar Data) throws Exception;
}
