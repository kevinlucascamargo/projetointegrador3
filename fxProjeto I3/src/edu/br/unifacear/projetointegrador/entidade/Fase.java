package edu.br.unifacear.projetointegrador.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity


@Table(name="TB_FASE")
public class Fase {
@Id
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Integer CodFase;
	@Column(nullable=false)
	private String NomeFase;
	
	public Integer getCodFase() {
		return CodFase;
	}
	public void setCodFase(Integer codFase) {
		CodFase = codFase;
	}
	public String getNomeFase() {
		return NomeFase;
	}
	public void setNomeFase(String nomeFase) {
		NomeFase = nomeFase;
	}

	
	
}
