package com.example.Diplom.WEB;

import com.example.Diplom.DTO.REQUEST.BookRequest;
import com.example.Diplom.DTO.RESPONSE.BookResponse;
import com.example.Diplom.SERVICE.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor

public class BookController {
    private final BookService bookService;

    @PostMapping("/add")
    public ResponseEntity<BookResponse> addBook(@RequestBody BookRequest bookRequest){
        BookResponse bookResponse = bookService.addBook(bookRequest);

        return ResponseEntity.ok(bookResponse);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookResponse> findByBookId(@PathVariable Long id){
        BookResponse bookResponse = bookService.findByBookId(id);

        return ResponseEntity.ok(bookResponse);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteBookById(@PathVariable Long id){
        bookService.deleteBookById(id);

        return ResponseEntity.ok("book deleted");
    }
}
