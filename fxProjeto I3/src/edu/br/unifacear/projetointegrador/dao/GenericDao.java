package edu.br.unifacear.projetointegrador.dao;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class GenericDao<T> implements Dao<T> {

	@Override
	public void inserir(T t) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(t);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public void alterar(T t) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.merge(t);
		em.getTransaction().commit();
		em.close();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> listarTodos(Class<T> c) {
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("from " + c.getName());
		List<T> result = q.getResultList();

		em.close();
		return result;
	}
	
	

	@Override
	public List<T> listarWhere(Class<T> c, String where, Map<String,Object> argumentos) {
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select t from "+c.getName()+
				" t " + where);
		
		for (String indice : argumentos.keySet()) {
			q.setParameter(indice, argumentos.get(indice));
		}
		
		List<T> result = q.getResultList();

		em.close();
		return result;
	}

	@Override
	public void excluir(T t) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.remove(em.merge(t));
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public T buscarPorId(Class<T> c,Integer id) {
		EntityManager em = emf.createEntityManager();
		return em.find(c, id);
	}

}
