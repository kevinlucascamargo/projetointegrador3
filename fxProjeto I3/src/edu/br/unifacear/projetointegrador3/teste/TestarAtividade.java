package edu.br.unifacear.projetointegrador3.teste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.Test;

import edu.br.unifacear.projetointegrador.dao.Dao;
import edu.br.unifacear.projetointegrador.dao.GenericDao;
import edu.br.unifacear.projetointegrador.entidade.Atividade;



public class TestarAtividade {
	@Test
	public void InserirJpa() {



		Atividade atv = new Atividade();

		atv.setNomeAtv("Gerenciar Paciente");
		atv.setDescAtv("Realizar o gerenciamento dos pacientes");


		Dao<Atividade> daoAtividade = new GenericDao<Atividade>();
		daoAtividade.inserir(atv);

		assertEquals(true, atv.getCodAtv() != null);
		//Alterar
		
				atv.setNomeAtv("Gerenciar Pacientes");
				
				daoAtividade.alterar(atv);
				
				atv = daoAtividade.buscarPorId(Atividade.class, atv.getCodAtv());
				assertEquals(true, atv.getNomeAtv().equals("Gerenciar Pacientes"));
				
				//Excluir
				
				daoAtividade.excluir(atv);

				atv = daoAtividade.buscarPorId(Atividade.class, atv.getCodAtv());

				assertEquals(true, atv == null);
		
	}

	@Test
	public void ListarTodosJpa() {


		Dao<Atividade> daoAtividade = new GenericDao<Atividade>();
		
		List<Atividade> atividades = daoAtividade.listarTodos(Atividade.class);

		assertEquals(true, atividades.size() > 0);

	}
	
}