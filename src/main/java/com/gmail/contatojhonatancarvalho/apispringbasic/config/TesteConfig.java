package com.gmail.contatojhonatancarvalho.apispringbasic.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.gmail.contatojhonatancarvalho.apispringbasic.entidade.Usuario;
import com.gmail.contatojhonatancarvalho.apispringbasic.resource.UsuarioRepository;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public void run(String... args) throws Exception {
		Usuario u1 = new Usuario(null, "Jhonatan", "contato@gmail.com", "41987859201", "123");
		Usuario u2 = new Usuario(null, "Tiffany", "contato@gmail.com", "41987859201", "123");
		
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(u1);
		usuarios.add(u2);
		
		usuarioRepository.saveAll(usuarios);
	}
	
}
