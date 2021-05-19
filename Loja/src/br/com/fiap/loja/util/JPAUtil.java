package br.com.fiap.loja.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class JPAUtil {

	private static EntityManager manager;
	
	public static EntityManager getManager() {
		if (manager == null) {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("loja");
			manager = factory.createEntityManager();
		}
		return manager;
	}

}
