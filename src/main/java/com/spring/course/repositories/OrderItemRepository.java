package com.spring.course.repositories;

import com.spring.course.entities.OrderItem;
import com.spring.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
