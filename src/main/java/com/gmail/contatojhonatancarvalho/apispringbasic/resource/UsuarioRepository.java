package com.gmail.contatojhonatancarvalho.apispringbasic.resource;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gmail.contatojhonatancarvalho.apispringbasic.entidade.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
