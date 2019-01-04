package br.com.janainadias.webapp.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name="grupo", schema="Oracle Local")
@Entity
public class GrupoEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_id_grupo")
	@SequenceGenerator(name="seq_id_grupo", sequenceName="seq_id_grupo")
	@Column(name="idGrupo")
	private Long codigo;
	
	@Column(name="dsNome")
	private String nome;
	
	@Column(name="dsdescricao")
	private String descricao;
	
	@ManyToMany
	@JoinTable(
		name = "usuario_x_grupo",
		joinColumns=@JoinColumn(name="idGrupo", referencedColumnName="idGrupo"),
		inverseJoinColumns=@JoinColumn(name="idUsuario", referencedColumnName="idUsuario"))
	private List<UsuarioEntity> usuarios;
	
	
	@ManyToMany
	@JoinTable(
		name = "permissao_x_grupo",
		joinColumns=@JoinColumn(name="idGrupo", referencedColumnName="idGrupo"),
		inverseJoinColumns=@JoinColumn(name="idPermissao", referencedColumnName="idPermissao"))
	private List<PermissaoEntity> permissoes;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	

}
