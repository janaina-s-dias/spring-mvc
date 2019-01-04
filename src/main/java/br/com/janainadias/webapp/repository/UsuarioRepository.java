package br.com.janainadias.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.janainadias.webapp.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long>{
	
	UsuarioEntity findByLogin(String login);
	
}
