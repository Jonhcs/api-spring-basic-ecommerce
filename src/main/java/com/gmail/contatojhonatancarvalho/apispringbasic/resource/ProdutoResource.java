package com.gmail.contatojhonatancarvalho.apispringbasic.resource;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gmail.contatojhonatancarvalho.apispringbasic.entidade.Produto;
import com.gmail.contatojhonatancarvalho.apispringbasic.service.ProdutoService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping(value = "/produtos")
@Api(value = "API REST - Model Product")
public class ProdutoResource {

	@Autowired
	private ProdutoService produtoService; 
	
	@GetMapping
	public ResponseEntity<List<Produto>> listarTodos() {
		List<Produto> list = produtoService.listarTodos();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Produto> findById(@PathVariable Long id) {
		Produto obj = produtoService.buscarPorId(id);
		return ResponseEntity.ok().body(obj);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
