package com.gmail.contatojhonatancarvalho.apispringbasic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gmail.contatojhonatancarvalho.apispringbasic.entidade.Categoria;
import com.gmail.contatojhonatancarvalho.apispringbasic.entidade.Pedido;
import com.gmail.contatojhonatancarvalho.apispringbasic.entidade.Usuario;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
