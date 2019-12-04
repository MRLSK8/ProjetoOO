package repositories;

import java.util.ArrayList;
import interfaces.InterfaceRepositorioAeroportos;
import models.ModelAeroporto;

public class RepositorioAeroportos implements InterfaceRepositorioAeroportos{
	ArrayList<ModelAeroporto> Aeroportos = new ArrayList<ModelAeroporto>();
	
	
	public void inserir(ModelAeroporto aeroporto) {
		this.Aeroportos.add(aeroporto);
	}
	
	
	public void excluir(ModelAeroporto aeroporto) {
		this.Aeroportos.remove(aeroporto);
	}
	
	
	public void atualizar(String nomeAeroporto, String novoNome) {
		int index = 0;
		
		ModelAeroporto aeroporto = procurar(nomeAeroporto);
		aeroporto.setNome_aeroporto(novoNome);
	    
		index = Aeroportos.indexOf(aeroporto);
		Aeroportos.add(index, aeroporto);
	}


	public ModelAeroporto procurar(String nomeAeroporto) {
		ModelAeroporto aeroportoAuxiliar = new ModelAeroporto(nomeAeroporto);
		int index = Aeroportos.indexOf(aeroportoAuxiliar);
		
		if(index == -1) {
			return null;
		}else {
			return Aeroportos.get(index);
		}
	}

}
