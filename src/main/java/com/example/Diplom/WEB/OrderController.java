package com.example.Diplom.WEB;

import com.example.Diplom.DTO.REQUEST.OrderRequest;
import com.example.Diplom.DTO.RESPONSE.BasketResponse;
import com.example.Diplom.DTO.RESPONSE.OrderResponse;
import com.example.Diplom.SERVICE.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor

public class OrderController {
    private final OrderService orderService;

        @PostMapping("/addOrder")
        public ResponseEntity<OrderResponse> addOrder(@RequestBody OrderRequest orderRequest){
            OrderResponse orderResponse = orderService.addOrder(orderRequest);

        return ResponseEntity.ok(orderResponse);
        }


}
