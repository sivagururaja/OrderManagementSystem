package org.example;

import org.example.dto.Order;

public class Main {

    public static void main(String[] args) {
        OrderManagementSystem orderManagementSystem = new OrderManagementSystem();

        orderManagementSystem.printOrders();
        printEmptyLine();

        orderManagementSystem.addOrder(null);
        orderManagementSystem.printOrders();
        printEmptyLine();

        Order order = orderManagementSystem.getOrderById(1);
        orderManagementSystem.printOrder(order);
        printEmptyLine();

        orderManagementSystem.deleteOrderById(1);
        printEmptyLine();

        orderManagementSystem.updateOrderById(1, null);
        orderManagementSystem.printOrders();
        printEmptyLine();
    }

    private static void printEmptyLine() {
        System.out.println("=================");
        System.out.println();
    }
}
