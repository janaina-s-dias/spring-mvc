package br.com.janainadias.webapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.janainadias.webapp.entity.GrupoEntity;
import br.com.janainadias.webapp.entity.UsuarioEntity;

public interface GrupoRepository extends JpaRepository<GrupoEntity, Long> {
	
	List<GrupoEntity> findByUsuariosIn(UsuarioEntity usuarioEntity);

	GrupoEntity findOne(Long codigoGrupo);
	
}
