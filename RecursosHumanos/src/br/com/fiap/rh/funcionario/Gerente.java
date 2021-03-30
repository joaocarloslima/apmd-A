package br.com.fiap.rh.funcionario;
import br.com.fiap.rh.sistema.Autenticavel;

public class Gerente extends Funcionario implements Autenticavel {

	private String area;
	private double bonus;
	private String senha;
	
	@Override
	public double getSalario() {
		return this.getSalarioBase() + bonus;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
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
