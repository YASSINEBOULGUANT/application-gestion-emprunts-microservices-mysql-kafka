package com.app.biblio.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.app.biblio.entities.Book;

@RepositoryRestResource
public interface BookRepository extends JpaRepository<Book, Long> {

}





