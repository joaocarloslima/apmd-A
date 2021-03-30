package br.com.fiap.rh.sistema;

import br.com.fiap.rh.funcionario.Funcionario;

public class FolhaDePagamento {
	
	private double valorTotalDaFolhaDePagamento = 0;
	
	public double getValorTotalDaFolhaDePagamento() {
		return valorTotalDaFolhaDePagamento;
	}
	
	public void registrar(Funcionario funcionario) {
		valorTotalDaFolhaDePagamento += funcionario.getSalario();
	}
	
	public void logar(Autenticavel usuario) {
		if (usuario.autenticar("123")) {
			System.out.println("Acesso permitido para " + usuario);
		}else {
			System.out.println("Acesso negado para " + usuario);
		}
	}
	
	
}
