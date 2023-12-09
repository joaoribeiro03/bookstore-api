package com.joao.bookstore.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joao.bookstore.domain.Livro;
import com.joao.bookstore.repositories.LivroRepository;
import com.joao.bookstore.service.exceptions.ObjectNotFoundException;

@Service
public class LivroService {

	@Autowired
	private LivroRepository livroRepository;

	public Livro findById(Integer id) {
		Optional<Livro> obj = livroRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Livro não encontrado! Id: " + id + ", Tipo:" + Livro.class.getName()));
	}

}
