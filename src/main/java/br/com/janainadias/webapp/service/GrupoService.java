package br.com.janainadias.webapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.janainadias.webapp.entity.GrupoEntity;
import br.com.janainadias.webapp.model.GrupoModel;
import br.com.janainadias.webapp.repository.GrupoRepository;

@Service
@Transactional
public class GrupoService {

	private GrupoRepository grupoRepository;
	
	@Transactional(readOnly = true)
	public List<GrupoModel> consultarGrupos(){
		
		List<GrupoModel> gruposModel = new ArrayList<GrupoModel>();
		
		List<GrupoEntity> gruposEntity = this.grupoRepository.findAll();
		
		gruposEntity.forEach(grupo ->{
			gruposModel.add(new GrupoModel(grupo.getCodigo(), grupo.getDescricao()));
		});
		
		return gruposModel;
	}
	
}
