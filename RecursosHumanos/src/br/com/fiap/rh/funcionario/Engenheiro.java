package br.com.fiap.rh.funcionario;

public class Engenheiro extends Funcionario {
	private String departamento;
	private int crea;
	
	@Override
	public double getSalario() {
		return this.getSalarioBase() + this.getSalarioBase() * 0.5;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public int getCrea() {
		return crea;
	}

	public void setCrea(int crea) {
		this.crea = crea;
	}

}
