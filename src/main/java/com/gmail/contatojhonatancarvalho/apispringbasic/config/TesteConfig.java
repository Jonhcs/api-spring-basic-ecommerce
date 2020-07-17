package com.gmail.contatojhonatancarvalho.apispringbasic.config;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.gmail.contatojhonatancarvalho.apispringbasic.entidade.Pedido;
import com.gmail.contatojhonatancarvalho.apispringbasic.entidade.Usuario;
import com.gmail.contatojhonatancarvalho.apispringbasic.repository.PedidoRepository;
import com.gmail.contatojhonatancarvalho.apispringbasic.repository.UsuarioRepository;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private PedidoRepository pedidoRepository; 

	@Override
	public void run(String... args) throws Exception {
		Usuario u1 = new Usuario(null, "Jhonatan", "contato@gmail.com", "41987859201", "123");
		Usuario u2 = new Usuario(null, "Tiffany", "contato@gmail.com", "41987859201", "123");
		
		Pedido o1 = new Pedido(null, Instant.parse("2019-06-20T19:53:07Z"), u1);
		Pedido o2 = new Pedido(null, Instant.parse("2019-07-21T03:42:10Z"), u2);
		Pedido o3 = new Pedido(null, Instant.parse("2019-07-22T15:21:22Z"), u1);
		
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(u1);
		usuarios.add(u2);
		
		usuarioRepository.saveAll(usuarios);
		pedidoRepository.saveAll(Arrays.asList(o1,o2,o3));
	}
	
}
