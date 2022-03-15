package com.example.Diplom.WEB;

import com.example.Diplom.DTO.REQUEST.BasketRequest;
import com.example.Diplom.DTO.REQUEST.BookRequest;
import com.example.Diplom.DTO.RESPONSE.BasketResponse;
import com.example.Diplom.SERVICE.BasketService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/basket")
@RequiredArgsConstructor

public class BasketController {
    private final BasketService basketService;


    @PostMapping("/addBook")
    public ResponseEntity<BasketResponse> addBook(@RequestBody BasketRequest basketRequest){
        BasketResponse basketResponse = basketService.addBook(basketRequest);

        return ResponseEntity.ok(basketResponse);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteBasket(@RequestBody BasketRequest basketRequest) {
        basketService.deleteBasket(basketRequest);

        return ResponseEntity.ok("Basket deleted");
    }
}
