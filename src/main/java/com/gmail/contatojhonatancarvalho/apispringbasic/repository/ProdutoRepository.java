package com.gmail.contatojhonatancarvalho.apispringbasic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gmail.contatojhonatancarvalho.apispringbasic.entidade.Categoria;
import com.gmail.contatojhonatancarvalho.apispringbasic.entidade.Pedido;
import com.gmail.contatojhonatancarvalho.apispringbasic.entidade.Produto;
import com.gmail.contatojhonatancarvalho.apispringbasic.entidade.Usuario;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
