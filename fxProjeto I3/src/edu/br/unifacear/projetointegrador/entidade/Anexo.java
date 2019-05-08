package edu.br.unifacear.projetointegrador.entidade;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity


@Table(name="TB_ANEXO")

public class Anexo {
	@Id

	@GeneratedValue(strategy=GenerationType.AUTO)

	private Integer CodAnexo;
	@Column(nullable=false)	
	private String DescAnexo;
	private String CaminhoAnexo;

	public Integer getCodAnexo() {
		return CodAnexo;
	}
	public void setCodAnexo(Integer codAnexo) {
		CodAnexo = codAnexo;
	}
	public String getDescAnexo() {
		return DescAnexo;
	}
	public void setDescAnexo(String descAnexo) {
		DescAnexo = descAnexo;
	}
	public String getCaminhoAnexo() {
		return CaminhoAnexo;
	}
	public void setCaminhoAnexo(String caminhoAnexo) {
		CaminhoAnexo = caminhoAnexo;
	}


}

