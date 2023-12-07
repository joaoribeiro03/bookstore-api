package com.joao.bookstore.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joao.bookstore.domain.Categoria;
import com.joao.bookstore.domain.Livro;
import com.joao.bookstore.repositories.CategoriaRepository;
import com.joao.bookstore.repositories.LivroRepository;

@Service
public class DBService {

	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private LivroRepository livroRepository;

	public void instanciaBaseDeDados() {

		Categoria cat1 = new Categoria(null, "Informática", "Livros de TI");
		Categoria cat2 = new Categoria(null, "Fantasia", "Livros de Fantasia");
		Categoria cat3 = new Categoria(null, "Ficção Científica", "Livros de Ficção Científica");

		Livro l1 = new Livro(null, "Clean Code", "Robert Martin", "Lorem Ipsum", cat1);
		Livro l2 = new Livro(null, "Senhor dos Anéis", "J.R.R. Tolkien", "Lorem Ipsum", cat2);
		Livro l3 = new Livro(null, "Fundação", "Isaac Asimov", "Lorem Ipsum", cat3);
		Livro l4 = new Livro(null, "Game of Thrones", "George R.R. Martin", "Lorem Ipsum", cat2);
		Livro l5 = new Livro(null, "Duna", "Frank Herbert", "Lorem Ipsum", cat3);

		cat1.getLivros().addAll(Arrays.asList(l1));
		cat2.getLivros().addAll(Arrays.asList(l2, l4));
		cat3.getLivros().addAll(Arrays.asList(l3, l5));

		this.categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		this.livroRepository.saveAll(Arrays.asList(l1, l2, l3, l4, l5));

	}

}
