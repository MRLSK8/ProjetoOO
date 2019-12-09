package repositories;

import java.util.ArrayList;
import interfaces.InterfaceRepositorioAeroportos;
import models.ModelAeroporto;

public class RepositorioAeroportos implements InterfaceRepositorioAeroportos{
	public ArrayList<ModelAeroporto> Aeroportos = new ArrayList<ModelAeroporto>();
	
	public void inserir(ModelAeroporto aeroporto) throws Exception{
		this.Aeroportos.add(aeroporto);
	}
	
	public void excluir(String nomeAeroporto) throws Exception{
		ModelAeroporto aeroportoAuxiliar = procurar(nomeAeroporto);
		
		if(aeroportoAuxiliar != null) {
			this.Aeroportos.remove(aeroportoAuxiliar);
		}else {
			throw new Exception();
		}		
	}
	
	public void excluir(int codigoAeroporto) throws Exception{
		ModelAeroporto aeroportoAuxiliar = procurar(codigoAeroporto);
		
		if(aeroportoAuxiliar != null) {
			this.Aeroportos.remove(aeroportoAuxiliar);
		}else {
			throw new Exception();
		}		
	}
	
	public void atualizar(String nomeAeroporto, String novoNome) throws Exception{	
		ModelAeroporto aeroportoAuxiliar = procurar(nomeAeroporto);
		
		aeroportoAuxiliar.setNome_aeroporto(novoNome);
	}
	
	public void atualizar(int codigoAeroporto, String novoNome) throws Exception{	
		ModelAeroporto aeroportoAuxiliar = procurar(codigoAeroporto);
		
		if(aeroportoAuxiliar != null) {
			aeroportoAuxiliar.setNome_aeroporto(novoNome);
		}else {
			throw new Exception();
		}
		
	}

	public ModelAeroporto procurar(String nomeAeroporto) throws Exception{
		ModelAeroporto aeroportoAuxiliar = new ModelAeroporto(nomeAeroporto);
		int index = Aeroportos.indexOf(aeroportoAuxiliar);
		
		if(index != -1) {
			return Aeroportos.get(index);
		}else {
			throw new Exception();
		}
	}
	
	public ModelAeroporto procurar(int codigoAeroporto) throws Exception{
		ModelAeroporto aeroportoAuxiliar = new ModelAeroporto(codigoAeroporto);
		int index = Aeroportos.indexOf(aeroportoAuxiliar);
		
		if(index != -1) {
			return Aeroportos.get(index);
		}else {
			throw new Exception();
		}
	}
	
	// Metodo Apenas Para Teste!!!!!!!!
	public void mostrarTodos() {
		for(ModelAeroporto cod : Aeroportos) {
			System.out.println(cod.getCodigo_aeroporto() + " " + cod.getCidade() + " " + cod.getNome_aeroporto() + " " + cod.getEstado());
		}
	}
	
}
