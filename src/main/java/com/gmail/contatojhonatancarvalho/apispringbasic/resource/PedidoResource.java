package com.gmail.contatojhonatancarvalho.apispringbasic.resource;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gmail.contatojhonatancarvalho.apispringbasic.entidade.Pedido;
import com.gmail.contatojhonatancarvalho.apispringbasic.service.PedidoService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping(value = "/pedidos")
@Api(value = "API REST - Model Pedido")
public class PedidoResource {

	@Autowired
	private PedidoService pedidoService; 
	
	@GetMapping
	public ResponseEntity<List<Pedido>> listarTodos() {
		List<Pedido> list = pedidoService.listarTodos();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Pedido> findById(@PathVariable Long id) {
		Pedido obj = pedidoService.buscarPorId(id);
		return ResponseEntity.ok().body(obj);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
