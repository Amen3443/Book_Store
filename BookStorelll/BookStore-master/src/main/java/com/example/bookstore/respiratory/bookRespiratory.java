package com.example.bookstore.respiratory;

import com.example.bookstore.entity.book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface bookRespiratory extends JpaRepository<book,Long> {
}
