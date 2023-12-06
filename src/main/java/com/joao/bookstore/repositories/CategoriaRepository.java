package com.joao.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.joao.bookstore.domain.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
	// dentro do <> está Classe que queremos fazer a persistência, e o outro
	// argumento espera o tipo primitivo da chave primária que no caso é INTEGER
}
