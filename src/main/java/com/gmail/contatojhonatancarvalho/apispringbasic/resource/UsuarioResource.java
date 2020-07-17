package com.gmail.contatojhonatancarvalho.apispringbasic.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gmail.contatojhonatancarvalho.apispringbasic.entidade.Usuario;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioResource {

	@GetMapping
	public ResponseEntity<List<Usuario>> listarTodos() {
		Usuario u1 = new Usuario(1L, "Jhonatan", "contato@gmail.com", "41987859201", "123");
		Usuario u2 = new Usuario(2L, "Tiffany", "contato@gmail.com", "41987859201", "123");
		
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(u1);
		usuarios.add(u2);
		
		return ResponseEntity.ok().body(usuarios);
	}

//	@GetMapping("/{id}")
//		public ResponseEntity<Usuario> listarUsuario(@PathVariable("id") Long id) {
//
//	}
}
