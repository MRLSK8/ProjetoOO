package repositories;

import java.util.ArrayList;

import interfaces.InterfaceRepositorioPassageiros;
import models.ModelPassageiro;

public class RepositorioPassageiros implements InterfaceRepositorioPassageiros{
	ArrayList<ModelPassageiro> Passageiros = new ArrayList<ModelPassageiro>();
	
	public void inserir(ModelPassageiro Passageiro) throws Exception{
		this.Passageiros.add(Passageiro);
	}
	
	public void excluir(String CPF) throws Exception{
		ModelPassageiro passageiroAuxiliar = procurar(CPF);
		
		if(passageiroAuxiliar != null) {
			this.Passageiros.remove(passageiroAuxiliar);
		}else {
			throw new Exception();
		}		
	}
	
	public void excluir(int Passaporte) throws Exception{
		ModelPassageiro passageiroAuxiliar = procurar(Passaporte);
		
		if(passageiroAuxiliar != null) {
			this.Passageiros.remove(passageiroAuxiliar);
		}else {
			throw new Exception();
		}		
	}
	
	public void atualizar(String CPF, String novoNome) throws Exception{	
		ModelPassageiro PassageiroAuxiliar = procurar(CPF);
		
		PassageiroAuxiliar.setNome(novoNome);
	}
	
	public void atualizar(int Passaporte, String novoNome) throws Exception{	
		ModelPassageiro PassageiroAuxiliar = procurar(Passaporte);
		
		if(PassageiroAuxiliar != null) {
			PassageiroAuxiliar.setNome(novoNome);
		}else {
			throw new Exception();
		}
		
	}

	public ModelPassageiro procurar(String CPF) throws Exception{
		ModelPassageiro PassageiroAuxiliar = new ModelPassageiro(CPF);
		
		int index = Passageiros.indexOf(PassageiroAuxiliar);
		
		if(index != -1) {
			return Passageiros.get(index);
		}else {
			throw new Exception();
		}
	}
	
	public ModelPassageiro procurar(int Passaporte) throws Exception{
		ModelPassageiro PassageiroAuxiliar = new ModelPassageiro(Passaporte);
		
		int index = Passageiros.indexOf(PassageiroAuxiliar);
		
		if(index != -1) {
			return Passageiros.get(index);
		}else {
			throw new Exception();
		}
	}
}
