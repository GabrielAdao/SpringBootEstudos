package com.spring.course.services;

import com.spring.course.entities.Order;
import com.spring.course.entities.User;
import com.spring.course.repositories.OrderRepository;
import com.spring.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }
    public Order findById (Long id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}
