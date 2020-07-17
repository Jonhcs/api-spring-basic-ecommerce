package com.gmail.contatojhonatancarvalho.apispringbasic.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gmail.contatojhonatancarvalho.apispringbasic.entidade.Categoria;
import com.gmail.contatojhonatancarvalho.apispringbasic.repository.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	

	public List<Categoria> listarTodos(){
		return categoriaRepository.findAll();
	}
	

	public Categoria buscarPorId(Long id){
		Optional<Categoria> usuario = categoriaRepository.findById(id);
		return usuario.get();
	}
	
}
