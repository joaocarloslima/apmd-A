package br.com.fiap.rh.sistema;

import br.com.fiap.rh.externo.Fiscal;
import br.com.fiap.rh.funcionario.*;

public class TestaRH {

	public static void main(String[] args) {
		Funcionario funcionario = new Gerente();
		funcionario.setCodigo(23001);
		funcionario.getSalario();
		System.out.println(funcionario.getCodigo());
		
		Engenheiro engenheiro = new Engenheiro();
		engenheiro.setCodigo(23002);
		System.out.println(engenheiro.getCodigo());
		engenheiro.setCrea(2021001);
		engenheiro.setSalarioBase(5000);
		System.out.println(engenheiro.getSalario());
		
		Gerente gerente = new Gerente();
		gerente.setCodigo(23003);
		gerente.setNome("Fabiana Souza");
		gerente.setSenha("123");
		System.out.println(gerente.getCodigo());
		gerente.setSalarioBase(3000);
		gerente.setBonus(1000);
		System.out.println(gerente.getSalario());
		
		
		Presidente presidente = new Presidente();
		presidente.setSenha("12345");
		presidente.setNome("Bil Gates");
		presidente.setCodigo(23004);
		presidente.setSalarioBase(8000);
		presidente.setValorDaCotaDeAcoes(5000);
		System.out.println(presidente.getSalario());
		
		Fiscal fiscal = new Fiscal();
		fiscal.setSenha("321654");
		
		
		FolhaDePagamento folhaDePagamento = new FolhaDePagamento();
		folhaDePagamento.logar(presidente);
		folhaDePagamento.logar(gerente);
		folhaDePagamento.logar(fiscal);
		folhaDePagamento.registrar(presidente);
		folhaDePagamento.registrar(gerente);
		folhaDePagamento.registrar(engenheiro);
		
		System.out.println(folhaDePagamento.getValorTotalDaFolhaDePagamento());
		
	}

}
