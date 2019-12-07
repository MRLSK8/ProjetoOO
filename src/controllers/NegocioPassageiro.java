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
	
	public void deletarPassageiro(String CPF) throws Exception{
		try {
			passageiros.excluir(CPF);
		}catch(Exception e) {
			throw new Exception();
		}
	}
	
	public void deletarPassageiro(int Passaporte) throws Exception{
		try {
			passageiros.excluir(Passaporte);
		}catch(Exception e) {
			throw new Exception();
		}
	}
	
	public void atualizarPassageiro(String CPF, String novoNome) throws Exception{
		try{
			passageiros.atualizar(CPF, novoNome);
		}catch(Exception e) {
			throw new Exception();
		}
	}
	
	public void atualizarPassageiro(int Passaporte, String novoNome) throws Exception{
		try{
			passageiros.atualizar(Passaporte, novoNome);
		}catch(Exception e) {
			throw new Exception();
		}
	}
	
	public ModelPassageiro buscarPassageiro(String CPF) throws Exception{
		try{
			return passageiros.procurar(CPF);
		}catch(Exception e) {
			throw new Exception();
		}
	}
	
	public ModelPassageiro buscarPassageiro(int Passaporte) throws Exception{
		try{
			return passageiros.procurar(Passaporte);
		}catch(Exception e) {
			throw new Exception();
		}
	}

}
