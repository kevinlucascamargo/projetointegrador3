package edu.br.unifacear.projetointegrador3.teste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.Test;

import edu.br.unifacear.projetointegrador.dao.Dao;
import edu.br.unifacear.projetointegrador.dao.GenericDao;
import edu.br.unifacear.projetointegrador.entidade.Tecnologia;

public class TestarTecnologia {
	@Test
	public void InserirJpa() {

		//Inserir 

		
		  Tecnologia tecno = new Tecnologia();
		  
		  
		  tecno.setNomeTecno("Chrome");
		  
		  
		  
		  Dao<Tecnologia> daoTecnologia = new GenericDao<Tecnologia>();
		daoTecnologia.inserir(tecno);
		  
		  assertEquals(true, tecno.getNomeTecno() != null);
		 
		  //Alterar
		  
		  tecno.setNomeTecno("Mozila");
			
			daoTecnologia.alterar(tecno);
			
			tecno = daoTecnologia.buscarPorId(Tecnologia.class, tecno.getCodTecno());
			
			
			assertEquals(true, tecno.getNomeTecno().equals("Mozila"));
		
			// Excluir
			
			daoTecnologia.excluir(tecno);

			tecno = daoTecnologia.buscarPorId(Tecnologia.class, tecno.getCodTecno());
			
			assertEquals(true, tecno == null);
	}

	@Test
	public void ListarTodosJpa() {


		
		  Dao<Tecnologia> daoTecnologia = new GenericDao<Tecnologia>();
		  
		  List<Tecnologia> tecno = daoTecnologia.listarTodos(Tecnologia.class);
		  
		  assertEquals(true, tecno.size() > 0);
		 

	}
}
