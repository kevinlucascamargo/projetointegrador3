package edu.br.unifacear.projetointegrador.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity

@Table(name = "TB_FUNCIONARIO")
public class Funcionario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer CodFunc;
	@Column(nullable=false)
	private String NomeFunc;
	private Integer CPF;
	private String Login;
	private String Senha;
	public Integer getCodFunc() {
		return CodFunc;
	}
	public void setCodFunc(Integer codFunc) {
		CodFunc = codFunc;
	}
	public String getNomeFunc() {
		return NomeFunc;
	}
	public void setNomeFunc(String nomeFunc) {
		NomeFunc = nomeFunc;
	}
	public Integer getCPF() {
		return CPF;
	}
	public void setCPF(Integer cPF) {
		CPF = cPF;
	}
	public String getLogin() {
		return Login;
	}
	public void setLogin(String login) {
		Login = login;
	}
	public String getSenha() {
		return Senha;
	}
	public void setSenha(String senha) {
		Senha = senha;
	}
	
	
	
	
	
	
}
