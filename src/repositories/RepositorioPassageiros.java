package repositories;

import java.util.ArrayList;

import interfaces.InterfaceRepositorioPassageiros;
import models.ModelPassageiro;

public class RepositorioPassageiros implements InterfaceRepositorioPassageiros{
	ArrayList<ModelPassageiro> Passageiros = new ArrayList<ModelPassageiro>();
	
	public void inserir(ModelPassageiro Passageiro) throws Exception{
		this.Passageiros.add(Passageiro);
	}
	
	public void excluir(String nomePassageiro) throws Exception{
		ModelPassageiro passageiroAuxiliar = procurar(nomePassageiro);
		
		if(passageiroAuxiliar != null) {
			this.Passageiros.remove(passageiroAuxiliar);
		}else {
			throw new Exception();
		}		
	}
	
	public void atualizar(String nomePassageiro, String novoNome) throws Exception{
		int index = 0;
		
		ModelPassageiro PassageiroAuxiliar = procurar(nomePassageiro);
		
		if(PassageiroAuxiliar != null) {
			PassageiroAuxiliar.setNome(novoNome);
		    
			index = Passageiros.indexOf(PassageiroAuxiliar);
			Passageiros.add(index, PassageiroAuxiliar);
		}else {
			throw new Exception();
		}
		
	}

	public ModelPassageiro procurar(String nomePassageiro) throws Exception{
		ModelPassageiro PassageiroAuxiliar = new ModelPassageiro(nomePassageiro);
		
		int index = Passageiros.indexOf(PassageiroAuxiliar);
		
		if(index == -1) {
			throw new Exception();
		}else {
			return Passageiros.get(index);
		}
	}
}
