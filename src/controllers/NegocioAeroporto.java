package controllers;

import interfaces.InterfaceRepositorioAeroportos;
import models.ModelAeroporto;

public class NegocioAeroporto {
	InterfaceRepositorioAeroportos aeroportos = null;
	
	public NegocioAeroporto(InterfaceRepositorioAeroportos aeroportos) {
		this.aeroportos = aeroportos;
	}
	
	public void inserirAerorporto(ModelAeroporto aeroporto) throws Exception {
		try{
			aeroportos.inserir(aeroporto);
		}catch(Exception e) {
			throw new Exception();
		}
	}
	
	public void deletarAerorporto(String nomeAeroporto) throws Exception{
		try {
			aeroportos.excluir(nomeAeroporto);
		}catch(Exception e) {
			throw new Exception();
		}
	}
	
	public void atualizarAerorporto(String nomeAeroporto, String novoNome) throws Exception{
		try{
			aeroportos.atualizar(nomeAeroporto, novoNome);
		}catch(Exception e) {
			throw new Exception();
		}
	}
	
	public ModelAeroporto buscarAerorporto(String nomeAeroporto) throws Exception{
		try{
			return aeroportos.procurar(nomeAeroporto);
		}catch(Exception e) {
			throw new Exception();
		}
	}
}
