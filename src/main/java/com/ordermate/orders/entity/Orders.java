package com.ordermate.orders.entity;

import com.ordermate.orders.constants.OrderStatus;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


@Data
@Document ( collection = "orders" )
public class Orders implements Serializable
{
    @Id
    private String order_id;
    private List<Inventory> item_ids;
    private Date insert_time;
    private Date update_time;
    private OrderStatus order_status;
}
