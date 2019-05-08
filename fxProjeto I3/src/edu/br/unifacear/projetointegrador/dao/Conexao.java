package edu.br.unifacear.projetointegrador.dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexao {
	
	private static EntityManagerFactory emf = null;
	
	static {
		emf= Persistence.createEntityManagerFactory("ProjetoIntegrador3");
		
	}
	public static EntityManager getEntityManager() {
		return emf.createEntityManager();
		
	}
}
