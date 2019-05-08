package edu.br.unifacear.projetointegrador.entidade;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity

@Table(name = "TB_PROJETO")

public class Projeto {

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer CodProj;
	@Column(nullable=false)
	private String NomeProj;
	private String ObjProj;
	private Integer TotalPF;
	private Integer EsforcoMes;
	private Float CustoProj;
	private Date DatIniProj;
	private Date DatPrevProj;
	private Date DatFimProj;
	private Integer	TimeboxDias;
	public Integer getCodProj() {
		return CodProj;
	}
	public void setCodProj(Integer codProj) {
		CodProj = codProj;
	}
	public String getNomeProj() {
		return NomeProj;
	}
	public void setNomeProj(String nomeProj) {
		NomeProj = nomeProj;
	}
	public String getObjProj() {
		return ObjProj;
	}
	public void setObjProj(String objProj) {
		ObjProj = objProj;
	}
	public Integer getTotalPF() {
		return TotalPF;
	}
	public void setTotalPF(Integer totalPF) {
		TotalPF = totalPF;
	}
	public Integer getEsforcoMes() {
		return EsforcoMes;
	}
	public void setEsforcoMes(Integer esforcoMes) {
		EsforcoMes = esforcoMes;
	}
	public Float getCustoProj() {
		return CustoProj;
	}
	public void setCustoProj(Float custoProj) {
		CustoProj = custoProj;
	}
	public Date getDatIniProj() {
		return DatIniProj;
	}
	public void setDatIniProj(Date datIniProj) {
		DatIniProj = datIniProj;
	}
	public Date getDatPrevProj() {
		return DatPrevProj;
	}
	public void setDatPrevProj(Date datPrevProj) {
		DatPrevProj = datPrevProj;
	}
	public Date getDatFimProj() {
		return DatFimProj;
	}
	public void setDatFimProj(Date datFimProj) {
		DatFimProj = datFimProj;
	}
	public Integer getTimeboxDias() {
		return TimeboxDias;
	}
	public void setTimeboxDias(Integer timeboxDias) {
		TimeboxDias = timeboxDias;
	}
	
	
	
	
	
	
}
