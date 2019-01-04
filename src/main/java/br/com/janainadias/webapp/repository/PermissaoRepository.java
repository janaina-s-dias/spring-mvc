package br.com.janainadias.webapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.janainadias.webapp.entity.GrupoEntity;
import br.com.janainadias.webapp.entity.PermissaoEntity;

public interface PermissaoRepository extends JpaRepository<PermissaoEntity, Long>{

	List<PermissaoEntity> findByGruposIn(GrupoEntity grupoEntity);
	
}
