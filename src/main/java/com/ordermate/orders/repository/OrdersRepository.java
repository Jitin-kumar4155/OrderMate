package com.ordermate.orders.repository;

import com.ordermate.orders.entity.Orders;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OrdersRepository extends MongoRepository<Orders, String>
{
}
