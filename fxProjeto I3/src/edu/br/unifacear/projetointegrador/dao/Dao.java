package edu.br.unifacear.projetointegrador.dao;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public interface Dao<T> {
	
	static EntityManagerFactory emf = Persistence.
			createEntityManagerFactory("ProjetoIntegrador3");
	
	public void inserir(T t);
	
	public void alterar(T t);
	
	public List<T> listarTodos(Class<T> c);
	
	public List<T> listarWhere(Class<T> c, String where,
			Map<String,Object> argumentos);

	public void excluir(T t);
	
	public T buscarPorId(Class<T> c,Integer id);

}
