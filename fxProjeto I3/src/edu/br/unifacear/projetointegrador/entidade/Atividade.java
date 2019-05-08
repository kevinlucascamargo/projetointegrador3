package edu.br.unifacear.projetointegrador.entidade;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity


@Table(name="TB_ATIVIDADE")

public class Atividade {
@Id
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Integer CodAtv;
	private String NomeAtv;
	private Integer NivelPrio;
	private String DescAtv;
	private Date DatIniAtv;
	private Date DatFimPrevAtv;
	private Integer EsforcoHora;
	private Integer RecursoPrev;
	private Integer RecursoReal;
	
	public Integer getCodAtv() {
		return CodAtv;
	}
	public void setCodAtv(Integer codAtv) {
		CodAtv = codAtv;
	}
	public String getNomeAtv() {
		return NomeAtv;
	}
	public void setNomeAtv(String nomeAtv) {
		NomeAtv = nomeAtv;
	}
	public Integer getNivelPrio() {
		return NivelPrio;
	}
	public void setNivelPrio(Integer nivelPrio) {
		NivelPrio = nivelPrio;
	}
	public String getDescAtv() {
		return DescAtv;
	}
	public void setDescAtv(String descAtv) {
		DescAtv = descAtv;
	}
	public Date getDatIniAtv() {
		return DatIniAtv;
	}
	public void setDatIniAtv(Date datIniAtv) {
		DatIniAtv = datIniAtv;
	}
	public Date getDatFimPrevAtv() {
		return DatFimPrevAtv;
	}
	public void setDatFimPrevAtv(Date datFimPrevAtv) {
		DatFimPrevAtv = datFimPrevAtv;
	}
	public Integer getEsforcoHora() {
		return EsforcoHora;
	}
	public void setEsforcoHora(Integer esforcoHora) {
		EsforcoHora = esforcoHora;
	}
	public Integer getRecursoPrev() {
		return RecursoPrev;
	}
	public void setRecursoPrev(Integer recursoPrev) {
		RecursoPrev = recursoPrev;
	}
	public Integer getRecursoReal() {
		return RecursoReal;
	}
	public void setRecursoReal(Integer recursoReal) {
		RecursoReal = recursoReal;
	}
	
	
	
	
}


