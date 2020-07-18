package com.gmail.contatojhonatancarvalho.apispringbasic.resource;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gmail.contatojhonatancarvalho.apispringbasic.entidade.Categoria;
import com.gmail.contatojhonatancarvalho.apispringbasic.service.CategoriaService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping(value = "/categorias")
@Api(value = "API REST Categorias")
@CrossOrigin(origins = "*")
public class CategoriaResource {

	@Autowired
	private CategoriaService categoriaService; 
	
	@GetMapping
	public ResponseEntity<List<Categoria>> listarTodos() {
		List<Categoria> list = categoriaService.listarTodos();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Categoria> findById(@PathVariable Long id) {
		Categoria obj = categoriaService.buscarPorId(id);
		return ResponseEntity.ok().body(obj);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
