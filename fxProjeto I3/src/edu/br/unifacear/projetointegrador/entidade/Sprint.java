package edu.br.unifacear.projetointegrador.entidade;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity


@Table(name="TAB_SPRINT")
public class Sprint {
	@Id
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Integer CodSprint;
	@Column(nullable=false)
	private String NomeSprint;
	private Date DatIniSprint;
	private Date DatFimSprint;
	
	public Integer getCodSprint() {
		return CodSprint;
	}
	public void setCodSprint(Integer codSprint) {
		CodSprint = codSprint;
	}
	public String getNomeSprint() {
		return NomeSprint;
	}
	public void setNomeSprint(String nomeSprint) {
		NomeSprint = nomeSprint;
	}
	public Date getDatIniSprint() {
		return DatIniSprint;
	}
	public void setDatIniSprint(Date datIniSprint) {
		DatIniSprint = datIniSprint;
	}
	public Date getDatFimSprint() {
		return DatFimSprint;
	}
	public void setDatFimSprint(Date datFimSprint) {
		DatFimSprint = datFimSprint;
	}
	
	
}
