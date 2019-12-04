package controllers;

import interfaces.InterfaceRepositorioPassageiros;
import models.ModelPassageiro;

public class NegocioPassageiro {
	InterfaceRepositorioPassageiros passageiros = null;
	
	public NegocioPassageiro(InterfaceRepositorioPassageiros passageiro) {
		this.passageiros = passageiro;
	}
	
	public void inserirPassageiro(ModelPassageiro passageiro) throws Exception {
		try{
			passageiros.inserir(passageiro);
		}catch(Exception e) {
			throw new Exception();
		}
	}
	
	public void deletarPassageiro(String nomePassageiro) throws Exception{
		try {
			passageiros.excluir(nomePassageiro);
		}catch(Exception e) {
			throw new Exception();
		}
	}
	
	public void atualizarPassageiro(String nomePassageiro, String novoNome) throws Exception{
		try{
			passageiros.atualizar(nomePassageiro, novoNome);
		}catch(Exception e) {
			throw new Exception();
		}
	}
	
	public ModelPassageiro buscarPassageiro(String nomePassageiro) throws Exception{
		try{
			return passageiros.procurar(nomePassageiro);
		}catch(Exception e) {
			throw new Exception();
		}
	}

}
