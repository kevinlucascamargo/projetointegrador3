package edu.br.unifacear.projetointegrador.entidade;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "TB_TRAMITACAO")
public class Tramitacao {
	@Id

	@GeneratedValue(strategy = GenerationType.AUTO)

	private Integer CodTram;
	@Column(nullable = false)
	private Date DatTram;

	public Integer getCodTram() {
		return CodTram;
	}

	public void setCodTram(Integer codTram) {
		CodTram = codTram;
	}

	public Date getDatTram() {
		return DatTram;
	}

	public void setDatTram(Date datTram) {
		DatTram = datTram;
	}

}
