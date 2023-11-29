package com.kramedia.bookstore.KrameBook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kramedia.bookstore.KrameBook.entity.Book;
import org.springframework.stereotype.Repository;


@Repository
public interface BookRepository extends JpaRepository<Book,Integer>{

}
