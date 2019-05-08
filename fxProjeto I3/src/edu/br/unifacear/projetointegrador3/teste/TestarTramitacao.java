package edu.br.unifacear.projetointegrador3.teste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;
import java.util.List;

import org.junit.Test;

import edu.br.unifacear.projetointegrador.dao.Dao;
import edu.br.unifacear.projetointegrador.dao.GenericDao;
import edu.br.unifacear.projetointegrador.entidade.Tramitacao;

public class TestarTramitacao {
	@Test

	// Inserir

	public void InserirJpa() {

		Tramitacao tram = new Tramitacao();

		tram.setDatTram(new Date());

		Dao<Tramitacao> daoTramitacao = new GenericDao<Tramitacao>();
		daoTramitacao.inserir(tram);

		assertEquals(true, tram.getDatTram() != null);
		//Alterar

		tram.setDatTram(new Date());

		daoTramitacao.alterar(tram);

		tram = daoTramitacao.buscarPorId(Tramitacao.class, tram.getCodTram());
		assertEquals(true, tram.getDatTram().equals(new Date()));

		//Excluir

		daoTramitacao.excluir(tram);

		tram = daoTramitacao.buscarPorId(Tramitacao.class, tram.getCodTram());

		assertEquals(true, tram == null);


	}

	@Test
	public void ListarTodosJpa() {

		Dao<Tramitacao> daoTramitacao = new GenericDao<Tramitacao>();

		List<Tramitacao> tram = daoTramitacao.listarTodos(Tramitacao.class);

		assertEquals(true, tram.size() > 0);

	}
}
