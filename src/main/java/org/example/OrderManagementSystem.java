package org.example;

import lombok.Data;
import org.example.dto.Order;

@Data
public class OrderManagementSystem {

    public void printOrders() {
    }

    public void printOrder(Order order) {
    }

    public Order addOrder(Order order) {
        return null;
    }

    public Order getOrderById(int orderId) {
        return null;
    }

    public boolean deleteOrderById(int orderId) {
        return Boolean.FALSE;
    }

    public Order updateOrderById(int orderId, Order order) {
        return null;
    }
}