package com.example.Diplom.SERVICE;

import com.example.Diplom.DTO.REQUEST.OrderRequest;
import com.example.Diplom.DTO.RESPONSE.OrderResponse;
import com.example.Diplom.ENT.Basket;
import com.example.Diplom.ENT.Order;
import com.example.Diplom.REPO.BasketRepo;
import com.example.Diplom.REPO.OrderRepo;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final BasketRepo basketRepo;
    private final OrderRepo orderRepo;
    private final ObjectMapper objectMapper;


    private Basket findBasket(OrderRequest orderRequest) {
        return basketRepo.findByCustomerId(orderRequest.getCustomerId());
    }


    public OrderResponse addOrder(OrderRequest orderRequest){
        Basket basket = findBasket(orderRequest);
        Order order = new Order();
        order.setCustomer(basket.getCustomer());
        order.setId(basket.getId());
        orderRepo.save(order);
        basketRepo.delete(basket);
        return objectMapper.convertValue(order,OrderResponse.class);
    }

}
