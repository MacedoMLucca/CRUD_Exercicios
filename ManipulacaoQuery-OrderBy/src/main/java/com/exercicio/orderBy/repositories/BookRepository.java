package com.exercicio.orderBy.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exercicio.orderBy.entities.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
	//Ordena por nome 
	public List<Book> findByOrderByName();
	
	//Ordena por Ano de Publicação 
	public List<Book> findByOrderByPublicationDate();
	
	
	//Orenando por autor e data de publicação
	public List<Book> findByOrderByAuthorAscPublicationDateDesc();

	
	//@Query("SELECT * FROM tb_book WHERE publicationDate = :dt")
	//List<Book> findByOrderByMeuFiltro(@Param("dt") Integer publicationDate);
}