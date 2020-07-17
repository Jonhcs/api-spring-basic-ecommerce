package com.gmail.contatojhonatancarvalho.apispringbasic.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gmail.contatojhonatancarvalho.apispringbasic.entidade.Produto;
import com.gmail.contatojhonatancarvalho.apispringbasic.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository categoriaRepository;
	

	public List<Produto> listarTodos(){
		return categoriaRepository.findAll();
	}
	

	public Produto buscarPorId(Long id){
		Optional<Produto> usuario = categoriaRepository.findById(id);
		return usuario.get();
	}
	
}
