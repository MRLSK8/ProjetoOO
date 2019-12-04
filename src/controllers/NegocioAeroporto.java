package controllers;

import interfaces.InterfaceRepositorioAeroportos;
import models.ModelAeroporto;

public class NegocioAeroporto {
	InterfaceRepositorioAeroportos aeroportos = null;
	
	public NegocioAeroporto(InterfaceRepositorioAeroportos aeroportos) {
		this.aeroportos = aeroportos;
	}
	
	public String inserirAerorporto(ModelAeroporto aeroporto) {
		return aeroportos.inserir(aeroporto);
	}
	
	public String deletarAerorporto(String nomeAeroporto) {
		return aeroportos.excluir(nomeAeroporto);
	}
	
	public String atualizarAerorporto(String nomeAeroporto, String novoNome) {
		return aeroportos.atualizar(nomeAeroporto, novoNome);
	}
	
	public ModelAeroporto buscarAerorporto(String nomeAeroporto) {
		return aeroportos.procurar(nomeAeroporto);
	}
}
