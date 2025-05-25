package com.example.bookstore.service;


import com.example.bookstore.entity.book;
import com.example.bookstore.respiratory.bookRespiratory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService_Imp implements BookService{

    @Autowired
    private bookRespiratory repo ;


    public void save(book b1) {
      repo.save(b1);
    }

    public List<book> getall() {
       return repo.findAll();
    }

    public book getbyid(Long id){
        return repo.findById(id).get();
    }

    public void delete(Long id){
        repo.deleteById(id);
    }


}
