package com.ordermate.orders.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.ordermate.orders.constants.OrderStatus;
import com.ordermate.orders.entity.Inventory;
import lombok.Data;

import java.util.Date;
import java.util.List;


@Data
@JsonIgnoreProperties ( ignoreUnknown = true )
@JsonInclude ( JsonInclude.Include.NON_NULL )
public class OrdersVo
{
    private List<Inventory> item_ids;
    private Date insert_time;
    private Date update_time;
    private OrderStatus order_status;
}