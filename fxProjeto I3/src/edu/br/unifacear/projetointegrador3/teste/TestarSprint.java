package edu.br.unifacear.projetointegrador3.teste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;
import java.util.List;

import org.junit.Test;

import edu.br.unifacear.projetointegrador.dao.Dao;
import edu.br.unifacear.projetointegrador.dao.GenericDao;
import edu.br.unifacear.projetointegrador.entidade.Sprint;

public class TestarSprint {
	@Test
	// Inserir
	public void InserirJpa() {

		Sprint sprint = new Sprint();

		sprint.setNomeSprint("Sprint2");
		sprint.setDatFimSprint(new Date());

		Dao<Sprint> daoSprint = new GenericDao<Sprint>();
		daoSprint.inserir(sprint);

		assertEquals(true, sprint.getCodSprint() != null);

		// Alterar

		sprint.setNomeSprint("Sprint3");

		daoSprint.alterar(sprint);

		sprint = daoSprint.buscarPorId(Sprint.class, sprint.getCodSprint());

		assertEquals(true, sprint.getNomeSprint().equals("Sprint3"));
		// Excluir

		daoSprint.excluir(sprint);

		sprint = daoSprint.buscarPorId(Sprint.class, sprint.getCodSprint());

		assertEquals(true, sprint == null);

	}

	@Test
	public void ListarTodosJpa() {

		Dao<Sprint> daoSprint = new GenericDao<Sprint>();
		List<Sprint> sprints = daoSprint.listarTodos(Sprint.class);

		assertEquals(true, sprints.size() > 0);

	}

}
