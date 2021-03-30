package br.com.fiap.rh.funcionario;
import br.com.fiap.rh.sistema.Autenticavel;

public final class Presidente extends Funcionario implements Autenticavel {

	private double valorDaCotaDeAcoes;
	private String senha;
	
	@Override
	public double getSalario() {
		return this.getSalarioBase() + valorDaCotaDeAcoes;
	}

	public double getValorDaCotaDeAcoes() {
		return valorDaCotaDeAcoes;
	}

	public void setValorDaCotaDeAcoes(double valorDaCotaDeAcoes) {
		this.valorDaCotaDeAcoes = valorDaCotaDeAcoes;
	}

	@Override
	public void setSenha(String senha) {
		this.senha = senha;
		
	}

	@Override
	public boolean autenticar(String senha) {
		return this.senha == senha;
	}

}
