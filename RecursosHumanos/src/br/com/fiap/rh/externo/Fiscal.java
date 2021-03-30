package br.com.fiap.rh.externo;

import br.com.fiap.rh.sistema.Autenticavel;

public class Fiscal implements Autenticavel {

	private String senha;

	@Override
	public void setSenha(String senha) {
		this.senha = senha;
		
	}

	@Override
	public boolean autenticar(String senha) {
		return this.senha == senha;
	}


}
