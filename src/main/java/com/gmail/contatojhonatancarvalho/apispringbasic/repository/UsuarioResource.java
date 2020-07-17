package com.gmail.contatojhonatancarvalho.apispringbasic.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gmail.contatojhonatancarvalho.apispringbasic.entidade.Usuario;
import com.gmail.contatojhonatancarvalho.apispringbasic.resource.UsuarioRepository;
import com.gmail.contatojhonatancarvalho.apispringbasic.service.UsuarioService;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioResource {

	@Autowired
	private UsuarioService usuarioService; 
	
	@GetMapping
	public ResponseEntity<List<Usuario>> listarTodos() {
		List<Usuario> list = usuarioService.listarTodos();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Usuario> findById(@PathVariable Long id) {
		Usuario obj = usuarioService.buscarPorId(id);
		return ResponseEntity.ok().body(obj);
	}
//	
//	@PostMapping
//	public void salvarUsuario(Usuario usuario) {
//		
//		usuarioRepository.save(usuario);
//	}
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
