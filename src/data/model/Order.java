package data.model;

import data.source.cart.cartDataSource;

public class Order {
    final int number;
    final String address;
    final String client;
    final cartDataSource items;
    int sum = 0;

    @Override
    public String toString() {
        return "num: " + number + " | address: " + address + " | client: " + client + " | order amount: " + sum + "$ | items: " + items;
    }

    public Order(int number, String address, String client, cartDataSource items) {
        this.number = number;
        this.address = address;
        this.client = client;
        this.items = items;
        for(CartObject i:items.getItems()){
            sum += i.product.price*i.count;
        }
    }
}
