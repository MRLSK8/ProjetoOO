package controllers;

import interfaces.InterfaceRepositorioCompraDePassagem;
import models.ModelCompraDePassagem;
import models.ModelPassageiro;

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
	
	public ModelCompraDePassagem buscarPassagem(ModelPassageiro passageiro) throws Exception{
		try{
			return passagens.procurar(passageiro);
		}catch(Exception e) {
			throw new Exception(); 
		}
	}
	public ModelCompraDePassagem buscarPassagem(int Passaporte) throws Exception{
		try{
			return passagens.procurar(Passaporte);
		}catch(Exception e) {
			throw new Exception(); 
		}
	}
}
