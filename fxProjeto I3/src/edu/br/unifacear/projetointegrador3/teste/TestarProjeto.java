package edu.br.unifacear.projetointegrador3.teste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.Test;

import edu.br.unifacear.projetointegrador.dao.Dao;
import edu.br.unifacear.projetointegrador.dao.GenericDao;
import edu.br.unifacear.projetointegrador.entidade.Projeto;

public class TestarProjeto {

	@Test
	public void InserirJpa() {

		Projeto p = new Projeto();

		p.setNomeProj("Projeto 1 ");
		p.setEsforcoMes(24);
		p.setObjProj("Teste do JPA");

		Dao<Projeto> daoProjeto = new GenericDao<Projeto>();
		daoProjeto.inserir(p);

		// Alterar

		p.setObjProj("Projeto Integrador");

		daoProjeto.alterar(p);

		p = daoProjeto.buscarPorId(Projeto.class, p.getCodProj());
		assertEquals(true, p.getObjProj().equals("Requisitos Funcionais"));

		// Excluir

		daoProjeto.excluir(p);

		p = daoProjeto.buscarPorId(Projeto.class, p.getCodProj());

		assertEquals(true, p == null);

	}

	@Test
	public void ListarTodosJpa() {

		Dao<Projeto> daoProjeto = new GenericDao<Projeto>();
		List<Projeto> projetos = daoProjeto.listarTodos(Projeto.class);

		assertEquals(true, projetos.size() > 0);

	}

}
