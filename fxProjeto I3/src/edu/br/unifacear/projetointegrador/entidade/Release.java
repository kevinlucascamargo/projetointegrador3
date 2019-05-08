package edu.br.unifacear.projetointegrador.entidade;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity


@Table(name="TB_RELEASE")

public class Release {
@Id
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Integer CodRelease;
	@Column(nullable=false)
	private Date DataPrevEntrega;
	private Date DataRealEntrega;
	public Integer getCodRelease() {
		return CodRelease;
	}
	public void setCodRelease(Integer codRelease) {
		CodRelease = codRelease;
	}
	public Date getDataPrevEntrega() {
		return DataPrevEntrega;
	}
	public void setDataPrevEntrega(Date dataPrevEntrega) {
		DataPrevEntrega = dataPrevEntrega;
	}
	public Date getDataRealEntrega() {
		return DataRealEntrega;
	}
	public void setDataRealEntrega(Date dataRealEntrega) {
		DataRealEntrega = dataRealEntrega;
	}
	
	
	
	

	
}

