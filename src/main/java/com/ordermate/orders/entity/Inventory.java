package com.ordermate.orders.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document ( "inventory" )
public class Inventory
{
    @Id
    private String item_id;
    private int quantity;
}
