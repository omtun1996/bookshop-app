package com.bookShop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookShop.entity.Book;


@Repository
public interface BookRepository extends JpaRepository<Book,Integer>{
	

}
