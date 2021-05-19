package br.com.fiap.loja.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.fiap.loja.model.Produto;
import br.com.fiap.loja.util.JPAUtil;

public class ProdutoDAO {
	
	EntityManager manager = JPAUtil.getManager();

	public void cadastrar(Produto produto) {
		
		manager.getTransaction().begin();
		manager.persist(produto);
		manager.getTransaction().commit();
		
	}
	
	public List<Produto> obterTodos() {
		TypedQuery<Produto> query = 
				manager.createQuery("SELECT p FROM Produto p", Produto.class);
		return query.getResultList();
	}

	
	
	
}
