package edu.br.unifacear.projetointegrador3.teste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;
import java.util.List;

import org.junit.Test;

import edu.br.unifacear.projetointegrador.dao.Dao;
import edu.br.unifacear.projetointegrador.dao.GenericDao;
import edu.br.unifacear.projetointegrador.entidade.Release;

public class TestarRelease {
	@Test
	public void InserirJpa() {



		
		  Release release = new Release();
		  
		  
		  release.setDataPrevEntrega(new Date());
		  
		  
		  
		  Dao<Release> daoRelease = new GenericDao<Release>();
		 daoRelease.inserir(release);
		  
		  assertEquals(true, release.getDataPrevEntrega() != null);
		 
		//Alterar
			
			release.setDataPrevEntrega(new Date());
			
			daoRelease.alterar(release);
			
			release = daoRelease.buscarPorId(Release.class, release.getCodRelease());
			assertEquals(true, release.getDataPrevEntrega().equals(new Date()));
			
			//Excluir
			
			daoRelease.excluir(release);

			release = daoRelease.buscarPorId(Release.class, release.getCodRelease());

			assertEquals(true, release == null);
		
	}

	@Test
	public void ListarTodosJpa() {


		
		  Dao<Release> daoRelease = new GenericDao<Release>();
		  
		  List<Release> func = daoRelease.listarTodos(Release.class);
		  
		  assertEquals(true, func.size() > 0);
		 

	}
}
