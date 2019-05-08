package edu.br.unifacear.projetointegrador.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "TB_TECNOLOGIA")
public class Tecnologia {
	@Id

	@GeneratedValue(strategy = GenerationType.AUTO)

	private Integer CodTecno;
	@Column(nullable = false)
	private String NomeTecno;
	private Integer TotalPF;

	public Integer getCodTecno() {
		return CodTecno;
	}

	public void setCodTecno(Integer codTecno) {
		CodTecno = codTecno;
	}

	public String getNomeTecno() {
		return NomeTecno;
	}

	public void setNomeTecno(String nomeTecno) {
		NomeTecno = nomeTecno;
	}

	public Integer getTotalPF() {
		return TotalPF;
	}

	public void setTotalPF(Integer totalPF) {
		TotalPF = totalPF;
	}

}
