package controllers;

import interfaces.InterfaceRepositorioCompraDePassagem;
import models.ModelCompraDePassagem;

public class NegocioCompraDePassagem {
	InterfaceRepositorioCompraDePassagem passagens = null;
	
	public NegocioCompraDePassagem(InterfaceRepositorioCompraDePassagem passagem) {
		this.passagens = passagem;
	}
	
	public void inserirPassagem(ModelCompraDePassagem passagem) throws Exception {
		try{
			passagens.inserir(passagem);
		}catch(Exception e) {
			throw new Exception();
		}
	}
	
	public void deletarPassagem(String idPassagem) throws Exception{
		try {
			passagens.excluir(idPassagem);
		}catch(Exception e) {
			throw new Exception();
		}
	}
	
	public void atualizarPassagem(String idPassagem, double novoValor) throws Exception{
		try{
			passagens.atualizar(idPassagem, novoValor);
		}catch(Exception e) {
			throw new Exception();
		}
	}
	
	public ModelCompraDePassagem buscarPassagem(String idPassagem) throws Exception{
		try{
			return passagens.procurar(idPassagem);
		}catch(Exception e) {
			throw new Exception(); 
		}
	}
}
