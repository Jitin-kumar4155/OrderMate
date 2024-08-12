package com.ordermate.orders.repository;

import com.ordermate.orders.entity.Inventory;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface InventoryRepository extends MongoRepository<Inventory, String>
{
}
