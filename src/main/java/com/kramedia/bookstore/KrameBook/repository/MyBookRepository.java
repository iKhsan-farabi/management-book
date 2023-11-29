package com.kramedia.bookstore.KrameBook.repository;

import com.kramedia.bookstore.KrameBook.entity.MyBookList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MyBookRepository extends JpaRepository <MyBookList,Integer> {

}
