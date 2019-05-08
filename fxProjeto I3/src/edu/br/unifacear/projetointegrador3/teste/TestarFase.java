package edu.br.unifacear.projetointegrador3.teste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.Test;

import edu.br.unifacear.projetointegrador.dao.Dao;
import edu.br.unifacear.projetointegrador.dao.GenericDao;
import edu.br.unifacear.projetointegrador.entidade.Fase;

public class TestarFase {
	
	@Test
	public void InserirJpa() {



		
		  Fase fase = new Fase();
		  
		  fase.setNomeFase("To Do");
		  
		  
		  
		  Dao<Fase> daoFase = new GenericDao<Fase>();
		 daoFase.inserir(fase);
		  
		  assertEquals(true, fase.getNomeFase() != null);
		 
		//Alterar
			
			fase.setNomeFase("Fazer");
			
			daoFase.alterar(fase);
			
			fase = daoFase.buscarPorId(Fase.class, fase.getCodFase());
			assertEquals(true, fase.getNomeFase().equals("Fazer"));
			
			//Excluir
			
			daoFase.excluir(fase);

			fase = daoFase.buscarPorId(Fase.class, fase.getCodFase());

			assertEquals(true, fase == null);
		
	}

	@Test
	public void ListarTodosJpa() {


		
		  Dao<Fase> daoFase = new GenericDao<Fase>();
		  
		  List<Fase> fases = daoFase.listarTodos(Fase.class);
		  
		  assertEquals(true, fases.size() > 0);
		 

	}
	
}
