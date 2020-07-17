package com.gmail.contatojhonatancarvalho.apispringbasic.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gmail.contatojhonatancarvalho.apispringbasic.entidade.Pedido;
import com.gmail.contatojhonatancarvalho.apispringbasic.repository.PedidoRepository;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository pedidoRepository;
	

	public List<Pedido> listarTodos(){
		return pedidoRepository.findAll();
	}
	

	public Pedido buscarPorId(Long id){
		Optional<Pedido> usuario = pedidoRepository.findById(id);
		return usuario.get();
	}
	
}
