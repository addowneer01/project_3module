package data.source.orderDataSource;


import data.model.Order;

import java.util.ArrayList;

public class orderDataSource {
    private final ArrayList<Order> orders;

    public orderDataSource() {
        this.orders = new ArrayList<>();
    }
    public void add(Order order){
        orders.add(order);
    }
    public void remove(int id){
        orders.remove(id-1);
    }
    public ArrayList<Order> getOrders() {
        return orders;
    }
}
