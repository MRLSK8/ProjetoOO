package repositories;

import java.util.ArrayList;
import interfaces.InterfaceRepositorioAeroportos;
import models.ModelAeroporto;

public class RepositorioAeroportos implements InterfaceRepositorioAeroportos{
	ArrayList<ModelAeroporto> Aeroportos = new ArrayList<ModelAeroporto>();
	
	
	public String inserir(ModelAeroporto aeroporto) {
		this.Aeroportos.add(aeroporto);
		
		return "Inserido com sucesso";
	}
	
	
	public String excluir(String nomeAeroporto) {
		ModelAeroporto aeroportoAuxiliar = procurar(nomeAeroporto);
		
		if(aeroportoAuxiliar != null) {
			this.Aeroportos.remove(aeroportoAuxiliar);
			return "Deletado com sucesso";
		}else {
			return "Errro ao deletar aeroporto";
		}		
	}
	
	
	public String atualizar(String nomeAeroporto, String novoNome) {
		int index = 0;
		
		ModelAeroporto aeroportoAuxiliar = procurar(nomeAeroporto);
		
		if(aeroportoAuxiliar != null) {
			aeroportoAuxiliar.setNome_aeroporto(novoNome);
		    
			index = Aeroportos.indexOf(aeroportoAuxiliar);
			Aeroportos.add(index, aeroportoAuxiliar);
			
			return "Atualizado com sucesso";
		}else {
			return "Erro ao atualizar";
		}
		
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
