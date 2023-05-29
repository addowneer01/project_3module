package view;

import data.model.*;
import data.source.cart.cartDataSource;
import data.source.catalog.catalogDataSource;
import data.source.orderDataSource.orderDataSource;

public class Out {

    public static void println(String str){
        System.out.println(str);
    }
    public static void printCatalog(catalogDataSource catalog){

        System.out.println("    Catalog");
        for (Product product : catalog.getProducts()){
            System.out.println(product);
        }
        System.out.println();
    }
    public static void printCart(cartDataSource cart){
        System.out.println("    Cart");
        for (CartObject cartObject : cart.getItems()){
            System.out.println(cartObject);
        }
        System.out.println();
    }
    public static void printOrders(orderDataSource orders){
        System.out.println("    Orders");
        for (Order order : orders.getOrders()){
            System.out.println(order);
        }
        System.out.println();
    }
}
