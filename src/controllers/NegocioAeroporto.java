package controllers;

import interfaces.InterfaceRepositorioAeroportos;
import models.ModelAeroporto;

public class NegocioAeroporto {
	InterfaceRepositorioAeroportos aeroportos = null;
	
	public NegocioAeroporto(InterfaceRepositorioAeroportos aeroportos) {
		this.setAeroportos(aeroportos);
	}
	
	public void inserirAerorporto(ModelAeroporto aeroporto) {
		aeroportos.inserir(aeroporto);
	}
	
	public void deletarAerorporto(ModelAeroporto aeroporto) {
		aeroportos.excluir(aeroporto);
	}
	
	public void atualizarAerorporto(String nomeAeroporto, String novoNome) {
		aeroportos.atualizar(nomeAeroporto, novoNome);
	}
	
	public void buscarAerorporto(String nomeAeroporto) {
		aeroportos.procurar(nomeAeroporto);
	}

	
	public InterfaceRepositorioAeroportos getAeroportos() {
		return aeroportos;
	}

	public void setAeroportos(InterfaceRepositorioAeroportos aeroportos) {
		this.aeroportos = aeroportos;
	}
	
}
