package edu.br.unifacear.projetointegrador3.teste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.Test;

import edu.br.unifacear.projetointegrador.dao.Dao;
import edu.br.unifacear.projetointegrador.dao.GenericDao;
import edu.br.unifacear.projetointegrador.entidade.Funcionario;

public class TestarFuncionario {

	@Test
	public void InserirJpa() {




		Funcionario func = new Funcionario();


		func.setCPF(792106891);



		Dao<Funcionario> daoFuncionario = new GenericDao<Funcionario>();
		daoFuncionario.inserir(func);

		assertEquals(true, func.getCPF() != null);

		//Alterar

		func.setCPF(123456789);

		daoFuncionario.alterar(func);

		func = daoFuncionario.buscarPorId(Funcionario.class, func.getCodFunc());
		assertEquals(true, func.getCPF().equals(123456789));

		//Excluir

		daoFuncionario.excluir(func);

		func = daoFuncionario.buscarPorId(Funcionario.class, func.getCodFunc());

		assertEquals(true, func == null);

	}

	@Test
	public void ListarTodosJpa() {



		Dao<Funcionario> daoFuncionario = new GenericDao<Funcionario>();

		List<Funcionario> func = daoFuncionario.listarTodos(Funcionario.class);

		assertEquals(true, func.size() > 0);


	}
}
