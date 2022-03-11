package com.example.Diplom.SERVICE;

import com.example.Diplom.DTO.REQUEST.BookRequest;
import com.example.Diplom.DTO.RESPONSE.BookResponse;
import com.example.Diplom.ENT.Book;
import com.example.Diplom.REPO.BookRepo;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepo bookRepo;
    private final ObjectMapper objectMapper;

    public BookResponse addBook(BookRequest bookRequest) {
        Book book = objectMapper.convertValue(bookRequest, Book.class);
        bookRepo.save(book);
        return objectMapper.convertValue(book, BookResponse.class);
    }

    public BookResponse findByBookId(Long id) {
        Book book = bookRepo.findById(id).get();
        return objectMapper.convertValue(book, BookResponse.class);
    }

    public List<BookResponse> getAllBooks(Pageable pageable){
        List<BookResponse> books = new ArrayList<>();
        for(Book book : bookRepo.findAll(pageable)) {
            books.add(objectMapper.convertValue(book, BookResponse.class));
        }
        return books;
    }

    public void deleteBookById(Long id) {
        bookRepo.deleteById(id);
    }



}
