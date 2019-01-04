package br.com.janainadias.webapp.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
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

@Table(name="usuario", schema="Oracle Local")
@Entity
public class UsuarioEntity implements Serializable{


	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_id_usuario")
	@SequenceGenerator(name="seq_id_usuario", sequenceName="seq_id_usuario")
	@Column(name="idUsuario")
	private Long codigo;
	
	@Column(name="dsNome")
	private String nome;
	
	@Column(name="dsLogin")
	private String login;
	
	@Column(name="dsSenha")
	private String senha;
	
	@Column(name="ckAtivo")
	private boolean ativo;
	
	@JoinTable(name="usuario_x_grupo",
			joinColumns = {@JoinColumn(name = "idUsuario", referencedColumnName = "idUsuario")},
			inverseJoinColumns = {@JoinColumn(name = "idGrupo", referencedColumnName = "idGrupo")})
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<GrupoEntity> grupos;

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

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public List<GrupoEntity> getGrupos() {
		return grupos;
	}

	public void setGrupos(List<GrupoEntity> grupos) {
		this.grupos = grupos;
	}
	
	
	
}
