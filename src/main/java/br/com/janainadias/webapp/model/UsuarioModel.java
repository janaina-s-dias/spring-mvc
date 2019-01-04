package br.com.janainadias.webapp.model;

import java.time.LocalDate;
import java.util.List;

public class UsuarioModel {

	private Long codigo;
	
	private String nome;
	
	private String login;
	
	private String senha;
	
	private boolean ativo;
	
	private List<Long> grupos;
	
	public UsuarioModel(){
		System.out.println("Passei " + LocalDate.now());
	}

	public UsuarioModel(Long codigo, String nome, String login, String senha, boolean ativo, List<Long> grupos) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.ativo = ativo;
		this.grupos = grupos;
	}

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

	public List<Long> getGrupos() {
		return grupos;
	}

	public void setGrupos(List<Long> grupos) {
		this.grupos = grupos;
	}
	
	
	
	
	
	
}
