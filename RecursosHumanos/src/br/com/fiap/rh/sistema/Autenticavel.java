package br.com.fiap.rh.sistema;

public interface Autenticavel  {
	
	public void setSenha(String senha);
	
	public boolean autenticar(String senha);

}
