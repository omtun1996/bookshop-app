package com.bookShop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookShop.entity.MyBookList;


@Repository
public interface MyBookRepository extends JpaRepository<MyBookList, Integer> {
	

}
