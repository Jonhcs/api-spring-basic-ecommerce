package com.gmail.contatojhonatancarvalho.apispringbasic.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.gmail.contatojhonatancarvalho.apispringbasic.entidade.Usuario;
import com.gmail.contatojhonatancarvalho.apispringbasic.repository.UsuarioRepository;
import com.gmail.contatojhonatancarvalho.apispringbasic.service.exceptions.DatabaseException;
import com.gmail.contatojhonatancarvalho.apispringbasic.service.exceptions.ResourceNotFoundException;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	

	public List<Usuario> listarTodos(){
		return usuarioRepository.findAll();
	}
	

	public Usuario buscarPorId(Long id){
		Optional<Usuario> usuario = usuarioRepository.findById(id);
		return usuario.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public Usuario save(Usuario usuario){
		return usuarioRepository.save(usuario);
	}
	
	public void delete(Long id){
		try {
			usuarioRepository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
			
		}
		
	}
	public Usuario atualizar(Long id, Usuario usuario){
		
		try {
			Usuario entidade = usuarioRepository.getOne(id);
			updateData(entidade, usuario);
			return usuarioRepository.save(entidade);
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}
		
	}
	
	private void updateData(Usuario entidade, Usuario usuario) {
		entidade.setNome(usuario.getNome());
		entidade.setEmail(usuario.getEmail());
		entidade.setTelefone(usuario.getTelefone());
	}
}
