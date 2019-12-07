package repositories;

import java.util.ArrayList;

import interfaces.InterfaceRepositorioCompraDePassagem;
import models.ModelCompraDePassagem;
import models.ModelPassageiro;

public class RepositorioCompraPassagem implements InterfaceRepositorioCompraDePassagem{
	ArrayList<ModelCompraDePassagem> passagens = new ArrayList<ModelCompraDePassagem>();
	
	public void inserir(ModelCompraDePassagem passagen) throws Exception{
		this.passagens.add(passagen);
	}
	
	public void excluir(String idPassagem) throws Exception{
		ModelCompraDePassagem passagemAuxiliar = procurar(idPassagem);
		
		if(passagemAuxiliar != null) {
			this.passagens.remove(passagemAuxiliar);
		}else {
			throw new Exception();
		}		
	}
	
	public void atualizar(String idPassagem, double novoValor) throws Exception{
		int index = 0;
		
		ModelCompraDePassagem passagemAuxiliar = procurar(idPassagem);
		
		if(passagemAuxiliar != null) {
			passagemAuxiliar.setValor(novoValor);
		    
			index = passagens.indexOf(passagemAuxiliar);
			passagens.add(index, passagemAuxiliar);
		}else {
			throw new Exception();
		}
		
	}

	public ModelCompraDePassagem procurar(String idPassagem) throws Exception{
		ModelCompraDePassagem passagemAuxiliar = new ModelCompraDePassagem(idPassagem);
		int index = passagens.indexOf(passagemAuxiliar);
		
		if(index != -1) {
			return passagens.get(index);
		}else {
			throw new Exception();
		}
	}
	
	public ModelCompraDePassagem procurar(ModelPassageiro passageiro) throws Exception{
		ModelCompraDePassagem passagemAuxiliar = new ModelCompraDePassagem(passageiro);
		int index = passagens.indexOf(passagemAuxiliar);
		
		if(index != -1) {
			return passagens.get(index);	
		}else {
			throw new Exception();
		}
	}
	
	public ModelCompraDePassagem procurar(int Passaporte) throws Exception{
		ModelCompraDePassagem passagemAuxiliar = new ModelCompraDePassagem(Passaporte);
		int index = passagens.indexOf(passagemAuxiliar);
		
		if(index != -1) {
			return passagens.get(index);	
		}else {
			throw new Exception();
		}
	}

}
