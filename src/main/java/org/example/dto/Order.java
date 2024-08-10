package org.example.dto;

import lombok.Data;

import java.util.Date;

@Data
public class Order {
    private int orderId;
    private String orderItem;
    private Date orderDate;
    private Date deliveryDate;
    private int quantity;
}
