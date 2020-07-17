package com.gmail.contatojhonatancarvalho.apispringbasic.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gmail.contatojhonatancarvalho.apispringbasic.entidade.Usuario;
import com.gmail.contatojhonatancarvalho.apispringbasic.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	

	public List<Usuario> listarTodos(){
		return usuarioRepository.findAll();
	}
	

	public Usuario buscarPorId(Long id){
		Optional<Usuario> usuario = usuarioRepository.findById(id);
		return usuario.get();
	}
	
}
