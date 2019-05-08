package edu.br.unifacear.projetointegrador3.teste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.Test;

import edu.br.unifacear.projetointegrador.dao.Dao;
import edu.br.unifacear.projetointegrador.dao.GenericDao;
import edu.br.unifacear.projetointegrador.entidade.Anexo;





public class TestarAnexo {
	
	@Test
	
	//Inserir
	
	public void InserirJpa() {



		
		  Anexo anexo = new Anexo();
		  
		  anexo.setDescAnexo("RequisitosFunc");
		  
		  
		  
		  Dao<Anexo> daoAnexo = new GenericDao<Anexo>();
		 daoAnexo.inserir(anexo);
		  
		  assertEquals(true, anexo.getDescAnexo() != null);
		 
		//Alterar
		
		anexo.setDescAnexo("Requisitos Funcionais");
		
		daoAnexo.alterar(anexo);
		
		anexo = daoAnexo.buscarPorId(Anexo.class, anexo.getCodAnexo());
		assertEquals(true, anexo.getDescAnexo().equals("Requisitos Funcionais"));
		
		//Excluir
		
		daoAnexo.excluir(anexo);

		anexo = daoAnexo.buscarPorId(Anexo.class, anexo.getCodAnexo());

		assertEquals(true, anexo == null);
		  
	}

	@Test
	public void ListarTodosJpa() {


		
		  Dao<Anexo> daoAnexo = new GenericDao<Anexo>();
		  
		  List<Anexo> anexos = daoAnexo.listarTodos(Anexo.class);
		  
		  assertEquals(true, anexos.size() > 0);
		 

	}
	
}